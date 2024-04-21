package designPattern;

public class Random {

    public static void main(String[] args) {

        SingletonExample singletonExample =  SingletonExample.getInstance();
        SingletonExample singletonExample1 = SingletonExample.getInstance();

        System.out.println(singletonExample1 == singletonExample);


    }
}
