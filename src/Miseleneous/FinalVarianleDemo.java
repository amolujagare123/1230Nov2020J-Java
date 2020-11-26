package Miseleneous;

public class FinalVarianleDemo {

    final int speed = 100;

    void change()
    {
       // speed = 100;
    }

    public static void main(String[] args) {

        FinalVarianleDemo ob = new FinalVarianleDemo();

        System.out.println(ob.speed);

        ob.change();

        System.out.println(ob.speed);


    }

}
