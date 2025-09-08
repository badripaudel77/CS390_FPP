package edu.miu.lab4.problem4;

public class Microwave implements HouseholdMachine {
    private final int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String heatFood() {
        return "Heating food at power level: " + powerLevel + ".";
    }

    @Override
    public void performFunction() {
        System.out.println("Heating food at power level: " + powerLevel + ".");
    }
}
