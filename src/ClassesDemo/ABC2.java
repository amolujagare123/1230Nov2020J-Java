package ClassesDemo;

public class ABC2 {

    int i;
    double d;
    char ch;
    String str;

    ABC2()
    {
         i =1;
         ch='v';
         d=67.1;
         str = "abcd";

    }


    void display()
    {
        System.out.println("i="+i);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ABC2 ob1 = new ABC2();



        ob1.display();


    }


}
