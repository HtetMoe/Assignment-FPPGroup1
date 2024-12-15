package assignment4.Problem3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor{
    private String location;
    private String lastupdated;
    private double soundlevel;

    public SoundSensor(String location, String lastupdated, double soundlevel)
    {
        this.location = location;
        this.lastupdated = lastupdated;
        this.soundlevel = soundlevel;
    }
    @Override
    public String getLocation() {
        return this.location;
    }
    @Override
    public double getReading() {
        return this.soundlevel;
    }

    public String performAction(){
        String alert = null;
        if (this.soundlevel > 70){
            alert = "an alert to turn on noise cancellation";
        }
        else {
            alert = "Sound is within normal range";
        }
        return alert;
    }

    public String getSensorType(){
        return getClass().getSimpleName();
    }
    public String getLastUpdated(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        this.lastupdated = LocalTime.now().format(formatter);
        return this.lastupdated;
    }
}
