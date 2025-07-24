//import the HashSet class
import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args){
        //String type HashSet
        method1();
        System.out.println("***---------------------------------------***");
        //Integer type HashSet
        method2();
    }

    public static void method1(){
        //Creating a new HashSet object named myCars
        HashSet<String> myCars = new HashSet<String>();
        //Adding the new values to the HashSet
        myCars.add("Chevrolet");
        myCars.add("Honda");
        myCars.add("Mahindra");
        myCars.add("Tata");
        myCars.add("Hyundai");
        myCars.add("Kia");
        myCars.add("Renault");
        myCars.add("Tata");//Adding a duplicate entry
        myCars.add("Maruti Suzuki");
        myCars.add("Alfa Romero");
        myCars.add("Nissan");
        myCars.add("Volvo");
        //Printing out all the elements of Hashset
        System.out.println("myCars: "+myCars);
        //Checking if the element exists
        System.out.println("Does myCars HashSet contains BMW: "+myCars.contains("BMW"));
        System.out.println("Does myCars HashSet contains Volvo: "+myCars.contains("Volvo"));
        //Adding a random element to myCars
        myCars.add("BMW");
        //Printing HashSet after adding an Element
        System.out.println("Printing HashSet before removal of element: "+myCars);
        //Removing an element from the HashSet
        myCars.remove("BMW");
        //Printing HashSet after Removing an Element
        System.out.println("Printing HashSet after removal of element: "+myCars);
        //Getting the size of the HashSet
        System.out.println("myCars Length: "+myCars.size());
        //Looping through the HashSet
        for (String i:myCars){
            System.out.println("myCar Element: "+i);
        }
        //Removing all the elements of the HashSet
        myCars.clear();
        System.out.println("Printing out the Elements after Clear(): "+myCars);
    }

    public static void method2(){
        //Creating a new HashSet object named newSet
        HashSet<Integer> newSet = new HashSet<Integer>();
        //Adding the new values to the HashSet
        newSet.add(95);
        newSet.add(61);
        newSet.add(62);
        newSet.add(24);
        newSet.add(49);
        newSet.add(84);
        newSet.add(59);
        newSet.add(49);//Duplicate Record
        newSet.add(69);
        newSet.add(62);//Duplicate Record

        //Showing the numbers available from 10 to 99
        for (int i = 10; i<=99 ; i++){
            //Checking for the values in the HashSet
            if(newSet.contains(i)){
                System.out.println(i+" is found in the HashSet named newSet.");
            }
            else{
                System.out.println(i+" is not found in the HashSet named newSet");
            }
        }

    }
}
