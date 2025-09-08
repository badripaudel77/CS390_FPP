package edu.miu.lab4.problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements SensorInterface {
    public SoundSensor() {

    }

    //Instance fields
    private String location;
    private LocalDateTime lastUpdated;
    private Integer soundLevel;

    public SoundSensor(String backYard, Integer soundLevel) {
        this.location = backYard;
        this.soundLevel = soundLevel;
    }

    @Override
    public String getSensorType() {
        return "Sound Sensor";
    }

    @Override
    public double getReading() {
        return this.soundLevel;
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
     * In SoundSensor, if the sound level reaches above 70 return “an alert to turn on
     * noise cancellation”, else “ Sound is within normal range”
     *
     * @return
     */
    @Override
    public String performAction() {
        return this.soundLevel > 70 ? "an alert to turn on noise cancellation" : "Sound is within normal ranges";
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
