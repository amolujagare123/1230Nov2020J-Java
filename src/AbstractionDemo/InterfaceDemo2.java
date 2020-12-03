package AbstractionDemo;

public interface InterfaceDemo2 {

    void start();
    void run();

    void display();

    static void show() // it has public access modifier by default
    {
        System.out.println("show in InterfaceDemo");
    }
}

interface  AnotherInterface
{
    void display();
}

class ChildInterface2 implements InterfaceDemo2,AnotherInterface
{
    public void start()
    {
        System.out.println("start");
    }

    public void run()
    {
        System.out.println("start");
    }

    public void display()
    {
        System.out.println("display");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();

        ob.run();
        ob.start();
        ob.display();

        InterfaceDemo.show();
        // static methods inside interface can be
        // called using interface name only

        ChildInterface2 obChild = new ChildInterface2();

        obChild.display();

    }


}