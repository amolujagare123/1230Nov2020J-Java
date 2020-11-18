package ConstructorDemo.pack2;

import ConstructorDemo.pack1.Java1;

public class Java3 {

    int i3;
    double d3;
    char ch3;
    String str3;

    void display()
    {
        System.out.println("i="+i3);
        System.out.println("d="+d3);
        System.out.println("ch="+ch3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.i1 =67;
       // ob.ch1 = 'j';
      //  ob.display();

    }
}
