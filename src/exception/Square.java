package exception;

import java.util.Scanner;
 import java.util.Scanner;

 class Square {
        int a;

        public Square(int a) throws SquareSizeException {
            if (a > 0) {
                this.a = a;}
            else {
                throw new SquareSizeException("zero or negative size");} //put you code here

        }
    }
    class Main {
        public static void main(String[] args) {
            //put your code here
            try {
                Scanner scn = new Scanner(System.in);
                int a = scn.nextInt();
                Square square = new Square(a);
            } catch (SquareSizeException e){
                System.out.println(e.getMessage());
            }



        }
    }

    class SquareSizeException extends Exception {
        public SquareSizeException(String message) {
            super(message);
        }
    }

