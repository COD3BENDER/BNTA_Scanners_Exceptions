package ExceptionsDemo;

public class ExceptionPractice {

    public ExceptionPractice(){

    }
    public boolean checkEven(int number) throws Exception {
        if (number%2 == 0){
            return true;
        }
        throw new Exception("Number is not even. ");
    }
}
