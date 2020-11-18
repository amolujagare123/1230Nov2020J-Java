package ClassesDemo;

public class ABC {

    int i;
    double d;
    char ch;
    String str;

    void display()
    {
        System.out.println("i="+i);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ABC ob1 = new ABC();

        ob1.i =10;
        ob1.d =89.4;
        ob1.ch='c';
        ob1.str="amol";
        ob1.display();


        ABC ob2 = new ABC();
        ob2.i =12;
        ob2.d =81.4;
        ob2.ch='s';
        ob2.str="rahul";
        ob2.display();

    }


}
