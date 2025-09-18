package edu.miu.lab7.prob4;

// The class that manages the ticket queue.

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> ticketQueue;

    private int nextTicketId;

    public TicketingSystem() {
        this.ticketQueue = new LinkedList<>();
        this.nextTicketId = 1;
    }

    // This method should add a new ticket to the queue with a unique ID and the provided description.
    public void addTicket(String description) {
        Ticket newTicket = new Ticket(this.nextTicketId++, description);
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

    public int getQueueSize() {
        return this.ticketQueue.size();
    }

    public void clearQueue() {
        this.ticketQueue.clear();
        System.out.println("The ticket queue has been cleared.");
    }

    public void displayAllTickets() {
        System.out.println("\n--- Current Tickets in the Queue ---");
        if (this.ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
        } else {
            for (Ticket ticket : this.ticketQueue) {
                System.out.println(ticket);
            }
        }
        System.out.println("------------------------------------\n");
    }

    public Ticket searchTicket(int ticketId) {
        for (Ticket ticket : this.ticketQueue) {
            if (ticket.getId() == ticketId) {
                System.out.println("Found ticket with ID " + ticketId + ".");
                System.out.println(ticket);
                System.out.println("------------------------------------\n");
                return ticket;
            }
        }
        System.out.println("Ticket with ID " + ticketId + " not found.");
        System.out.println("------------------------------------\n");
        return null;
    }
}
