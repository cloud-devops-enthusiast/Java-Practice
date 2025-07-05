import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args){
        basicArray();
        System.out.println("***---------------------------------------***");
        arrayLoop();
        System.out.println("***---------------------------------------***");
        multiDimensionalArray();
    }

    public static void basicArray(){
        String[] cars = {"Tata","Volvo","Mahindra","BMW","Ford","Audi","Honda"};
        //Printing the array based on its index
        System.out.println("cars[0]: "+cars[0]);
        //Printing out the length of an array
        System.out.println("cars.length: "+cars.length);
        //Printing out all the data of an array named cars
        System.out.println("cars: "+ Arrays.toString(cars));
        //Dynamically adding cars at the [0] index
        cars[0]="Mercedes";
        //Printing the dynamically added car to the output
        System.out.println("cars[0]: "+cars[0]);
    }

    public static void arrayLoop(){
        String[] chocolate = {"Dairy Milk", "Bournvile", "Kitkat", "Lindt", "Hersheys","Eclairs"};
        for(int i = 0; i < chocolate.length; i++){
            System.out.println("Chocolate: "+chocolate[i]);
        }
    }

    private static void multiDimensionalArray(){
        int [] [] myNumbers = {{1,2,3,4},{5,6,7,8}};
        //This example accesses the third element (2) in the second array (1) of myNumbers
        System.out.println("myNumbers: "+myNumbers[1][2]);
    }
}
