package designPattern;


public class SingletonExample {

    private static SingletonExample singleton_instance = null;

    private SingletonExample() {

    }

    public static SingletonExample getInstance(){
        if(singleton_instance == null )
            singleton_instance = new SingletonExample();

        return singleton_instance;
        }


}
