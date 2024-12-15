package assignment4.Problem3;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Sensor {
    public String getSensorType();
    public double getReading ();
    public String getLocation ();
    public String performAction();

    public String getLastUpdated();

}
