package assignment2.Problem2;

import java.time.LocalDate;
import java.time.Period;

public class TestHeartRates {
    public static void main(String[] args) {
        //assignment2.Problem2.HeartRates hr = new assignment2.Problem2.HeartRates("Asmaa", "Hesham", LocalDate.of(1993, 06, 24));
        HeartRates hr = new HeartRates();
        String firstName = hr.getFirst_name();
        hr.setFirst_name(firstName);

        String lastName = hr.getLast_name();
        hr.setLast_name(lastName);

        LocalDate birthdate = hr.getBirthdate();
        hr.setBirthdate(birthdate);

        Period Age = hr.AgeCalculator(birthdate);
        double maxHeartRate = hr.MaxHeartRate(Age);
        double avgHeartRate = hr.AvgHeartRate(maxHeartRate);
        double lowerBound = hr.LBTHR(avgHeartRate);
        double uberBound = hr.UBTHR(avgHeartRate);
        hr.HRR(lowerBound, uberBound);

        String str = hr.toString();
        System.out.println(str);
        System.out.println("Maximum Heart Rate: " + maxHeartRate);
    }
}
