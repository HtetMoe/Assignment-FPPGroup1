package problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Please, enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Please, enter your birth date in the format YYYY-MM-DD");
        LocalDate birthDate;
        while(true)
        {
            try{
                birthDate = LocalDate.parse(scanner.nextLine(), dateFormat);
                break;
            }catch(DateTimeParseException e){
                System.out.println("Invalid date, try again");
            }
        }
        scanner.close();
        HeartRates hr = new HeartRates(firstName, lastName, birthDate);
        hr.showTargetHeartRage();
        System.out.println(hr);
    }
}
