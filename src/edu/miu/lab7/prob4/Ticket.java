package edu.miu.lab7.prob4;

/**
 * Problem:  Queue API - Customer Service Ticketing System
 * @author Badri Paudel
 */

public class Ticket {
    private final int id;
    private final String description;


    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
