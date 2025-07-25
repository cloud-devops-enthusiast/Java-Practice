import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args){
        //String array
        String[] cars = {"Honda","Tata","Volvo","BMW","Mahindra","Renault","Suzuki","Citroen","Nissan"};
        //Integer array
        int[] myNum = {95,61,62,24,49,4,5,99};

        //Printing String Array
        for(int i = 0 ; i < cars.length ; i++){
            System.out.println("Cars: "+cars[i]);
        }
        //Printing Integer Array
        for (int i = 0 ; i < myNum.length ; i++) {
            System.out.println("myNum: " + myNum[i]);
        }
    }
}
