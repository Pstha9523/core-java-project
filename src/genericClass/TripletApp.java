package genericClass;

import java.util.ArrayList;

public class TripletApp {

    public static void main(String[] args) {

        ArrayList<DiffTriplet> triplets = new ArrayList<>();
        triplets.add(new DiffTriplet("Bob", "Blue", 5.5, 0));
        triplets.add(new DiffTriplet("Bobby", "Green", 5.7, 0));
        triplets.add(new DiffTriplet("Bobbi", "Brown", 6.0, 0));

        System.out.println(triplets);

        }



}

