package assignment4.problem3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {
    private double temperature;
    private String location;
    private String lastUpdate;
    public TemperatureSensor(double temperature, String location, String lastUpdate) {
        this.temperature = temperature;
        this.location = location;
        this.lastUpdate = lastUpdate;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public double getReading(){
        return temperature;
    }
    @Override
    public String getLocation() {
        return location;
    }
    @Override
    public String getLastUpdate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm a");
        this.lastUpdate = LocalDateTime.now().format(dateTimeFormatter);
        return this.lastUpdate;
    }
    @Override
    public String performAction(){
        if (this.temperature > 30.0)
            return "an alert to turn on the AC";
        else if (this.temperature < 18.0)
            return "an alert to turn on the Heater";
        else
            return "Temperature is in normal range";
    }
    @Override
    public String getSensorType() {
        return getClass().getSimpleName();
    }
    @Override
    public String toString(){
        return toSensorString();
    }
}
