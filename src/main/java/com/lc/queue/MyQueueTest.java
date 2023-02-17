package com.lc.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueueTest {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    
	}

}
class MyQueue{
	List<Integer> data;
	int start;
	MyQueue(){
		data = new ArrayList<>();
		start = 0;
	}
	public boolean enQueue(int val) {
		data.add(val);
		return true;
	}
	public boolean deQueue() {
		if(isEmpty() == true) {
			return false;
		}
		start++;
		return true;
	}
	public boolean isEmpty() {
		
		return start >= data.size();
	}
	public int Front() {
		return data.get(start);
	}
	
}
