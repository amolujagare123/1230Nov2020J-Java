package WrapperClassDemo;

public class StringConversions {

    public static void main(String[] args) {

        String str1 = "10";
        String str2 = "101";

        System.out.println("result="+(str1+str2));

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        System.out.println("result="+(i1+i2));

        String str3 = "10.56";
        String str4 = "101.12";

        System.out.println("result="+(str3+str4));

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);

        System.out.println("result="+(d1+d2));

        // as home work - try for boolean (Boolean.parseBoolean())
        // - float (Float.parseFloat())

        String str5 = "r";

        // we dont have a method like parseCharacter()
        // so we cant convert a string into character in that way
        // we dont have any method in wrapper class that can convert
        // string into character

       char c = str5.charAt(0);

        System.out.println("c="+c);

    }
}
