package generic;

public class GenericPair<T,U> {

    private T a;
    private  U b;

    public GenericPair(T a, U b){

        this.a = a;
        this.b = b;

    }

    public T getA() {
        return a;
    }

    public U getB() {
        return b;
    }
}
