package JavaInheritance;

class Vehicle{
    protected String Driver = "Max Verstappen";
    public void honk(){
        System.out.println("Tutu Tutu Max Verstappen");
    }
}
public class Car extends Vehicle{
    private String teamName = "Red Bull Racing";
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.teamName+" : "+myCar.Driver);
    }
}
