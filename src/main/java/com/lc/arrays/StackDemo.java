package com.lc.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        StackDS sd = new StackDS(5);
        //sd.push(10);
        /*sd.push(20);
        sd.push(30);
        sd.push(40);
        sd.push(50);
        sd.push(60);*/
        //sd.pop();
        //sd.pop();
        //sd.display();

        String name = "azhar";
        Stack<Character> chars = new Stack<>();
        for(char c:name.toCharArray())
            chars.push(c);
        while(chars.size()!=0){
            System.out.println(chars.pop());
        }
    }
}
class StackDS{
    public int top;
    public int capacity;
    public int[] stackArr = new int[capacity];
    StackDS(int capacity)
    {
        this.top = -1;
        this.capacity = capacity;
        //stackArr = new int[capacity];
    }
    public void push(int data){
        if(isFull()) {
            System.out.println("Stack Full");
            System.exit(-1);
        }
        stackArr[++top] = data;
    }
    public int pop(){
        if(top ==-1) {
            System.out.println("Stack Empty");
            System.exit(-1);
        }
        return stackArr[top--];
    }
    public boolean isFull(){
        return top+1==capacity;
    }
    public void display(){
        for(int i=0; i<=top; i++){
            System.out.println(stackArr[i]);
        }
    }
    @Override
    public String toString() {
        return "StackDS{" +
                "stackArr=" + Arrays.toString(stackArr) +
                '}';
    }
}
