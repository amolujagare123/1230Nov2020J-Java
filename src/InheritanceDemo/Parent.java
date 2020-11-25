package InheritanceDemo;

public class Parent {

    void myMethod()
    {
        System.out.println("Parent: myMethod");
    }

}

class Child extends Parent
{
    void myMethod() // same signitures
    {
        System.out.println("Child: myMethod");
    }
}
