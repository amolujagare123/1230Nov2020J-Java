package InheritanceDemo.HybridDemo;

public class Animal {

    void displayAnimal()
    {
        System.out.println("display animal");
    }

}

class Reptile extends Animal
{
    void displayReptile()
    {
        System.out.println("display Reptile");
    }
}

class Mammal extends Animal
{
    void displayMammal()
    {
        System.out.println("display Mammal");
    }
}

class Dog  extends Mammal
{
    void displayDog()
    {
        System.out.println("display Dog");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        Reptile reptile = new Reptile();
        Mammal mammal = new Mammal();
        Dog dog = new Dog();


        animal.displayAnimal();

        reptile.displayReptile();
        reptile.displayAnimal();

        mammal.displayMammal();
        mammal.displayAnimal();

        dog.displayDog();
        dog.displayMammal();
        dog.displayAnimal();

    }
}

