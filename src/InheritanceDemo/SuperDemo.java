package InheritanceDemo;

public class SuperDemo {

    int myValue =10;

}

class SubClass extends  SuperDemo
{
    int myValue =20;


    void display()
    {
        System.out.println(myValue); // 20
        System.out.println(super.myValue); // 10
    }

    public static void main(String[] args) {
        SubClass ob = new SubClass();
       ob.display();

    }
}