package edu.miu.lab2.problem3;

public record FlightBooking(String origin, String destination, double distanceKm) {
    public FlightBooking {
        if (origin == null || destination == null || distanceKm <1.0) {
            throw new IllegalArgumentException("One or more inputs not valid.");
        }
    }

    public double computeFlightTime(double avgSpeed) {
        return distanceKm / avgSpeed;
    }
}
