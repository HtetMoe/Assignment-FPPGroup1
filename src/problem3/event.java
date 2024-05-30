package problem2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class event {
    private String name;
    private LocalDate date;
    private LocalTime time;
    private LocalDateTime dateTime;
    private ZoneId zone;

    event(String name, LocalDate date, LocalTime time, ZoneId zone) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.dateTime = LocalDateTime.of(date, time);
        this.zone = zone;
    }

    public void checkEventTime() {
        if(date.isLeapYear())
            System.out.println( date.getYear() + " is a leap year.");
        else
            System.out.println( date.getYear() + " is not a leap year.");
        long days = ChronoUnit.DAYS.between(LocalDate.now(), date);
        System.out.println("The event will start on " + date.getDayOfWeek() + ", with " + days + " days left.");
    }
    @Override
    public String toString() {
        return date.getDayOfWeek() + ", "  + date.getMonth() + " " + date.getDayOfMonth() + ", " + date.getYear() + " @ " + time + " [" + ZoneId.systemDefault() + "]";
    }

    public void showEventDate(){
        System.out.println(date.getDayOfWeek() + ", "  + date.getMonth() + " " + date.getDayOfMonth() + ", " + date.getYear() + " @ " + time + " [" + ZoneId.systemDefault() + "]");
    }

    public void showEventDateTimeInSpecificTimeZone(){
        ZonedDateTime originalZoneDateTime = dateTime.atZone(ZoneId.systemDefault());
        ZonedDateTime newZoneDateTime = originalZoneDateTime.withZoneSameInstant(zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm MM/dd/yyyy");
        String formattedDateTime = formatter.format(newZoneDateTime);
        System.out.println("Event will start at " + formattedDateTime + " in " + zone + " time zone");
    }

}
