public class JavaClassMethod {
    static void myMethod(){
        System.out.println("Pain is inevitable, but suffering is optional.");
    }

    //Static Method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    //Public Method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    //create a fullThrottle public method
    public void fullThrottle(){
        System.out.println("The Car is going too fast.");
    }

    //create a speed public method with an integer parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is: "+maxSpeed);
    }

    //Main Method
    public static void main(String[] args){
        //A normal static type method
        myMethod();

        //Call the static method
        myStaticMethod();

        //myPublicMethod();
        //If you do this, it will throw a compilation error

        //Create an object of JavaClassMethod
        JavaClassMethod myObj = new JavaClassMethod();

        //Call the public method on the object
        myObj.myPublicMethod();

        //Creating a new object of JavaClassMethod
        JavaClassMethod myCar = new JavaClassMethod();

        //Call the fullThrottle method
        myCar.fullThrottle();

        //Call the speed() method
        myCar.speed(120);
    }
}
