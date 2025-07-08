public class JavaThisKeyword {
    int LaptopSerialNumber;
    String LaptopModelName;

    //Constructor with one parameter
    public JavaThisKeyword(String LaptopModelName){
        //Call the two-parameter constructor to re-use the code and set the Laptop Serial Number
        this(956162244, LaptopModelName);
    }

    //Constructor with two parameter
    public JavaThisKeyword(int LaptopSerialNumber,String LaptopModelName){
        //Use 'this' parameter to assign values to the class variable
        this.LaptopModelName = LaptopModelName;
        this.LaptopSerialNumber = LaptopSerialNumber;
    }

    //Method to print the Laptop Serial Number and Laptop Model Name
    public void printInfo(){
        System.out.println("LaptopSerialNumber: "+LaptopSerialNumber);
        System.out.println("LaptopModelName: "+LaptopModelName);
    }

    public static void main(String[] args){
        //Create a lap1 object with one parameter
        JavaThisKeyword lap1 = new JavaThisKeyword("Apple Macbook Air M4");

        //Create a lap2 object with two parameter
        JavaThisKeyword lap2 = new JavaThisKeyword(84594969,"Asus VivoBook S15");

        //Printing the values
        lap1.printInfo();
        lap2.printInfo();
    }
}
