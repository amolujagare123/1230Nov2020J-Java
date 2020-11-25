package Miseleneous;

import ConstructorDemo.pack2.Java4;

import java.util.Date;

public class ArgumentsDemo {

    public void intArgument(int a)
    {
        System.out.println("a="+a);
    }

    public void charArgument(char c)
    {
        System.out.println("c="+c);
    }

    public void booleanArgument(boolean b)
    {
        System.out.println("b="+b);
    }
    public void stringArgument(String str)
    {
        System.out.println("str="+str);
    }


    public void dateArgument(Date date)
    {
        System.out.println("Date="+date);
    }

    public void arrayArgumnet(int[] a)
    {
        System.out.println("Below is the given array");
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+"\t");
    }


    public void objectArgument(Java4 obj)
    {

        obj.display4();

    }


    public void twoDArray(String[][] a)
    {
        System.out.println("\nBelow is the given 2D array");

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print("\t"+a[i][j]);
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        ArgumentsDemo ob = new ArgumentsDemo();

        ob.intArgument(10);
        ob.charArgument('n');
        ob.booleanArgument(true);
        ob.stringArgument("amol");
        ob.dateArgument(new Date());

        int[] array = {12,45,1,3,76,1,323,63};

        ob.arrayArgumnet(array);

        String[][] sArr = {

                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
        };

        ob.twoDArray(sArr);

        Java4 ob1 = new Java4();

        ob1.i4 = 11;
        ob1.ch4='w';
        ob1.d4=11.1;
        ob1.str4="sss";

        ob.objectArgument(ob1);

    }



}
