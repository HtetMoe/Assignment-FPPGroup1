package assignment2.problem3;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EventHandler {
    public static void main(String[] args) {
        final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        final DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
        Scanner scanner = new Scanner(System.in);

        //event name
        System.out.println("Enter the event name : ");
        String name = scanner.nextLine();

        //event date
        System.out.println("Enter the date of events in mm/dd/yyyy format : ");
        LocalDate date;
        while (true) {
            try {
                date = LocalDate.parse(scanner.nextLine(), dateFormat);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format, please try again");
            }
        }

        //event time
        System.out.println("Enter the time of events in hh:mm format");
        LocalTime time;
        while (true) {
            try {
                time = LocalTime.parse(scanner.nextLine(), timeFormat);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid time format, please try again");
            }
        }

        //time zone
        System.out.println("Enter the time zone in this format - country/city format Eg.America/Phoenix ");
        ZoneId zone;
        while (true) {
            try {
                zone = ZoneId.of(scanner.nextLine()); //America/Phoenix
                break;
            } catch (DateTimeException e) {
                System.out.println("Invalid Zone format, please try again");
            }
        }
        scanner.close();

        Event event = new Event(name, date, time, zone);
        event.checkEventTime();
        //ev.showEventDate();
        System.out.println(event);
        event.showEventDateTimeInSpecificTimeZone();
    }
}
