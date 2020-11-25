package InheritanceDemo;

public class SuperClassDemo2 {

    void myDisplay()
    {
        System.out.println("SuperClassDemo2");
    }

}

class  Subclass extends  SuperClassDemo2
{
    void myDisplay()
    {
        System.out.println("Subclass");
    }
    void start()
    {
        System.out.println("start");
    }

    void methodCalls()
    {
        start();
        myDisplay();
        super.myDisplay();
    }

    public static void main(String[] args) {

        Subclass subclass = new Subclass();
        subclass.methodCalls();
    }

}
