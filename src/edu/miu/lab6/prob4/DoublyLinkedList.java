package edu.miu.lab6.prob4;

/**
 * @author Khanh
 */
public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    //1. adds to the end of the list
    public void addLast(String item) {
        //implement
        Node newNode = new Node();
        newNode.value = item;
        newNode.next = null;

        Node current = header;
        // go to the last node
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.previous = current;
    }

    // 2. Remove by passing object
    public boolean remove(String item) {
        //Implement
        if (item == null) return false;
        Node current = header.next;
        while (current != null) {
            if (item.equals(current.value)) {
                if (current.previous != null)
                    current.previous.next = current.next;
                if (current.next != null)
                    current.next.previous = current.previous;
                return true;
            }
            current = current.next;
        }
        return false; // not found

    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        // Implement
        if (header.next == null) return false;
        Node first = header.next;
        header.next = first.next;
        if (first.next != null) {
            first.next.previous = header;
        }
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {

        // Implement
        Node current = header;
        while (current.next != null) {
            current = current.next;
        }
        while (current != header) {
            System.out.print(current.value + " ");
            current = current.previous;
        }
        System.out.println();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) {
            //Khanh fixed format
            if(!sb.isEmpty()) {
                sb.append(" ").append(n.value);
            } else  {
                sb.append(n.value);
            }
        }
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("=========================");
        System.out.println("Problem 1: Add 3 elements");
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println("After added: " + list);
        System.out.println("=========================");
        System.out.println("Problem 2: Remove element by String: Harry");
        list.remove("Harry");
        System.out.println("After removed: " + list);
        System.out.println("========================");
        System.out.println("Problem 3: removeFirst()");
        list.removeFirst();
        System.out.println("After removed: " + list);
        System.out.println("=======================");
        System.out.println("Problem 4: printReverse()");
        list.addLast("Harry");
        list.addLast("Steve");
        list.addLast("Khanh");
        list.addLast("Badri");
        list.addLast("Devendra");
        System.out.println("Origin list (Added some elements to print reverse): \n" + list);
        list.printReverse();
        // Call all your implemented Methods
    }
}
