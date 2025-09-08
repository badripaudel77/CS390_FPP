package edu.miu.lab4.problem4;

public class WashingMachine extends HouseholdMachine {
    private final int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void performFunction() {
        System.out.println("Starting wash cycle with load capacity: " + loadCapacity + " kg.");
    }
}
