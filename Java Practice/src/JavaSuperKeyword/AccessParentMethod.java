package JavaSuperKeyword;

class Laptop{
    public void laptopModel(){
        System.out.println("This is a test line for laptop class.");
    }
}

class Apple extends Laptop{
    public void laptopModel(){
        //Calling the parent method
        super.laptopModel();
        System.out.println("My laptop model is Apple Macbook Air M4.");
    }
}
public class AccessParentMethod {
    public static void main(String[] args){
        Apple myMac = new Apple();
        myMac.laptopModel();
    }
}
