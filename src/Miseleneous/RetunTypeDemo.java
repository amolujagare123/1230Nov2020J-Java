package Miseleneous;

import ConstructorDemo.pack2.Java4;


public class RetunTypeDemo {


    int getIntValue()
    {
        System.out.println("inside getIntValue()");

        /*int a ;

        a= 10;*/

       return 78;
      // return  a;
    }

    double getDoubleValue()
    {
        return 45.6;
    }


    char getCharValue()
    {
        return  'h';
    }

    String getStringValue()
    {
        return  "this is a java class";
    }

    boolean getBooleanValue()
    {
        return true;
    }

    int[] getMyArray()
    {
        int[] a = {11,22,33,44,55};

        return a;
    }

    String[][] getMyTwoDArray()
    {
        String[][] strArr = {
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"}
        };

        return strArr;
    }


    Java4 getMyObject()
    {
        Java4 obj = new Java4();
        obj.i4 =1;
        obj.ch4='c';
        obj.d4=90.3;
        obj.str4="string";

        return obj;

    }


    public static void main(String[] args) {

        RetunTypeDemo ob = new RetunTypeDemo();

       System.out.println(ob.getIntValue());

       int x = ob.getIntValue();
          //int x = 10 ;


        System.out.println("x="+x);

        double d = ob.getDoubleValue();

        System.out.println("d="+d);

        char c = ob.getCharValue();
        System.out.println("c="+c);

        String str = ob.getStringValue();
        System.out.println("str="+str);

        boolean b= ob.getBooleanValue();
        System.out.println(b);


        int[] arr = ob.getMyArray();

        System.out.println();
        for(int i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);

        System.out.println();

        String[][] sArr = ob.getMyTwoDArray();

        for(int i=0;i<sArr.length;i++)
        {
            for(int j=0;j<sArr[0].length;j++)
            {
                System.out.print("\t"+sArr[i][j]);
            }
            System.out.println();
        }


         Java4 object = ob.getMyObject();

         object.display4();


    }

}
