package edu.miu.lab7.prob4;

// Main class / method for testing all the actions.

public class Test {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();

        System.out.println("1. Initializing and adding tickets...");
        ticketingSystem.addTicket("Book the flight to Chicago");
        ticketingSystem.addTicket("Book Car to Cedar Rapids");
        ticketingSystem.addTicket("Send the confirmation");
        ticketingSystem.addTicket("Check-in online notification");

        System.out.println("Queue size after adding tickets: " + ticketingSystem.getQueueSize());

        System.out.println("\n2. Displaying all tickets...");
        ticketingSystem.displayAllTickets();

        System.out.println("3. Processing tickets...");
        ticketingSystem.processTicket();
        ticketingSystem.processTicket();
        System.out.println("Queue size after processing: " + ticketingSystem.getQueueSize());

        System.out.println("\n4. Viewing the next ticket...");
        ticketingSystem.viewNextTicket();

        System.out.println("\n5. Searching for a ticket...");

        int searchId = 4;
        ticketingSystem.searchTicket(searchId);

        System.out.println("\n6. Clearing the queue...");
        ticketingSystem.clearQueue();

        System.out.println("Queue size after clearing: " + ticketingSystem.getQueueSize());
        ticketingSystem.displayAllTickets();
    }
}
