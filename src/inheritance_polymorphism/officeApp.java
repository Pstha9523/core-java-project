package inheritance_polymorphism;

public class officeApp {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Harry Potter");
        employee.setAddress("1234 some st.");
        employee.setId("12434545646");
        employee.setSalary(50_000);
        employee.setGender("Male");
        employee.setPosition("Developer");

        Manager manager = new Manager();
        manager.setName("Severus Snape");
        manager.setSalary(80_000);
        manager.setBonus(2000);

        Director director = new Director();
        director.setName("Albus Dumbledore");
        director.setSharePercentage(1.2f);
        director.setPosition("Director");
        director.setSalary(110_000);



    }
}
