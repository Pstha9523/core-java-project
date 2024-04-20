package exception;

import java.io.IOException;

public class CustomException {
    public static void main(String[] args) throws IOException {
        throw new IOException("Something is wrong");
    }

}
