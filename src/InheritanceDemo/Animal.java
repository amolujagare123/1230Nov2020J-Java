package InheritanceDemo;

public class Animal {

    void eat()
    {
        System.out.println("eat");
    }
}


class Dog extends Animal
{

    void bark()
    {
        System.out.println("bark");
    }
}


class BabyDog extends Dog
{
    void weep()
    {
        System.out.println("weep");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        BabyDog babyDog = new BabyDog();

        animal.eat();

        dog.eat();
        dog.bark();

        babyDog.eat();
        babyDog.bark();
        babyDog.weep();

    }
}