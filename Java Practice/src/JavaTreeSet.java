//importing the Treeset class
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args){
        //String type TreeSet
        method1();
        System.out.println("***---------------------------------------***");
        //Integer type TreeSet
        method2();
    }

    public static void method1(){
        //Creating a new TreeSet object named myCars
        TreeSet<String> myCars = new TreeSet<>();
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
        //Printing out the elements of the TreeSet
        System.out.println("myCars: "+myCars);
        //Checking if the element exists in the TreeSet
        System.out.println("The TreeSet myCars consist of Mazda: "+myCars.contains("Mazda"));
        System.out.println("The TreeSet myCars consist of Tata: "+myCars.contains("Tata"));
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
        //Removing all the elements
        myCars.clear();
        //Printing out after clearing all the elements
        System.out.println("Printing after clearing the TreeSet: "+myCars);
    }

    public static void method2(){
        //Creating a new TreeSet object named myNum
        TreeSet<Integer> myNum = new TreeSet<>();
        //Adding elements to the TreeSet
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
        //Printing out elements of the TreeSet
        System.out.println("myNum: "+myNum);
        //Looping through the TreeSet
        for(int n:myNum){
            System.out.println("myNum: "+n);
        }
    }
}
