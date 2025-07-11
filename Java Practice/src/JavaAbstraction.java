//Data abstraction is the process of hiding certain details and showing only the esssential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces
//Abstract Class
abstract class Animal{
    //Abstract Method
    public abstract void animalSound();
    //Regular Method
    public void sleep(){
        System.out.println("Pig is sleeping, ZZzzzz");
    }
}

//Subclass inherit from animal
class pig extends Animal{
    public void animalSound(){
        //The body of animalsound() is provided there
        System.out.println("The Pig says: Oink Oink");
    }
}

public class JavaAbstraction {
    public static void main(String[] args){
        //Create a pig object
        pig myPig = new pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
