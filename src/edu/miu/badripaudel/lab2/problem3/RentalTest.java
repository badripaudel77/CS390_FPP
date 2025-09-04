package edu.miu.badripaudel.lab2.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Badri Paudel
 * @since 9/3/2025
 * <p>This is the assignment for lab 2, FPP course, MIU, IA</p>
 * Program name: <b>“Problem 3: Immutable & Record class”</b>
 * <p> Members: Badri Paudel & Nguyen Khanh Tran </p>
 */

public class RentalTest {
    private static void proceedForFlightBooking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Flight Origin : ");
        String origin = sc.nextLine();
        System.out.println("Enter Flight Destination : ");
        String destination = sc.nextLine();
        System.out.println("Enter Distance(in KM) : ");
        double distance = sc.nextDouble();
        System.out.println("Enter the average speed ");
        double speed = sc.nextDouble();

        FlightBooking flightBooking = new FlightBooking(origin, destination, distance);
        double flightTime = flightBooking.computeFlightTime(speed);

        System.out.printf("Estimated Flight time %.2f hours.\n", flightTime);
    }

    private static void proceedForHotelBooking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hotel Name : ");
        String hotelName = sc.nextLine();
        System.out.println("Enter Number of Nights to stay : ");
        int numberOfNights = sc.nextInt();
        System.out.println("Enter Price Per Night : ");
        double pricePerNight = sc.nextDouble();

        HotelBooking hotelBooking = new HotelBooking(hotelName, numberOfNights, pricePerNight);
        double totalCost = hotelBooking.totalCost();

        System.out.printf("Total Hotel Cost %.2f\n", totalCost);
    }

    private static void proceedForCarRental() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Model : ");
        String carModel = sc.nextLine();
        System.out.println("Enter Number of Days to rent : ");
        int numberOfDaysToRent = sc.nextInt();
        System.out.println("Enter Rate Per Day : ");
        double pricePerDay = sc.nextDouble();
        System.out.println("Enter miles per day to ride : ");
        double milesPerDay = sc.nextDouble();

        CarRental carRental = new CarRental(carModel, numberOfDaysToRent, pricePerDay, milesPerDay);
        System.out.printf("""
                        Total Rental Cost : %.2f
                        Total miles : %.2f
                        """,
                 carRental.totalRentalCost(), carRental.totalMilesAllowed());
    }

    public static void main(String[] args) throws IOException {
        boolean isExit = false;
        do {
            System.out.println("""
                Enter F for Flight Booking
                Enter H for Hotel Booking
                Enter C for Car Rental
                """);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            char c = (char) reader.read();
            c = Character.toUpperCase(c);
            switch (Character.toUpperCase(c)) {
                case 'F' -> {
                    proceedForFlightBooking();
                }
                case 'H' -> {
                    proceedForHotelBooking();
                }
                case 'C' -> {
                   proceedForCarRental();
                }
                default -> throw new IllegalStateException("Unexpected value: " + Character.toUpperCase(c));
            }
            char cont;
            do {
                System.out.println("Do you want to continue (y/n)");
                BufferedReader option = new BufferedReader(new InputStreamReader(System.in));

                cont = (char) option.read();
                cont = Character.toUpperCase(cont);
            }
            while (cont != 'Y' && cont != 'N');

            if((cont == 'N')) {
                isExit = true;
                System.out.println("Thank you for letting us serve you !");
            }
        }
        while(!isExit);
    }
}
