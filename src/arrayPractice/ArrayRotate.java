package arrayPractice;

import java.util.Arrays;
import java.util.Enumeration;


public class ArrayRotate {

    //Create an array of any length and rotate its value by 1 unit. Use a different function to rotate the arrays.
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3};
        int r = 1;

        rotateFunction(numbers, r);

        System.out.println("Rotated Array:");
        for(int num : numbers){
            System.out.println(num);

        }

    }

    public static void rotateFunction(int [] numbers, int r) {
        int n = numbers.length;
        int [] copyNumbers = new int[n];
        for(int i = 0; i < n; i++){
            copyNumbers[(i + r) % n] = numbers[i];
        }
        System.arraycopy(copyNumbers, 0, numbers, 0, n);



    }

}






