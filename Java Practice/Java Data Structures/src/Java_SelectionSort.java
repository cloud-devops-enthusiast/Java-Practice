public class Java_SelectionSort {
    public static void main(String[] args){
        method1();
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
}
