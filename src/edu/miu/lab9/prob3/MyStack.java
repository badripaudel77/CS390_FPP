package edu.miu.lab9.prob3;

public class MyStack {
    private Integer[] data;
    private int top;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.data = new Integer[capacity];
        this.top = -1; // empty
    }

    // Push element to stack (no checks yet)
    public void push(Integer item) {
        top++;
        data[top] = item;
    }

    // Pop element from stack (no checks yet)
    public Integer pop() {
        Integer item = data[top];
        top--;
        return item;
    }

    // Peek top element (no checks yet)
    public Integer peek() {
        return data[top];
    }

    // Is stack empty?
    public boolean isEmpty() {
        return top == -1;
    }

    // Is stack full?
    public boolean isFull() {
        return top == capacity - 1;
    }
    // Return the number of elements in the stack
    public int size() {
        return top + 1;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(data[i]);
            if (i < top) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
