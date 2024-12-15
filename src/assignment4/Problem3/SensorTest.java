package assignment4.Problem3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SensorTest {
    public static void main(String[] args) {


        String location = null, type = null, readingOutput = null, lastUpdateddate = null, action = null;
        LocalDate lastUpdated = null;

        //  DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss");
        // LocalDateTime dateTime = LocalDateTime.parse(LocalDate.now(), inputFormatter);

        Sensor [] sensors = {
                new TemparatureSensor("Kitchen", LocalTime.now().toString(), 60),
                new LightSensor("Garden", LocalTime.now().toString(), 50),
                new SoundSensor ("Living Room", LocalTime.now().toString(), 90),
                new SoundSensor ("Bedroom", LocalTime.now().toString(), 40),
                new TemparatureSensor("Bathroom", LocalTime.now().toString(), 18)
        };

        for (Sensor s: sensors){
            type = STR."""
                    Type : \{s.getSensorType()}
                    """;
            System.out.println(type);
            readingOutput = STR."""
                    Reading : \{s.getReading()}
                    """;
            System.out.println(readingOutput);
            location = STR."""
                    Location : \{s.getLocation()}
                    """;
            System.out.println(location);
            lastUpdateddate = STR."""
                    Last Updated : \{s.getLastUpdated()}
                    """;
            System.out.println(lastUpdateddate);
            action = STR."""
                    Action : \{s.performAction()}
                    """;
            System.out.println(action);
        }
    }
}

