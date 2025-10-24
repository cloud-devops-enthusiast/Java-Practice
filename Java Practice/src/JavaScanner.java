//Importing the scanner class
import java.util.Scanner;
//Writing String to a file
//Importing the File class
import java.io.File;
//Importing this class to handle the errors
import java.io.FileNotFoundException;

public class JavaScanner {

    public static void main(String[] args){
        //Using simple scanner object
        Print();
        //Using a method to read out the contents from a file
        printFile();
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

    public static void printFile(){
        //Creating try catch block for effective error handelling
        try {
            //Creating object of the file
            File myObj = new File("/Users/abhinav/Developer/Java-Practice/Java Practice/src/Test.txt");
            //Creating object for the scanner class
            Scanner myScanner = new Scanner(myObj);
            //Checking for data in the file
            while ((myScanner.hasNextLine())){
                String data = myScanner.nextLine();
                //Printing out the file data line by line
                //There is backlog of this feature that it will print out even the blank lines as well
                System.out.println("Data: "+data);
            }
            //Close method is called here when reading of data is completed from the file
            myScanner.close();
        } catch (FileNotFoundException e) {
            //Error Handelling
            System.out.println("Some Error has been occured.");
            throw new RuntimeException(e);
        }
    }
}
