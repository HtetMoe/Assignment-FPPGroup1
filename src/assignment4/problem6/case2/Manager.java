package assignment4.problem6.case2;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double bonus) {
        super(name, id);
        this.bonus = bonus;
    }

    //same class strategy
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        Manager manager = (Manager) obj;
        return manager.getName().equals(getName()) && manager.getId() == getId() && manager.getBonus() == getBonus();
    }

    public double getBonus() {
        return bonus;
    }
}

