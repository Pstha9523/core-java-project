package generic.minimum;

import java.util.Scanner;

public class MinApplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Min min1 = new Min();

        min1.findMin(scn.nextInt(),scn.nextInt(),scn.nextInt());

    }
}
