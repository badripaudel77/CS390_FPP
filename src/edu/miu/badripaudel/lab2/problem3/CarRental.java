package edu.miu.badripaudel.lab2.problem3;

public class CarRental {
    private final String carModel;
    private final int days;
    private final double ratePerDay;
    private final double milesPerDay;

    public CarRental(String carModel, int days, double ratePerDay, double milesPerDay) {
        if(carModel == null || days < 1) {
            throw new IllegalArgumentException("Invalid Input");
        }
        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public String getCarModel() {
        return carModel;
    }

    public double totalRentalCost() {
        return days * ratePerDay;
    }
    public double totalMilesAllowed() {
        return days * milesPerDay;
    }
}
