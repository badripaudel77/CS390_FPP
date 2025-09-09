package edu.miu.lab4.problem2;

public class SensorTest {
    public static void main(String[] args) {
        LightSensor ls = new LightSensor("Living room", 100);
        SoundSensor soundSensor = new SoundSensor("Back yard", 90);
        SoundSensor soundSensor2 = new SoundSensor("Living room", 50);
        TemperatureSensor temperatureSensor = new TemperatureSensor("Living room",  1);
        TemperatureSensor temperatureSensor2 = new TemperatureSensor("Living room",  90);

        SensorInterface[] arr = {ls, soundSensor, soundSensor2, temperatureSensor, temperatureSensor2};
        for(SensorInterface sensor : arr) {
            System.out.println(sensor.toString());
        }
    }
}
