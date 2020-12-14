package ExceptionDemos;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 78;
            a[1] = 78;
            a[2] = 78;
            a[3] = 78;
            a[4] = 78;
            a[5] = 78;
        }
        catch (Exception e)
        {
            System.out.println("inside the catch");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());

            System.out.println(e);

            e.printStackTrace();
        }

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("End of the program");


    }
}
