package operators;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {

        float computer = 95;
        float science = 70;
        float maths = 30;
        float english = 95;
        float account = 75;

        // boolean isFailed = computer < 32 || science < 32 || maths < 32 || english < 32 || account < 32;
        // percentage = add marks of all subjects / 500 * 100
        double percentage = (computer + science + maths + english + account) / 500 * 100;
        System.out.println(percentage);

        // isDistinction -> percentage >= 80
        boolean isDistinction = percentage >= 80;
        System.out.println("Distinction: " + isDistinction);
        // isFirstDivision -> percentage >= 70 AND/OR percentage < 80
        boolean isFirstDivision = percentage >= 70 && percentage <= 80;
        System.out.println("First Division: " + isFirstDivision);
        // isSecondDivision -> percentage >= 60
        boolean isSecondDivision = percentage >= 60 && percentage <= 70;
        System.out.println("Second Division: " + isSecondDivision);
        // isThirdDivision -> percentage >= 40
        boolean isThirdDivision = percentage >= 40 && percentage <= 60;
        System.out.println("Third Division: " + isThirdDivision);
        // isFailed -> percentage < 40
        boolean isFailed = percentage < 40;
        System.out.println("Failed: " +isFailed);


        //Using user's input for 4 classes and then taking the percentage and placing the decimal to the tenth place.
        Scanner userInput = new Scanner(System.in);
        float class1 = userInput.nextFloat();
        float class2 = userInput.nextFloat();
        float class3 = userInput.nextFloat();
        float class4 = userInput.nextFloat();
        userInput.close();

        float percentageClasses = (class1+class2+class3+class4) / 500 * 100;

        System.out.printf("Percentage : " + "%.2f",percentageClasses);

        if(percentageClasses >= 80){
            System.out.printf("%n" + "Distinct");
        } else if (percentageClasses >= 70 && percentageClasses <= 80) {
            System.out.printf("%n" + "First Division");
        } else if (percentageClasses >= 60 && percentageClasses <= 70) {
            System.out.printf("%n" + "Second Division");
        } else if (percentageClasses >= 40) {
            System.out.printf("%n" + "Third Division");
        }else {
            System.out.printf("%n" + "Fail");
        }

    }
}
