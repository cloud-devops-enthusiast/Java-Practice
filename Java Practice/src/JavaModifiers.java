public class JavaModifiers {
    //For class you can use only public or default java modifiers
    private String name = "Abhinav Virpal Singh";
    private String emailId = "abhinav41999@gmail.com";
    private int age = 26;

    //For attributes, methods and constructors, you have Public, Private, Protected and Default modifiers
    //Public Modifiers lets the code to be accessible for all the classes
    //Private Modifiers lets the code to be accessible within the declared access
    //Protected Modifiers lets the code to be accessible in the same package and subclasses
    public static void main(String[] args){
        //Accessing variables from JavaClasses.java file, it will be accesible here as it is defined in a public class.
        JavaClasses myObj = new JavaClasses();
        System.out.println("int x: "+myObj.x);
        System.out.println("int result: "+myObj.result);

        //Making constructor out of the class
        JavaModifiers myObj1 = new JavaModifiers();
        //Accessing the private Modifier variables
        System.out.println("Name: "+myObj1.name);
        System.out.println("Email ID: "+myObj1.emailId);
        System.out.println("Age: "+myObj1.age);
    }

}
