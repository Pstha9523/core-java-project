package Strings_Char;

public class StrChar {
    public static void main(String[] args) {

        String policyNumbers1 =  "06000001,A,50000;01000001,S,40000;02000005,Q,25000";
        String [] policyNum = policyNumbers1.split(";");

        System.out.println("First policy: " + policyNum[0]);
        System.out.println("Second policy: " + policyNum[1]);
        System.out.println("Third policy: " + policyNum[2]);

    }

}
