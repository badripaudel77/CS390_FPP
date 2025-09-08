package edu.miu.lab4.problem2;

import java.time.LocalDateTime;

/**
 * SensorInterface
 * @author Nguyen Khanh Tran
 */
public interface SensorInterface {
    /**
     * getSensorType() – Return the name of the Sensor
     * @return nameOfTheSensor String
     */
    public String getSensorType();

    /**
     * getReading() – Return the sensor data in double
     * @return data double
     */
    public double getReading();

    /**
     * getLocation() – Return the Home location where sensor deployed. [ Garden,
     * Kitchen, etc.,]
     * @return location String
     */
    public String getLocation();

    /**
     * getLastUpdated() – Return the system current time.
     * @return system current time LocalDateTime
     */
    public LocalDateTime getLastUpdate();

    /**
     * String performAction(); - Return the action taken based on the Sensor alert
     * @return action String
     */
    public String performAction();
}
