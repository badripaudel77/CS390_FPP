package edu.miu.lab7.prob4;

// The class that manages the ticket queue.

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> ticketQueue;

    public TicketingSystem() {
        this.ticketQueue = new LinkedList<>();
    }

    // This method should add a new ticket to the queue with a unique ID and the provided description.
    public void addTicket(String description) {
        int ticketId = (int) (Math.random() * 999999);

        Ticket newTicket = new Ticket(ticketId, description);
        this.ticketQueue.add(newTicket);
    }

    // This method should process (remove and return) the ticket at the front of the queue.
    public Ticket processTicket() {
        Ticket processedTicket = this.ticketQueue.poll();
        System.out.println("First ticket processed with ID " + (processedTicket != null ? processedTicket.getId() : -1) + " and message : " + (processedTicket != null ? processedTicket.getDescription() : "NA"));
        return processedTicket;
    }

    public Ticket viewNextTicket() {
        Ticket nextTicket = this.ticketQueue.peek();
        System.out.println("Next ticket to be processed is with ID : " + (nextTicket != null ? nextTicket.getId() : -1) + " and message : " + (nextTicket != null ? nextTicket.getDescription() : "NA"));
        return nextTicket;
    }

}
