package exception.logging;

import arrayPractice.Student;

import java.util.logging.Logger;

public class ConsoleLogging {

    static final Logger logger = Logger.getLogger(ConsoleLogging.class.getName());
    public static void main(String[] args) {
        /*logger.warning("Warning");
        logger.severe("Critical");*/
        Student student = new Student("ABC", 123);
        System.out.println(student);
        logger.info(String.valueOf(student));
    }
}
