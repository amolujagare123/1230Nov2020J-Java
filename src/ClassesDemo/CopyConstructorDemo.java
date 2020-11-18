package ClassesDemo;

public class CopyConstructorDemo {

    int i;
    double d;
    char ch;
    String str;

    CopyConstructorDemo(CopyConstructorDemo obj)
    {
        i = obj.i;
        d= obj.d;
        ch = obj.ch;
        str = obj.str;

    }


    CopyConstructorDemo()
    {


    }


    void display()
    {
        System.out.println("i="+i);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        CopyConstructorDemo ob1 = new CopyConstructorDemo();

        ob1.i =10;
        ob1.d=12.3;
        ob1.ch='h';
        ob1.str="amol";

        ob1.display();


        CopyConstructorDemo ob2 = new CopyConstructorDemo(ob1);

        ob2.display();


    }


}
