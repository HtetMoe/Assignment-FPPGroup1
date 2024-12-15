package assignment2.Problem2;

import java.time.LocalDate;
import java.time.Period;

public class TestHeartRates {
    public static void main(String[] args) {
        HeartRates hr = new HeartRates();

        //first name
        String firstName = hr.getFirst_name();
        hr.setFirst_name(firstName);

        //last name
        String lastName = hr.getLast_name();
        hr.setLast_name(lastName);

        //birthdate
        LocalDate birthdate = hr.getBirthdate();
        hr.setBirthdate(birthdate);

        //a.age
        Period Age = hr.AgeCalculator(birthdate);

        //b.max heart rate
        double maxHeartRate = hr.MaxHeartRate(Age);

        //avg heart rate
        double avgHeartRate = hr.AvgHeartRate(maxHeartRate);

        double lowerBound = hr.LBTHR(avgHeartRate);
        double uberBound = hr.UBTHR(avgHeartRate);

        //c. target heart rage
        hr.HRR(lowerBound, uberBound);

        //d. override the toString method
        System.out.println(hr.toString(maxHeartRate));

    }
}
