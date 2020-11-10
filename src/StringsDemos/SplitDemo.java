package StringsDemos;

public class SplitDemo {

    public static void main(String[] args) {



        String str = "we are learning selenium";

        String[]  sArr =  str.split(" ");
      // String[]  sArr =  str.split("i");
// ===> return an array of a splitted strings {"we","are","learning","Selenium"}


        for(int i=0;i<sArr.length ;i++)
        {
            System.out.println(sArr[i]);
        }
    }
}
