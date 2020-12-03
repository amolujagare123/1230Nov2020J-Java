package AbstractionDemo;

public interface InterfaceDemo {

    void start();
    void run();

    default void display()
    {
        System.out.println("display in InterfaceDemo");
    }

    static void show() // it has public access modifier by default
    {
        System.out.println("show in InterfaceDemo");
    }
}

class ChildInterface implements InterfaceDemo
{
    public void start()
    {
        System.out.println("start");
    }

    public void run()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();

        ob.run();
        ob.start();
        ob.display();

        InterfaceDemo.show();
        // static methods inside interface can be
        // called using interface name only

    }


}