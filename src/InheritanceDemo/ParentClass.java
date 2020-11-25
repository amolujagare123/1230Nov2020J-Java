package InheritanceDemo;

public class ParentClass {

    int salary = 10000;
}

class Programmer extends ParentClass
{
    int bonus = 2500;

    public static void main(String[] args) {

        Programmer ob = new Programmer();
        System.out.println(ob.bonus);
        System.out.println(ob.salary);

    }

}