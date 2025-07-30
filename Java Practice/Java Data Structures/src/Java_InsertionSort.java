public class Java_InsertionSort {
    public static void main(String[] args){
        method1();
    }

    public static void method1(){
        //Declaring an integer type array
        int[] myArray = {64, 32, 25, 12, 22, 11, 90, 5,};
        //Taking the length into an integer type variable
        int myArrayLen = myArray.length;

        //Outer For loop declared
        //In insertion sort the sorting begins with the second element in the array and runs till the end of the array
        //Also in this sort the first item is considered sorted and we insert remaining items one by one
        for(int i = 1 ; i < myArrayLen ; i++){
            //Initializing insertIndex as the current index i
            int insertIndex = i;
            //Assigning the value to the current index of an array
            int currentValue = myArray[i];
            //j is the index just before the current position i.e. j = i - 1
            int j = i - 1 ;

            //This inner while loop shifts all the elements in a sorted position that are greater than the current value to the right.
            //j >= 0 process the whole loop till beginning of the array
            while(j >= 0 && myArray[j] > currentValue ){
                myArray[j + 1] = myArray[j];
                insertIndex = j;
                j--;
            }

            myArray[insertIndex] = currentValue;
        }

        System.out.println("Sorted Array: ");
        for (int value : myArray){
            System.out.println(value + " ");
        }
    }
}
