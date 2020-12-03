package WrapperClassDemo;

public class WrapperClassDemo1 {

    public static void main(String[] args) {

        int i = 5;

        System.out.println("i="+i);

        Integer ii = new Integer(i); // boxing / wrapping

        System.out.println("ii="+ii);

        // try other datatypes as homework

        Integer ii2 = 10; // autoboxing / autowrapping

        System.out.println("ii2="+ii2);


    }
}
