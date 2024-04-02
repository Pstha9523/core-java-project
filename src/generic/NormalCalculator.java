package generic;

public class NormalCalculator<T extends Number> implements Action<T>{
    //When you do T extends Number then you are bounding T to just Numbers class.

    @Override
    public void add(T a, T b) {

    }

    @Override
    public void subtract(T a, T b) {

    }

    @Override
    public void multiply(T a, T b) {

    }

    @Override
    public void divide(T a, T b) {

    }
}
