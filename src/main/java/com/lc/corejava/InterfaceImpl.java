package com.lc.corejava;

public class InterfaceImpl implements InterfaceDemo{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        InterfaceDemo id = new InterfaceImpl();
        InterfaceImpl.nestedclass in = new InterfaceImpl.nestedclass();
        //System.out.println(in.);
        System.out.println(id.add(5,6));
        System.out.println(id.multiply(3,4));
        System.out.println(InterfaceDemo.subtract(7,3));
    }

    static class nestedclass{
        {
            System.out.println("inner class");
        }
    }
}
