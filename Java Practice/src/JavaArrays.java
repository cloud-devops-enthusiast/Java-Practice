import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args){
        basicArray();
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
}
