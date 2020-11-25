package InheritanceDemo;

public class SuperDemo3 {

    SuperDemo3()
    {
        System.out.println("inside SuperDemo3 constructor");
    }

}
class Subclass3 extends SuperDemo3 {

    Subclass3()
    {
        //super();
        System.out.println("inside Subclass3 constructor");
    }

    public static void main(String[] args) {

        Subclass3 ob = new Subclass3();
    }

}
