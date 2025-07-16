//Import the file class
import java.io.File;
//Import the filewriter class
import java.io.FileNotFoundException;
import java.io.FileWriter;
//Import the IOException class to handle errors
import java.io.IOException;
//Import the scanner class to read text files
import java.util.Scanner;

public class JavaCreateFile {
    public static void main(String[] args){
        try {
            //Creating object for the File
            File myObj = new File("Filename.txt");
            //Creating a new File
            if(myObj.createNewFile()){
                System.out.println("File created: "+myObj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
            //Getting information regarding the files
            if(myObj.exists()){
                System.out.println("File Name: "+myObj.getName());
                System.out.println("Absolute Path: "+myObj.getAbsolutePath());
                System.out.println("Writable: "+myObj.canWrite());
                System.out.println("Readable: "+myObj.canRead());
                System.out.println("File size in bytes: "+myObj.length());
            }
            else {
                System.out.println("File already exists.");
            }
            //Writing to the file
            FileWriter myObj1 = new FileWriter("Filename.txt");
            myObj1.write("Files in java might be tricky, but it is fun enough!!!");
            myObj1.close();
            System.out.println("Successfully wrote to the file");
            //Read file from the folder
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println("Data in File: "+data);
            }
            myReader.close();
            //Delete file from the folder
            if(myObj.delete()){
                System.out.println("Deleted the file: "+myObj.getName());
            }
            else {
                System.out.println("Failed to delete the file.");
            }
        }
        catch(IOException e) {
            System.out.println("Error has been occurred.");
            e.printStackTrace();
        }
    }
}
