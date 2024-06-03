package assignment4.Problem3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemparatureSensor implements Sensor{
    private String location;
    private String lastupdated;
    private double temperature;


    public TemparatureSensor (String location, String lastupdated, double temperature){
        this.location = location;
        this.lastupdated = lastupdated;
        this.temperature = temperature;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    public double getReading (){
        return this.temperature;
    }
    public  String performAction(){
        String alert = null;
        if (this.temperature > 30) {
            alert = "an alert to turn on the AC";}
        else if (this.temperature < 18) {
            alert = "an alert to turn on the Heater";
        } else {
            alert = "Temperature is in normal range";
        }
        return alert;
    }

    public String getSensorType(){
        return getClass().getSimpleName();
    }

    public String  getLastUpdated(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        this.lastupdated = LocalTime.now().format(formatter);
        return this.lastupdated;
    }


}
