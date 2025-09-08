package edu.miu.lab4.problem2;

import org.junit.platform.commons.util.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements SensorInterface {

    public TemperatureSensor() {

    }

    //Instance fields
    private String location;
    private LocalDateTime lastUpdated;
    private Integer temperature;

    public TemperatureSensor(String location,Integer temperature) {
        this.location = location;
        this.temperature = temperature;
    }


    @Override
    public String getSensorType() {
        return "Temperature Sensor";
    }

    @Override
    public double getReading() {
        return this.temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public LocalDateTime getLastUpdate() {
        this.lastUpdated = LocalDateTime.now();
        return this.lastUpdated;
    }

    /**
     * In TemparatureSensor, if the temperature reaches above 30 return “an alert to
     * turn on the AC”, if it reaches below 18 return “an alert to turn on the Heater”
     * otherwise “ Temperature is in normal range”
     *
     * @return
     */
    @Override
    public String performAction() {
        String rs = "";
        if (this.temperature > 30) {
            rs = "an alert to turn on the AC";
        } else if (this.temperature < 18) {
            rs = "an alert to turn on the Heater";
        } else {
            rs = "Temperature is in normal range";
        }
        return rs;
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
