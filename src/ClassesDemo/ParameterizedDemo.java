package ClassesDemo;

public class ParameterizedDemo {

    int i;
    double d;
    char ch;
    String str;

    ParameterizedDemo(int x, double dd, char cc, String ss)
    {
         i =x;
         ch=cc;
         d=dd;
         str = ss;
    }


    void display()
    {
        System.out.println("i="+i);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParameterizedDemo ob1 = new ParameterizedDemo(12,1.1,'d',"myString");

        ob1.display();


        ParameterizedDemo ob2 = new ParameterizedDemo(2,2.2,'a',"str111");

        ob2.display();

    }


}
