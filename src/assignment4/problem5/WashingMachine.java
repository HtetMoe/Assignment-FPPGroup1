package assignment4.problem5;

public class WashingMachine implements Machine {
    private int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void performFunction() {
        System.out.println(STR."Starting wash cycle with load capacity: \{loadCapacity} kg.");
    }
}
