package assignment4.problem5;

public class TestMachine {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new WashingMachine(7);
        machines[1] = new Refrigerator(4);
        machines[2] = new Microwave(800);

        for (Machine machine : machines) {
            System.out.println(machine.getClass().getSimpleName());
            machine.performFunction();
            System.out.println();
        }
    }
}
