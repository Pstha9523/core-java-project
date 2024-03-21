package arrayPractice;

import java.util.Arrays;


public class ArrayRotate {

    //Create an array of any length and rotate its value by 1 unit. Use a different function to rotate the arrays.
    static String [] letters = {"P", "S", "C"};


    public static void main(String[] args) {
        System.out.println("\n" + "Before rotation");
        for (String letter : letters) {
            System.out.println(letter);
        }
        System.out.println("\n" + "After rotate");

        rotateFunction();

    }

    public static void rotateFunction() {
        String [] rotate = Arrays.copyOf(letters, letters.length);

        for (String s : rotate) {

            if (s.equals(rotate[0])) {
                System.out.println(rotate[1]);
            } else if (s.equals(rotate[1])) {
                System.out.println(rotate[2]);
            } else if (s.equals(rotate[2])) {
                System.out.println(rotate[0]);
            }

        }

    }

}




