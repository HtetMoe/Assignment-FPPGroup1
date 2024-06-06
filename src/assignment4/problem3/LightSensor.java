package assignment4.problem3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor{
    private String location;
    private String lastUpdate;
    private double lightLevel;
    public LightSensor(double lightLevel, String location, String lastUpdate) {
        this.location = location;
        this.lastUpdate = lastUpdate;
        this.lightLevel = lightLevel;
    }

    public void setLightLevel(double lightLevel) {
        this.lightLevel = lightLevel;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public double getReading() {
        return this.lightLevel;
    }
    @Override
    public String getSensorType() {
        return "LightSensor";
    }
    @Override
    public String getLocation() {
        return this.location;
    }
    @Override
    public String getLastUpdate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm a");
        this.lastUpdate = LocalDateTime.now().format(formatter);
        return this.lastUpdate;
    }
    @Override
    public String performAction(){
        if(this.lightLevel < 100.0)
            return "an alert to turn on the light";
        return "Light is sufficient";
    }
    /*
    @Override
    public String toString(){
        return String.format("""
                Sensor Type: %s
                Reading: %.2f
                Location: %s
                Last Updated: %s
                Action: %s
                """,
                getClass().getSimpleName(),
                getReading(),
                getLocation(),
                getLastUpdate(),
                performAction());
    }
    */
    @Override
    public String toString(){
        return toSensorString();
    }
}
