package thread;

import java.security.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceutorPractice {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);


        Runnable task1 = () -> {
            System.out.println("Task 1 " + Thread.currentThread().getName());
        };

        Runnable task2 = ()-> {
            System.out.println("Task 2 " + Thread.currentThread().getName());
        };
        Runnable task3 = ()-> {
            System.out.println("Task 3 " + Thread.currentThread().getName());
        };
        Runnable task4 = ()-> {
            System.out.println("Task 4 " + Thread.currentThread().getName());
        };
        Runnable task5 = ()-> {
            System.out.println("Task 5 " + Thread.currentThread().getName());
        };

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);
        service.submit(task5);

        service.shutdown();

    }


}
