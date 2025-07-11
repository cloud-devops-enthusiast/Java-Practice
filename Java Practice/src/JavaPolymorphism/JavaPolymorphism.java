package JavaPolymorphism;

class Animal{
    public void animalSound(){
        System.out.println("The Animal makes a sound.");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig makes sound like: Oink Oink");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The Dog makes sound like: Woww Woww");
    }
}

public class JavaPolymorphism {
    public static void main(String[] args){
        //Create an animal object
        Animal myAnimal = new Animal();
        //Create a Pig object
        Pig myPig = new Pig();
        //Create a Dog object
        Dog myDog = new Dog();
        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }

}
