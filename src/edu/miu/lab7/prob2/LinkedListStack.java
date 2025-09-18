package edu.miu.lab7.prob2;

/**
 * Problem 2 [User Defined Stack using Linked list] - Singly Linked List
 *
 * @author Badri Paudel
 * Members(Group 5) : Badri & Khanh
 */
public class LinkedListStack {
    private Node top;
    private int size;

    public LinkedListStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(Integer data) {
        if (data == null) {
            return;
        }
        System.out.println("Adding " + data + " to the stack.");
        Node node = new Node(data);
        node.next = top;
        this.top = node;
        size++;
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        Node node = this.top;
        System.out.println("Popping the element off the stack : " + node.data);
        top = this.top.next;
        size--;
        return node.data;
    }

    public Integer peek() {
        return isEmpty() ? null : this.top.data;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public int size() {
        System.out.println("Current size of the stack : " + size);
        return size;
    }

    @Override
    public String toString() {
        //Check null
        if (isEmpty() || size == 0) {
            return "[]";
        }
        StringBuilder stackData = new StringBuilder("[");
        System.out.println("Printing the stack : ");
        Node temp = this.top;
        while (temp != null) {
            stackData.append(temp.data);
            if (temp.next != null) {
                stackData.append(" -> ");
            }
            temp = temp.next;
        }
        stackData.append("]");
        return stackData.toString();
    }

    class Node {
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();

        System.out.println(linkedListStack);

        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);

        linkedListStack.size();

        System.out.println(linkedListStack);

        Integer peeked = linkedListStack.peek();
        System.out.println("Peek the element : " + peeked);

        Integer poppedItem = linkedListStack.pop();
        System.out.println("Item " + poppedItem + " removed from the stack.");

        System.out.println(linkedListStack);
    }
}
