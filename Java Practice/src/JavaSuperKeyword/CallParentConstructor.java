package JavaSuperKeyword;

class Annimal{
    Annimal(){
        System.out.println("Class Animal is created.");
    }
}

class Cat extends Annimal{
    Cat(){
        super();
        //Call parent constructor
        System.out.println("Cat is Created");
    }
}

public class CallParentConstructor {
    public static void main(String[] args){
        Cat myCat = new Cat();
    }
}
