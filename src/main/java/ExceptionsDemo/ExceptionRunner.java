package ExceptionsDemo;

public class ExceptionRunner {

    public static void main(String[] args) {

        ExceptionPractice exceptionPractice = new ExceptionPractice();

        try {
            exceptionPractice.checkEven(3);
        }catch (Exception exception){
            exception.printStackTrace();
        }

    }

}
