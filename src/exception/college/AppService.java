package exception.college;

import java.io.IOException;

public class AppService {

    public void applicationResult(User user) throws ResultException {


            if(user.getResult().equals("Fail")) {
                throw new ResultException("Sorry, your application will not be moved forward.");
            }

        System.out.println("Congratulations your application will be processed.");


    }
}
