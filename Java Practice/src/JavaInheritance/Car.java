package JavaInheritance;

class Vehicle{
    //Vehicle Attribute
    protected String Driver = "Max Verstappen";
    //Vehicle Method
    public void honk(){
        System.out.println("Tutu Tutu Max Verstappen");
    }
}
public class Car extends Vehicle{
    //Car Attribute
    private String teamName = "Red Bull Racing";
    public static void main(String[] args){
        //Creating a myCar object
        Car myCar = new Car();
        //Call the honk() method (from the Vehicle Class) on the myCar object
        myCar.honk();
        //Display the value of the brand attribute (from the vehicle class) and the value of the modelName from the car class
        System.out.println(myCar.teamName+" : "+myCar.Driver);
    }
}
