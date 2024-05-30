package problem2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class eventHandle {
    public static void main(String[] args) {
        final DateTimeFormatter  dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        final DateTimeFormatter  timeFormat = DateTimeFormatter.ofPattern("HH:mm");
        final

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the date of events in mm/dd/yyyy format");
        LocalDate date;
        while(true){
            try{
                date = LocalDate.parse(sc.nextLine(), dateFormat);
                break;
            }catch (DateTimeParseException e){
                System.out.println("Invalid date format, please try again");
            }
        }
        System.out.println("Enter the time of events in hh:mm format");
        LocalTime time;
        while(true){
            try{
                time = LocalTime.parse(sc.nextLine(), timeFormat);
                break;
            }catch (DateTimeParseException e){
                System.out.println("Invalid time format, please try again");
            }
        }
        System.out.println("Enter the time zone in country/city format");
        ZoneId zone;
        while(true){
            try{
                //America/Phoenix
                zone = ZoneId.of(sc.nextLine());
                break;
            }catch (DateTimeException e){
                System.out.println("Invalid Zone format, please try again");
            }
        }
        sc.close();

        event ev = new event(name, date, time, zone);
        ev.checkEventTime();
        //ev.showEventDate();
        System.out.println(ev);
        ev.showEventDateTimeInSpecificTimeZone();

    }
}
