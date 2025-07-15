import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args){
        input1();
        input2();
    }

    public static void input1(){
        //Creating a scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your username: ");

        //Read user input
        String username = myObj.nextLine();
        //Output the user input
        System.out.println("Entered Username is: "+username);
    }

    public static void input2(){
        //Creating a scanner object
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your name, age and Contact No:");

        //String input
        String name = myObj.nextLine();

        //Numeric values
        int age = myObj.nextInt();
        double contactNo = myObj.nextDouble();

        //Output input by user
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Contact No: "+contactNo);
    }
}
