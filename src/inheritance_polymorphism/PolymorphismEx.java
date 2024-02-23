package inheritance_polymorphism;

public class PolymorphismEx {



    public static void main(String[] args) {
        int a, b;
        float c ,d;
        double e, f;

         a = 3;
         b = 6;
        add(a,b);

        c = 3.2f;
        d = 5.3f;
        add(c,d);

        e = 5.55;
        f = 2.00;

        add(e, f);

    }
    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("Sum of " +a+ " + " + b + " equals " + sum);
    }

    public static void add(float a, float b){
        float sum = a + b;
        System.out.println("Sum of " + a  + " + " + b + " equals " + sum);
    }

    public static void add(double a, double b){
        double sum = a + b;
        System.out.println("Sum of " + a + " + " + b + " equals " + sum);
    }
}
