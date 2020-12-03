package WrapperClassDemo;

public class WrapperClassDemo2 {

    public static void main(String[] args) {

        Integer ii = new Integer(5); // boxing / wrapping

        System.out.println("ii="+ii);

        int i = ii.intValue(); // unboxing / unwrapping
        // briging out the wrapper class value into premitive

        int i2 = ii ;  // autounboxing / autounwrapping

        System.out.println("i="+i);
        System.out.println("i2="+i2);

    }
}
