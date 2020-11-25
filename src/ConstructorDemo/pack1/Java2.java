package ConstructorDemo.pack1;

public class Java2 {

    int i2;
    double d2;
    char ch2;
    String str2;

    void display()
    {
        System.out.println("i="+i2);
        System.out.println("d="+d2);
        System.out.println("ch="+ch2);
        System.out.println("str="+str2);
    }

    public static void main(String[] args) {

        Java1 obJ2 = new Java1();
        obJ2.i1 =23;
        obJ2.str1 ="fefe";
        obJ2.d1 = 34.4;
       // obJ2.ch1 ='j';
        obJ2.display();
    }
}
