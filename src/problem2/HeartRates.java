package problem2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {

    public static final int MAX_RATE = 220;
    public static final double LB = 0.5;
    public static final double UB = 0.85;
    public static final double RHR = 70.0;

    private String firstName;
    private String lastName;
    private LocalDate birthDate;


    public HeartRates(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);
        return period.getYears();
    }
    public int getMaxiHeartRage() {
        return MAX_RATE - getAge();
    }

    public double getAverageHeartRage() {
        return getMaxiHeartRage() - RHR;
    }

    public void showTargetHeartRage(){
        double ahr = getAverageHeartRage();
        double lbthr = ahr*LB + RHR;
        double ubthr = ahr*UB + RHR;
        System.out.println("The target heart rage is between " + lbthr + " and " + ubthr);
    }

    @Override
    public String toString() {
        String info;
        info = String.format("""
            First Name: %s
            Last Name: %s
            Birth Date: %s
            Maximum Heart Rage: %s
            """,
                firstName,
                lastName,
                birthDate,
                getMaxiHeartRage()
                );
        return info;
    }

}
