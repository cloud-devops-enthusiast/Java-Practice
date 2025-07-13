import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args){
        input1();
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
}
