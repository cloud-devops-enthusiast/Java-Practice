public class JavaContructors {
    //Creating an attribute for class JavaContructors
    int x;

    //Creating a class constructor, a class constructor is a special method which can be used to initialize objects.
    //This constructor has the same name as of the class
    public JavaContructors(){
        //setting the value for the class attribute x
        x = 7;
    }



    public static void main(String[] args){
        //creating an object of JavaContructors class
        JavaContructors myObj = new JavaContructors();

        //Prnting the assigned value of x
        System.out.println("myObj.x: "+myObj.x);
    }
}
