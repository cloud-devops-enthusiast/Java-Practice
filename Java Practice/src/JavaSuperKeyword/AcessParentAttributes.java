package JavaSuperKeyword;

class Animal{
    String type = "Animal";
}

class cat extends Animal{
    String type = "Cat";

    public void printType(){
        //Here we are accessing a parent attribute
        System.out.println(super.type);
        System.out.println(type);
    }
}

public class AcessParentAttributes {
    public static void main(String[] args){
        cat myPet = new cat();
        myPet.printType();
    }
}
