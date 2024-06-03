package assignment4.problem5;

public class Refrigerator implements Machine {
    private int temperature;

    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void performFunction() {
        System.out.println(STR."Cooling items at temperature : \{this.temperature}°C.");
    }
}
