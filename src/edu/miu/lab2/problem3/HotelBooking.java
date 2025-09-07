package edu.miu.lab2.problem3;

public record HotelBooking(String hotelName, int nights, double pricePerNight) {
    // Get the price per night.
    public double totalCost() {
        return nights * pricePerNight;
    }
}
