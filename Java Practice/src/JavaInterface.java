//This is another way to achieve abstraction in java
//an interface is a completely "abstract class" that is used to group out the related methods with empty bodies
//Defining an Interface
interface Car{
    //This is an interface but this doesnt have its own body
    public void drive();
    public void playMusic();
    public void speed();
}

interface Engine{
    public void power();
    public void torque();
    public void tankCapacity();
}

class altroz implements Car, Engine{
    public void drive(){
        System.out.println("Car is driving on the road.");
    }
    public void playMusic(){
        System.out.println("You can play music in a car.");
    }
    public void speed(){
        System.out.println("Maxmimum speed of a car is 150Kmph.");
    }
    public void power() {
        System.out.println("273 Bhp");
    }
    public void torque(){
        System.out.println("27 nM");
    }
    public void tankCapacity(){
        System.out.println("56 liters");
    }
}

public class JavaInterface {
    public static void main(String[] args){
        altroz myCar = new altroz();
        myCar.drive();
        myCar.playMusic();
        myCar.speed();
        myCar.power();
        myCar.torque();
        myCar.tankCapacity();
    }
}
