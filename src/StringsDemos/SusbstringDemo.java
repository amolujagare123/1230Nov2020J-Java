package StringsDemos;

public class SusbstringDemo {

    public static void main(String[] args) {

        String str = "we are learning selenium";

        System.out.println(str.substring(8));

        // it will return a string starting with beginIndex till endIndex
        // (Note : endIndex is not inclusive)

        System.out.println(str.substring(8,12));


    }
}
