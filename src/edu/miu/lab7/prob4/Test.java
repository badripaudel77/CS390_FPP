package edu.miu.lab7.prob4;

// Main class / method for testing all the actions.

public class Test {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem = new TicketingSystem();

        ticketingSystem.addTicket("Book the flight to Chicago");
        ticketingSystem.addTicket("Book Car to Cedar Rapids");
        ticketingSystem.addTicket("Send the confirmation");

        ticketingSystem.processTicket();
        ticketingSystem.processTicket();

        ticketingSystem.viewNextTicket();
    }
}
