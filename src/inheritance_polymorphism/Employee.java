package inheritance_polymorphism;

public class Employee extends Person {

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Harry Potter");
        employee.setAddress("1234 some st.");
        employee.setId("12434545646");
        employee.setSalary(50_000);
        employee.setGender("Male");
        employee.setPosition("Developer");
        employee.setDepartment("IT");
        System.out.println(employee);
    }


}