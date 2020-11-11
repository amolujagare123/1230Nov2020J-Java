package StringsDemos;

public class EndingChar {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";

        String[]  sArr = str.split(" ");
        // ===> {"Hey","baby"........}

        for(int i=0;i<sArr.length;i++)
        {
           /* String word = sArr[i];
            int l = word.length();*/

            int l = sArr[i].length();

            if(sArr[i].charAt(l-1)=='y')
                  System.out.println(sArr[i]);
        }

    }
}
