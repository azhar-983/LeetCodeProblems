package com.lc.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class MyException extends Exception{
    FileChannel file;
    private void getFileContent()
    {
        try {
            file = new FileInputStream("abc.txt").getChannel();
            System.out.println("read file successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private int divide(int a, int b) throws ArithmeticException{
        try {
            return a/b;
        }catch (ArithmeticException ae){
            System.out.println("in catch block");
        } finally {
            System.out.println("in finally block");
        }
        return -1;
    }

    public static void main(String[] args) {
        MyException me = new MyException();
        me.getFileContent();
        System.out.println(me.divide(4,0));
    }
}
