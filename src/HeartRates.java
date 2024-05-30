import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class HeartRates {


    private final int RHR = 70;
    private  final  double LB = 0.5 ; //(Assign as a Constant)
    private  final double UB = 0.85; // (Assign as a Constant)
    private String first_name;
    private String last_name;
    private LocalDate birthdate;

    public HeartRates (){
        first_name = null;
        last_name = null;
        birthdate = null;
    }
    public  HeartRates (String first_name, String last_name, LocalDate birthdate){
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthdate  = birthdate;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-dd");
    Scanner sc = new Scanner(System.in);
    public String getFirst_name() {
        System.out.println("Please Enter Your First Name: ");
        this.first_name = sc.nextLine();
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
        //System.out.println("First Name: " + this.first_name);
    }

    public String getLast_name() {
        System.out.println("Please Enter your Last name: ");
        last_name = sc.nextLine();
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
        //System.out.println("Last Name : " + this.last_name);
    }

    public LocalDate getBirthdate() {
        System.out.println("Enter you birthdate in the format yyyy-m-dd");
        String input = sc.nextLine();
        this.birthdate = LocalDate.parse(input, formatter);
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Period AgeCalculator (LocalDate birthdate){
        LocalDate today = LocalDate.now();
        return Period.between(birthdate, today);
    }
    // Return MHR
    public double MaxHeartRate(Period age){
        return 220 - age.getYears();
    }

    //Calculate Average Heart Rate (AHR) = MHR – RHR.
    public double AvgHeartRate (double MHR){
        return MHR - RHR;
    }

    //Lower Boundary Target Heart Rate (LBTHR)= (AHR*LB) + RHR,
    public double LBTHR (double AHR){
        return (AHR * LB) + RHR;
    }

    //Calculate Upper Boundary Target Heart Rate (UBTHR) = (AHR*UB) + RHR
    public double UBTHR (double AHR){
        return (AHR * UB) + RHR;
    }

    // method that calculates and prints the person’s target heart rate range.
    public void HRR (double UBTHR, double LBTHR){
        System.out.printf("The Target Heart Rate Range is Between %f and %f %n" , LBTHR, UBTHR);
    }
    public String toString(){
        return STR."""
        First Name : \{first_name}
        Last Name: \{last_name}
        Age : \{AgeCalculator(birthdate).getYears()}
        Date of Birth : \{birthdate}""";
    }
}
