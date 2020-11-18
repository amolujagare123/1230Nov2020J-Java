package ClassesDemo;

public class ABC1 {

    int i;
    double d;
    char ch;
    String str;

    ABC1() // empty constructor | no body
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

        ABC1 ob1 = new ABC1();

        /*ob1.i =10;
        ob1.d =89.4;
        ob1.ch='c';
        ob1.str="amol";*/

        ob1.display();



    }


}
