package himalayanTimes;
public class HimalayanTimesApplication {

    public static void main (String[]args){

        Category home = new Category();
        home.setCategoryId(1);
        home.setCategoryName("Home");

        Category kathmandu = new Category();
        kathmandu.setCategoryId(2);
        kathmandu.setCategoryName("Kathmandu");

        Category nepal = new Category();
        nepal.setCategoryId(3);
        nepal.setCategoryName("Nepal");

        Category covid19 = new Category();
        covid19.setCategoryId(4);
        covid19.setCategoryName("Covid-19");

        Category covidConnect = new Category();
        covidConnect.setCategoryName("Covid Connect");

        Category world = new Category();
        Category opinion = new Category();
        Category business = new Category();
        Category sports = new Category();
        Category entertainment = new Category();
        Category lifestyle = new Category();
        Category scienceTech = new Category();
        Category blog = new Category();
        Category environment = new Category();
        Category health = new Category();

        System.out.println(home);
        System.out.println(kathmandu);
        System.out.println(nepal);
        System.out.println(covid19);
        System.out.println(covidConnect);


    }
}
