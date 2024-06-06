package assignment4.problem3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    private double soundLevel;
    private String location;
    private String lastUpdate;
    public SoundSensor(double soundLevel, String location, String lastUpdate) {
        this.soundLevel = soundLevel;
        this.location = location;
        this.lastUpdate = lastUpdate;
    }
    public void setSoundLevel(double soundLevel) {
        this.soundLevel = soundLevel;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public double getReading() {
        return soundLevel;
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
        if (this.soundLevel < 70.0)
            return "an alert to turn on noise cancellation";
        return "Sound is within normal range";
    }
    @Override
    public String getSensorType(){
        return getClass().getSimpleName();
    }
    @Override
    public String toString(){
        return toSensorString();
    }
}
