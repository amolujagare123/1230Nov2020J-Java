package ExceptionDemos;

public class Division {

    public static void main(String[] args) {
        int  a = 10;
        int b = 0;
        int c =1;

        try {

            c = a / b;
        }
        catch (Exception e)
        {
            System.out.println("Inside the catch block");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());

            System.out.println(e);

            e.printStackTrace();
        }

        System.out.println("Division="+c);
        System.out.println("End of the program");

    }

}
