package edu.miu.lab7.prob1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 2;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    // Add Constructors, Default and Parameterized to initialize instance fields

    ArrayQueueImpl() {
        arr = new Integer[DEFAULT_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    public Integer peek() {
        //implement
        if(isEmpty()) return null;
        return arr[front];
    }

    public void enqueue(int obj) {
        //implement
        if(isFull()){
            System.out.println("Queue is full. resizing");
            resize();
        }
        System.out.println("+Enqueued: " + obj + " at " + rear);
        arr[rear] = obj;
        rear = (rear + 1) % arr.length;
        size++;
    }

    private boolean isFull() {
        return  size == arr.length;
    }

    public Integer dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to dequeue.");
            return null;
        }
        final int tmp = peek();
        System.out.println("-Dequeued: " + tmp + " at " + front);
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return tmp;
    }

    public boolean isEmpty() {
        //implement
        return size == 0;
    }

    public int size() {
        //implement
        return size;
    }

    private void resize() {
        //implement
        int newCapacity = arr.length * 2;
        Integer[] newArr = new Integer[newCapacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }
        arr = newArr;
        front = 0;
        rear = size;
    }

    public String toString() {
        /* Return data in this format, each element separated by comma with in [ ] eg:
        [10, 20, 30, 40, 50, 60 ]*/
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[(front + i) % arr.length]);
            if (i != size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public String realArrayToString() {
        return  Arrays.toString(arr);
    }
}
