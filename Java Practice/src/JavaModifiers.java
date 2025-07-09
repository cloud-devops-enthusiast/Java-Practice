class FamilDetails{
    protected String fatherName = "Virpal Singh";
    protected String motherName = "Alka Singh";
    protected int numberOfSibings = 0;
}

public class JavaModifiers extends FamilDetails{
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

        System.out.println("***---------------------------------------***");

        //Making constructor out of the class
        JavaModifiers myObj1 = new JavaModifiers();
        //Accessing the private Modifier variables
        System.out.println("Name: "+myObj1.name);
        System.out.println("Email ID: "+myObj1.emailId);
        System.out.println("Age: "+myObj1.age);

        System.out.println("***---------------------------------------***");

        //Making constructor out of the class
        JavaModifiers myObj2 = new JavaModifiers();
        //Accessing protected variables out of class familyDetails
        System.out.println("Father Name: "+myObj2.fatherName);
        System.out.println("Mother Name: "+myObj2.motherName);
        if(myObj2.numberOfSibings==0){
            System.out.println("There are no siblings of abhinav.");
        }
        else {
            System.out.println("There are "+myObj2.numberOfSibings+" number of siblings of abhinav");
        }
    }

}
