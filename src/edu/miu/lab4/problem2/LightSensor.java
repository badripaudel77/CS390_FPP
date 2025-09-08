package edu.miu.lab4.problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements SensorInterface {
    public LightSensor() {
    }

    public LightSensor(String location, int lightLevel) {
        this.location = location;
        this.lightlLevel = lightLevel;
    }

    //Instance fields
    private String location;
    private LocalDateTime lastUpdated;
    private Integer lightlLevel;

    @Override
    public String getSensorType() {
        return "Light Sensor";
    }

    @Override
    public double getReading() {
        return this.lightlLevel;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public LocalDateTime getLastUpdate() {
        this.lastUpdated = LocalDateTime.now();
        return this.lastUpdated;
    }


    /**
     * In LightSensor, if the lightlevel reaches below 100 return “an alert to turn on
     * the light”, else “ Light is sufficient”
     *
     * @return
     */
    @Override
    public String performAction() {
        return this.lightlLevel < 100 ? "an alert to turn on the light" : "Light is sufficient";
    }

    @Override
    public String toString() {
        return String.format("""
                    Sensor Type: %s
                    Reading: %f
                    Location: %s
                    Last Updated: %s
                    Action: %s
                """, this.getSensorType(), this.getReading(), this.getLocation()
                , this.getLastUpdate().format(DateTimeFormatter.ofPattern("HH:MM a")), this.performAction())
                ;
    }
}
