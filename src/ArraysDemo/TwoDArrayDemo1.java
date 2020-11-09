package ArraysDemo;

public class TwoDArrayDemo1 {

    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] =60;
        a[0][1] =70;
        a[0][2] =67;

        a[1][0] =23;
        a[1][1] =21;
        a[1][2] =11;


        a[2][0] =65;
        a[2][1] =67;
        a[2][2] =68;

        a[3][0] =17;
        a[3][1] =27;
        a[3][2] =37;


        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }



    }

}
