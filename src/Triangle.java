public class Triangle {

    public static void main(String[] args) {

        int a = 90;
        int b = 90;
        int c = 0;


        if(a+b+c==180 && a>0 && b>0 && c>0) {

            if (a == b && b == c)
                System.out.println("equilateral triangle");

            if (a != b && b != c)
                System.out.println("scalene triangle");

            if (a == 90 || b == 90 || c == 90)

                System.out.println("right angled triangle");

            if ((a == b && b != c) || (b == c && c != a) || (a == c && c != b))
                System.out.println("isosceles  triangle");
        }
        else
            System.out.println("This is not a triangle");

    }
}
