package ArraysDemo;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 45;
        a[1] = 12;
        a[2] = 44;
        a[3] = 57;
        a[4] = 80;

        //System.out.println(a[0]);
        // length of the array is -> how many elements aray can hold
        // a.length
        /*for(int i=0;i<5;i++)
            System.out.println(a[i]);*/

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

    }

}
