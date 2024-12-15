package assignment4.problem5;

public class Microwave implements Machine{
    private int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String heatFood() {
        return STR."Heating food at power level: \{powerLevel}.";
    }

    @Override
    public void performFunction() {
        System.out.println(this.heatFood());
    }
}
