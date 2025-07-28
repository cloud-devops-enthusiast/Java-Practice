public class Java_SelectionSort {
    public static void main(String[] args){
        method1();
        System.out.println("*****----------------*****");
        method2();
    }

    public static void method1(){
        //Declaring an Integer type arrau
        int[] myInt = {64, 34, 25, 5, 22, 11, 90, 12};
        //Taking value of myInt array length to an integer
        int myIntLen = myInt.length;

        //Outer For loop to iterate over array myInt from the first index to the second last index.
        for(int i = 0 ; i < myIntLen - 1 ; i++){
            //initialize minIndex to the current position
            int minIndex = i;
            //Inner For loop to look for the minimum value in the unsorted part of an array
            for(int j = i + 1 ; j < myIntLen ; j++){
                //Comparing the current element with the current minimum found
                if(myInt[j] <myInt[minIndex]){
                    //Updates the position of smallest value which is found so far
                    minIndex = j;
                }
            }
            //After completing the inner loop store the minimun value in temp variable
            int minValue = myInt[minIndex];
            //To move elements between i and minIndex to right and make place at position i for minimum value
            for (int k = minIndex ; k > i ; k--){
                //To move each element to the next slot
                myInt[k] = myInt[k-1];
            }
            //Now the i position has the smallest value assigned to it
            myInt[i] = minValue;
        }

        System.out.println("Sorted Array: ");
        for (int i = 0 ; i < myIntLen ; i++){
            System.out.println(myInt[i] + " ");
        }
    }

    public static void method2(){
        //Declaring an integer type array
        int[] myArray = {99, 17, 19, 37, 92, 87, 77, 10, 29, 39};
        //Assigning the length of array to an integer variable
        int myArrayLen = myArray.length;

        //Outer Loop for running through once for each element in the array
        for (int i = 0 ; i < myArrayLen ; i++){
            //This variable will be used to keep the index of the smallest value found
            int minIndex = i;
            //This for loop is for searching the unsorted portion of the array (from 'i+1' to 'n-1')
            for (int j = i + 1 ; j < myArrayLen ; j++){
                //Comparing and Updating minIndex with j
                //This will update if the element at j is smaller than the element at minIndex
                if(myArray[j] < myArray[minIndex]) {
                    //minIndex will always hold the index of the smallest value in the unsorted part
                    minIndex = j;
                }
            }
            //Swapping Logic
            //Storing the value of i element to a temp variable
            int temp = myArray[i];
            //Swapping the smallest value found at minIndex
            myArray[i] = myArray[minIndex];
            //Swapping the value with the swapped value
            myArray[minIndex] = temp;
        }

        System.out.println("Sorted Array: ");
        for (int i = 0 ; i < myArrayLen ; i++){
            System.out.println(myArray[i] + " ");
        }
    }
}
