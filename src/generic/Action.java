package generic;

public interface Action <T> {

    void add(T a, T b);
    void subtract (T a, T b);
    void multiply (T a, T b);
    void divide (T a, T b);
}
