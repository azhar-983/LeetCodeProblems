package com.lc.corejava;

@FunctionalInterface
public interface InterfaceDemo {
    public int add(int a, int b);

    default int multiply(int a, int b){
        return a*b;
    }
    static int subtract(int a, int b){
        return a-b;
    }
}
