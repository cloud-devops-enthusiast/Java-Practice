//Data abstraction is the process of hiding certain details and showing only the esssential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces
//Abstract Class
abstract class Animal{
    //Abstract Method
    //Here you define a method but you dont declare or implement it over here.
    //You declare it in the another method that extends this class, that's why you place abstract keyword over here.
    public abstract void animalSound();
    //Regular Method
    public void sleep(){
        System.out.println("Pig is sleeping, ZZzzzz");
    }
}

//Subclass inherit from animal
class pig extends Animal{
    //Here you define the abstract method which you defined in the animal class, so basically what you do is define abstract there and use it here.
    public void animalSound(){
        //The body of animalsound() is provided there
        System.out.println("The Pig says: Oink Oink");
    }
}

public class JavaAbstraction {
    public static void main(String[] args){
        //Create a pig object
        //You cannot create object of abstract class and also all the abstract methods needs to be defined without them the class will not work

        pig myPig = new pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
