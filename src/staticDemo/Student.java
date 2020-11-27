package staticDemo;

public class Student {

    public int rno;
    public String name;
    public static String college ="ITC";

    public int marks;

    public void display()  // non static
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("collge="+college);
    }

    public static void printCollege()
    {
       // marks =100;
        System.out.println("college static value = "+college);
    }



    public static void main(String[] args) {

       // Student student1 = new Student();

       /* student1.rno =1;
        student1.name="amol";
        student1.display();

        Student student2 = new Student();
        student2.rno =2;
        student2.name="Santosh";
        student2.college= "Bharati vidya peeth";


        System.out.println("student2.college:"+student2.college);
        System.out.println("student1.college:"+student1.college);*/

        Student.college = "PICT";
        System.out.println(Student.college);

        Student.printCollege();


    }

}
