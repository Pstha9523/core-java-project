package inheritance_polymorphism;

public class officeApp {

    public static void main(String[] args) {

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
