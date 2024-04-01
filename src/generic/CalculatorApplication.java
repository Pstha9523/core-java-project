package generic;

public class CalculatorApplication {

    public static void main(String[] args) {

        NormalCalculator<Integer> integerCalculator = new NormalCalculator<>();
        integerCalculator.add(2,2);

        NormalCalculator<Double> doubleCalculator1 = new NormalCalculator<>();
        doubleCalculator1.add(2.2,4.5);

        //You can also have multiple type variables.
        GenericPair<Integer, Long> integerGenericPair = new GenericPair<>(3, 45L);
        integerGenericPair.getA();
        integerGenericPair.getB();


    }

}
