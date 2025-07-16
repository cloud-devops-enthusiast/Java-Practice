import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String[] args){
        method1();
        System.out.println("***---------------------------------------***");
        method2();
    }

    public static void method1(){
        //Creating an object of ArrayList
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Tata");
        cars.add("Suzuki");
        cars.add("Hyundai");
        cars.add("Kia");
        cars.add("Tesla");
        cars.add("Honda");
        System.out.println("Cars: "+cars);
        //Adding element at index 0
        cars.add(0,"Mahindra");
        //Adding element at index 1
        cars.add(1,"Renault");
        System.out.println("Cars after Addition: "+cars);
        //Finding the size of ArrayList
        System.out.println("Cars Length(): "+cars.size());
        //Removing element at index 1
        cars.remove(1);
        //Printing out after removal
        System.out.println("Cars after deletion: "+cars);
        //Sorting out the Arraylist
        Collections.sort(cars);
        System.out.println("Cars after sort: "+cars);
        //Clearing out all the elements in the field
        cars.clear();
        System.out.println("Cars after clear(): "+cars);
    }

    public static void method2(){
        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        myNumber.add(95);
        myNumber.add(61);
        myNumber.add(62);
        myNumber.add(24);
        myNumber.add(49);
        for (int i:myNumber){
            System.out.println("myNumber: "+i);
            System.out.println("***---***");
        }
    }
}
