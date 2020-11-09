package ArraysDemo;

public class ArrayDemo2 {

    public static void main(String[] args) {

        int[] a = {23,56,121,34,13,56,21,12,80,12,11};

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.println();

        double[] d = {12.4,34.2,21.6,23.7,11.6};

        for(int i=0;i<d.length;i++)
            System.out.print(d[i]+" ");

        System.out.println();

        char[] ch = {'t','z','3','*','@','#'};

        for(int i=0;i<ch.length;i++)
            System.out.print(ch[i]+" ");

        System.out.println();

        String[] str = {"amol","santosh","sopan","vikram","Amit"};

        for(int i=0;i<str.length;i++)
            System.out.print(str[i]+" ");

    }
}
