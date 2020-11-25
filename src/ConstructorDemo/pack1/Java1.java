package ConstructorDemo.pack1;

public class Java1 {

    public  int i1;
    protected  double d1;
    private char ch1;
    String str1;

    void display()
    {
        System.out.println("i="+i1);
        System.out.println("d="+d1);
        System.out.println("ch="+ch1);
        System.out.println("str="+str1);
    }

    public static void main(String[] args) {

        Java1 ob =new Java1();
        ob.i1 = 12;
        ob.d1 = 34.4;
        ob.ch1 ='h';
        ob.display();

    }
}
