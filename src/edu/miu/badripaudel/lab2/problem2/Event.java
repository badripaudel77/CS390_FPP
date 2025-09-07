package edu.miu.badripaudel.lab2.problem2;

import java.time.ZonedDateTime;

public class Event {


    private String name;
    private ZonedDateTime eventDate;

    public Event() {
    }

    public Event(String name, ZonedDateTime eventDate) {
        this.name = name;
        this.eventDate = eventDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(ZonedDateTime eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", eventDate=" + eventDate +
                '}';
    }
}
