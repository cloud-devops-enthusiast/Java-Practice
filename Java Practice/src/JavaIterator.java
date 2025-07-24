//Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args){
        //Creating a method with String type Collection
        method1();
        //Creating a method with Integer type Collection
        method2();
    }

    public static void method1(){
        //Make a collection
        ArrayList<String> myCars = new ArrayList<String>();
        myCars.add("Volvo");
        myCars.add("BMW");
        myCars.add("Mahindra");
        myCars.add("Tata");
        myCars.add("Hyundai");
        myCars.add("Kia");
        myCars.add("Nissan");
        myCars.add("BMW");//Duplicate Entry
        myCars.add("Renault");
        myCars.add("Honda");
        myCars.add("Tata");//Duplicate Entry
        myCars.add("Jeep");
        myCars.add("BYD");

        //Get the iterator
        Iterator<String> it = myCars.iterator();

        //Print the first item
        System.out.println("Value First: "+it.next());

        //Looping through a collection
        while (it.hasNext()){
            System.out.println("While Loop: "+it.next());
        }
    }

    public static void method2(){
        //Make a collection
        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        myNumber.add(95);
        myNumber.add(61);
        myNumber.add(62);
        myNumber.add(24);
        myNumber.add(9);
        myNumber.add(49);
        myNumber.add(84);
        myNumber.add(59);
        myNumber.add(49);
        myNumber.add(6);
        myNumber.add(69);
        myNumber.add(62);

        //Getting the iterator
        Iterator<Integer> it = myNumber.iterator();

        //Printing the collection before removal of element less than 10
        System.out.println("Numbers(Before): "+myNumber);

        //Creating a while loop for removing elements less than 10
        while(it.hasNext()){
            Integer i = it.next();
            if(i < 10){
                it.remove();
            }
        }

        //Printing the collection after removal of element less than 10
        System.out.println("Numbers(After): "+myNumber);
    }
}
