package interfacePractice;

public class TripletApplication {

    public static void main(String[] args) {

        GenericTriplet<Integer, Integer, Integer> genericTriplet = new TripletImpl<>();
        genericTriplet.add(2, 2, 2);

        GenericTriplet<Double, Integer, Long> genericTriplet1 = new TripletImpl<>();
        genericTriplet1.add(2.2,4,3L);
    }
}
