package AbstractionDemo;

public abstract class AbstractDemo {

    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("inside display of AbstractDemo classs");
    }

}

class  ChildAbstract extends AbstractDemo
{
    void start()
    {
        System.out.println("start");
    }

   void run()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

      //  AbstractDemo ob = new AbstractDemo(); // can not instantiate abstract class

        ChildAbstract ob = new ChildAbstract();

        ob.run();
        ob.start();
        ob.display();


        AbstractDemo ob1 = new ChildAbstract();

        ob1.display();
        ob1.run();
        ob1.start();
    }
}
