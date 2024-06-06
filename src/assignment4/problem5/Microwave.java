package assignment4.problem5;

public class Microwave extends Appliance {
    private int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String heatFood() {
        return "Heating food at power level: " + powerLevel + ".";
    }
    public void performFunction() {
        System.out.println("Heating food at power level: " + powerLevel + ".");
    }
}
