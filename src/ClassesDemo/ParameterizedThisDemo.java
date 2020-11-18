package ClassesDemo;

public class ParameterizedThisDemo {

    int i;
    double d;
    char ch;
    String str;

    ParameterizedThisDemo(int i, double d, char ch, String str)
    {
        this.i =i;
        this.ch =ch;
        this.d =d;
        this.str = str;
    }


    void display()
    {
        System.out.println("i="+i);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParameterizedThisDemo ob1 = new ParameterizedThisDemo(12,1.1,'d',"myString");

        ob1.display();


        ParameterizedThisDemo ob2 = new ParameterizedThisDemo(2,2.2,'a',"str111");

        ob2.display();

    }


}
