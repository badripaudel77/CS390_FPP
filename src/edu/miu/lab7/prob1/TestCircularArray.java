package edu.miu.lab7.prob1;

public class TestCircularArray {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.dequeue();
        queue.dequeue();

        System.out.println("Current queue: " + queue.toString());
        System.out.println("Real array to check: " + queue.realArrayToString());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("Current queue: " + queue.toString());
        System.out.println("Real array to check: " + queue.realArrayToString());

        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(500);
        queue.enqueue(600);
        queue.enqueue(700);
        System.out.println("Current queue: " + queue.toString());
        System.out.println("Real array to check: " + queue.realArrayToString());

        System.out.println("Fill to empty to check circular array");
        queue.enqueue(800);
        queue.enqueue(900);
        queue.enqueue(1000);
        queue.enqueue(1100);
        queue.enqueue(1200);
        System.out.println("Current queue: " + queue.toString());
        System.out.println("Real array to check: " + queue.realArrayToString());




    }
}
