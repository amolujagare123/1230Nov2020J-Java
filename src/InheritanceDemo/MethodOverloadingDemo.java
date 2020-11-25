package InheritanceDemo;

public class MethodOverloadingDemo {

    void addition()
    {
        int a =10 ;
        int b =20 ;

        int c = a+b;
        System.out.println("Addition is ="+c);
    }
    
    // Method Overloading - multiple methods having same name
    // but with different signiture
    // you can have different signiture in same method
    // signiture- return type + arguments

    void addition(double a1, double a2)
    {
        double add = a1+a2;
        System.out.println("Addition is ="+add);
    }

    void addition(String s1, String s2)
    {
        System.out.println("Added Strings finally:"+ (s1+s2) );
    }

    public static void main(String[] args) {
        MethodOverloadingDemo ob = new MethodOverloadingDemo();
        ob.addition();

        ob.addition(12.4,67.4);

        ob.addition("Selenium","-WebDriver");

    }
}
