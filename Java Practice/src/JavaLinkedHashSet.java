//import the LinkedHashSet class
import java.util.LinkedHashSet;

public class JavaLinkedHashSet {
    public static void main(String[] args){
        //String type LinkedHashSet
        method1();
        System.out.println("***---------------------------------------***");
        //Integer type LinkedHashSet
        method2();
    }

    public static void method1(){
        //Creating a new LinkedHashSet object named myCars
        LinkedHashSet<String> myCars = new LinkedHashSet<>();
        //Adding elements to the TreeSet
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
        //Printing out the elements of the LinkedHashSet
        System.out.println("myCars: "+myCars);
        //Checking for the Element in LinkedHashSet
        System.out.println("LinkedHashSet consists of Mazda: "+myCars.contains("Mazda"));
        System.out.println("LinkedHashSet consists of Tata: "+myCars.contains("Tata"));
        //Adding an random car brand to myCars TreeSet
        myCars.add("Toyota");
        //Printing out the TreeSet
        System.out.println("Printing after adding a random element: "+myCars);
        //Removing an element from the TreeSet
        myCars.remove("Toyota");
        //Printing out the TreeSet after removing the element
        System.out.println("Printing after removing an element: "+myCars);
        //Getting the size of the TreeSet
        System.out.println("Size of myCar: "+myCars.size());
        //Looping through the TreeSet
        for(String i:myCars){
            System.out.println("myCars: "+i);
        }
        //Removing all the elements
        myCars.clear();
        //Printing out after clearing all the elements
        System.out.println("Printing after clearing the LinkedHashSet: "+myCars);
    }

    public static void method2(){
        //Creating a new TreeSet object named myNum
        LinkedHashSet<Integer> myNum = new LinkedHashSet<>();
        //Adding elements to the LinkedHashSet
        myNum.add(95);
        myNum.add(61);
        myNum.add(62);
        myNum.add(24);
        myNum.add(49);
        myNum.add(84);
        myNum.add(59);
        myNum.add(49);//Duplicate Entries
        myNum.add(69);
        myNum.add(62);//Duplicate Entries
        //Getting the size of the TreeSet
        System.out.println("Size of myNum: "+myNum.size());
        //Printing out elements of the LinkedHashSet
        System.out.println("myNum: "+myNum);
        //Looping through the LinkedHashSet
        for(int n:myNum){
            System.out.println("myNum: "+n);
        }
    }
}
