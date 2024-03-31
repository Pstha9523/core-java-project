package arrayPractice;

import java.util.*;
import java.util.stream.Collectors;


public class ArrayListPractice {






    public static void main(String[] args) {
/*        //Create 2 types of array list one with the class give by java and another with tha custom class and try following things :
        ArrayList <String> clothes = new ArrayList<>();
        ArrayList <Integer> quantity = new ArrayList<>();

        //a. Adding data
        clothes.add("T-shirt");
        clothes.add("Jeans");
        clothes.add ("Jacket");
        clothes.add ("Pants");

        quantity.add(25);
        quantity.add(20);
        quantity.add(15);
        quantity.add(30);

        System.out.println(clothes);
        System.out.println(quantity);
        //b. Adding data to specific index
        clothes.add(1, "Hoodie");
        System.out.println(clothes);

        //c. Adding one list to another (Both list type should be same)

        ArrayList <String> moreClothes = new ArrayList<>();

        moreClothes.add("Shoes");
        moreClothes.add("Socks");

        System.out.println(moreClothes);

        //c. Adding one list to another (Both list type should be same)

        clothes.addAll(moreClothes);

        System.out.println(clothes);

        //d. Remove data by index

        clothes.remove(2);
        System.out.println(clothes);

        //e. Remove data by object

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Niam", 1));
        students.add(new Student("Jose", 2));

        System.out.println(students);

        students.remove(new Student("Jose", 2));
        System.out.println(students);

        //f. Update data by index
        System.out.println(clothes);
        clothes.add(2, "Jeans");
        System.out.println(clothes);

        //g. Check the size of list
        System.out.println(clothes.size());

        //f. Clear all of the list that you have created

        System.out.println(clothes);
        clothes.clear();
        System.out.println(clothes);
        System.out.println(clothes.size());*/


        //Product List Assignment
        //Create a class called Product which has the states : id, name, price .
        //Create the list of products.
        // Sort this list on the basis of name /  price.

        ArrayList <Product> products = new ArrayList<>();

        products.add(new Product(1, "Iphone 14", 849.99));
        products.add(new Product(2, "Iphone 15", 1200.99));
        products.add(new Product(3, "Macbook Pro", 2200.00));
        products.add(new Product(4, "Macbook Air", 1900.50));
        products.add(new Product(5, "Ipad 15 ", 1800.99));
        System.out.println(products);

        // Sort this list on the basis of name /  price.
        Comparator<Product> byName = (b1, b2) -> b1.getName().compareTo(b2.getName());
        products.sort(byName);
        System.out.println("******* Name sort ****** " + '\n' + products);



        Comparator<Product> byPrice = Comparator.comparingDouble(Product::getPrice);
        products.sort(byPrice);
        System.out.println("****** Price sort ****** " + '\n' + products);














    }


}
