package inheritance_polymorphism;

import java.util.List;

public sealed class Manager extends Employee permits Director{
    private double bonus;
    private String department;
    private List <Employee> tree;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Employee> getTree() {
        return tree;
    }

    public void setTree(List<Employee> tree) {
        this.tree = tree;
    }

    public static void main(String[] args) {

    }
}
