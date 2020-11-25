package InheritanceDemo;

public class Animal1 {

    void eat()
    {
        System.out.println("eat");
    }
}


class Dog1 extends Animal
{

    void bark()
    {
        System.out.println("bark");
    }
}

class  Cat extends Animal
{
    void meow()
    {
        System.out.println("meow");
    }

    public static void main(String[] args) {

        Animal1 animal = new Animal1();
        Dog1 dog = new Dog1();
        Cat cat = new Cat();

        animal.eat();

        dog.bark();
        dog.eat();

        cat.meow();
        cat.eat();
    }
}

