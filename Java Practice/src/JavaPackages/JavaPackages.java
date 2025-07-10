//A package in java is used to group related classes.
//There are two types of packages: Built-in Packages(Packages from the java API) and User-Defined Packages(Creating your own packages)
//Creating a package, by using "package" keyword
package JavaPackages;

import java.util.Scanner;

public class JavaPackages {
    public static void main(String[] args){
        //Creating constructor for the same
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username: ");

        //Getting the value from Console
        String userName = myObj.nextLine();
        System.out.println("UserName is "+userName);
    }
}
