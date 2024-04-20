package arrayPractice.lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CustomLists {

    public static void main(String[] args) {

        //list
        ArrayList<String> users = new ArrayList<>();
        users.add("Bob");
        users.add("Linda");

        System.out.println(users);

        //able to insert and remove from index, data manipulation
        LinkedList<String> usersLinked = new LinkedList<>();
        usersLinked.add("Tina");
        usersLinked.add("Gene");
        usersLinked.add(1, "Lois");
        System.out.println(usersLinked);

        //sorted from LinkedList and removed duplicate as you can see Gene only comes up once
        HashSet<String> usersHash = new HashSet<>(usersLinked);
        usersHash.add("Gene");
        usersHash.add("Linda");
        System.out.println(usersHash);

        //insertion order and sorted
        TreeSet<String> usersTree = new TreeSet<>(usersLinked);
        usersTree.addAll(users);
        System.out.println(usersTree);




    }
}
