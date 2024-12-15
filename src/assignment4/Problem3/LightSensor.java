package assignment4.Problem3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor{
    private String location;
    private String lastupdated;
    private double lightlevel;

    public LightSensor(String location, String lastupdated, double lightlevel){
        this.location = location;
        this.lastupdated = lastupdated;
        this.lightlevel = lightlevel;
    }
    @Override
    public String getLocation() {
        return this.location;
    }

    public double getLightlevel() {
        return this.lightlevel;
    }
    @Override
    public double getReading (){

        return this.getLightlevel();
    }

    public  String performAction(){
        String alert = null;
        if (this.lightlevel < 100) {
            alert = "an alert to turn on the ligh";}
        else {
            alert = "Light is sufficient";
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
