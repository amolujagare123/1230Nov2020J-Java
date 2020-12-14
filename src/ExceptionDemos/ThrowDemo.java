package ExceptionDemos;

public class ThrowDemo {


    void checkNumber(int i) throws Exception // i must be in between 1 to 10
    {

        if(i>=1 && i<=10)
            System.out.println("We are safe");
        else
        {
            System.out.println("We are in danger");

            throw new ArithmeticException("Number is not between 1 o 10 :its danger");
        }

    }


    public static void main(String[] args) throws Exception {

        System.out.println("start of a program");

        int value = 15;

        ThrowDemo ob = new ThrowDemo();

        ob.checkNumber(value);

        System.out.println("Program completed");


    }
}
