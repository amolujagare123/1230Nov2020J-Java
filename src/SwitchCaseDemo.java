public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a =30;
        int b = 20;
        int c =0;

        String operation ="div";

        switch (operation)
        {
            case "add" : c = a+b ;
                System.out.println("Addition="+c);
                break;
            case "sub" : c = a-b ;
                System.out.println("Substraction="+c);
                break;
            case "mul" : c = a*b ;
                System.out.println("Multiplication="+c);
                break;
            case "div" : c = a/b ;
                System.out.println("Division="+c);
                break;
        }


    }
}
