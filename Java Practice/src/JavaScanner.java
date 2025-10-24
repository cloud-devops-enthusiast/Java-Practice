//Importing the scanner class
import java.util.Scanner;

public class JavaScanner {

    public static void main(String[] args){
        Print();
    }

    public static void Print(){
        //Creating a scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please Enter your Username");

        //Reading User Input
        String userName = myObj.nextLine();
        System.out.println("The Entered Username is :"+userName);

        //Allowed Username
        String allowedUser = "abhinav41999";

        //Creating an if block of code for check
        if(userName.compareTo(allowedUser)==0){
            System.out.println("The User has access to the System.");
        }
        else {
            System.out.println("The User you have entered doesn't have access to the system.");
        }
    }
}
