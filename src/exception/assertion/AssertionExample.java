package exception.assertion;

public class AssertionExample {
    //assertion is mostly used by testers.

    public static void main(String[] args) {

        int number = positiveInt();

        /*if( number > 0){
            // do something
        } else {
            throw new RuntimeException("The number is negative");
        }*/

        //instead of if statement you can do assertion.

        assert number > 0 : "The number is negative";
        //this is just for testing.
        //you have to enable assertion by edit configuration and add VM  -ea (enable assertion).
        //you can disable the assertion as well by putting -da in the VM section.
    }

    public static int positiveInt() {
        return  -5;
    }
}
