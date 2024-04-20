package exception.college;

import java.io.IOException;

public class CollegeApp {


    public static void main(String[] args) throws ResultException {

        User user1 = new User("ABC", "Fail");
        User user2 = new User("PSP", "Pass");

        AppService appService = new AppService();
        try {
            appService.applicationResult(user2);
            appService.applicationResult(user1);
        } catch (ResultException resultException){
            System.out.println(resultException.getMessage());
        }


    }
}
