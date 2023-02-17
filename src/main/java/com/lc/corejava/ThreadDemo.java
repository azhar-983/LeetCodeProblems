package com.lc.corejava;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo implements Runnable {

    AtomicInteger ai = new AtomicInteger();
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is message #" + i);
            ai.incrementAndGet();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                // do nothing
            }
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t1 = new Thread(new ThreadDemo());
        t1.start();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {

                try {
                    t1.join();
                    System.out.println("via anonymous inner class");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t2 = new Thread(r2);
        t2.start();


        Runnable r3 = () -> {
            try {
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("via lambda expression");
        };

        Thread t3 = new Thread(r3);
        t3.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return "Result";
            }
        });
        System.out.println(future.get());
        executorService.shutdown();

        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        executorService1.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("via Executor service fixed thread pool");
            }
        });
        executorService1.shutdown();
        ExecutorService executorService2 = Executors.newScheduledThreadPool(10);
        executorService2.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("via Executor service scheduled thread pool");
            }
        });
        executorService2.shutdown();

    }
}