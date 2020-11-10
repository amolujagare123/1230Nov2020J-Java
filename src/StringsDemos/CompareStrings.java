package StringsDemos;

public class CompareStrings {

    public static void main(String[] args) {

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str5 = "rahul";
        String str6 = new String("amol");

        // ==

        //str1==str2 // 2 addreeses are going to be compared

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str6));

        System.out.println(str1==str2);

        System.out.println(str1==str6); // true


    }
}
