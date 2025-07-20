import java.util.ArrayList;
import java.util.Collections;

public class JavaListSorting {
    public static void main(String[] args){
        method1();
        System.out.println("***---------------------------------------***");
        method2();
        System.out.println("***---------------------------------------***");
        method3();
        System.out.println("***---------------------------------------***");
        method4();
    }

    public static void method1(){
        ArrayList<String> cars = new ArrayList<String>();
        //adding elements to the ArrayList
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Mahindra");
        cars.add("Hyundai");
        cars.add("Tata");
        cars.add("Volkswagen");
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Toyota");
        //Sorting the elements in ArrayList
        Collections.sort(cars);
        //Printing out the elements of the ArrayList
        for(String i : cars){
            System.out.println("Car Brands: "+i);
        }
    }

    public static void method2(){
        ArrayList<String> cars = new ArrayList<String>();
        //adding elements to the ArrayList
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Mahindra");
        cars.add("Hyundai");
        cars.add("Tata");
        cars.add("Volkswagen");
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Toyota");
        //Reverse Sorting the elements in ArrayList
        Collections.sort(cars, Collections.reverseOrder());
        //Printing out the elements of the ArrayList
        for(String i : cars){
            System.out.println("Car Brands: "+i);
        }
    }

    public static void method3(){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        //Adding elements to Arraylist
        myNumbers.add(95);
        myNumbers.add(61);
        myNumbers.add(62);
        myNumbers.add(24);
        myNumbers.add(49);
        //Sort myNumber
        Collections.sort(myNumbers);
        //Printing out elements from the Arraylist
        for (int i: myNumbers){
            System.out.println("myNumber: "+i);
        }
    }

    public static void method4(){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        //Adding elements to Arraylist
        myNumbers.add(95);
        myNumbers.add(61);
        myNumbers.add(62);
        myNumbers.add(24);
        myNumbers.add(49);
        //Sort ArrayList myNumber in reverse order
        Collections.sort(myNumbers, Collections.reverseOrder());
        //Printing out elements from the Arraylist
        for (int i: myNumbers){
            System.out.println("myNumber: "+i);
        }
    }
}
