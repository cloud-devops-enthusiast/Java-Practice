public class JavaBubbleSort {
    public static void main(String[] args){
        method1();
        System.out.println("*****----------------*****");
        method2();
    }

    public static void method1(){
        //Declaring Array
        int[] myArray = {64, 34, 25, 12, 11, 90, 5, 87, 73  };
        //Assigning length of array to a variable
        int myArrayLen = myArray.length;
        //declaring outer for loop for passing on one full bubble through the array
        for(int i=0 ; i<myArrayLen-1 ; i++){
            //declaring inner for loop to compare and possibly swap adjacent elements to an unsorted part of array
            //here the number of comparisons decreases as the largest elements "bubble up" to the end.
            for (int j=0 ; j<myArrayLen-i-1 ; j++){
                //comparing the current element to the next element
                //if the current element is greater they need to swap
                if(myArray[j]>myArray[j+1]){
                    //Swapping Logic
                    //using temp variable to hold the value of current element
                    int temp = myArray[j];
                    //assigning the next element value to the current position of array
                    myArray[j] = myArray[j+1];
                    //assigning the next position of array with the temp variable value
                    myArray[j+1] = temp;
                }
            }
        }
        //Printing sorted array
        System.out.println("Sorted Array :");
        //Looping through the array
        for (int i = 0 ; i < myArrayLen ; i++){
            System.out.println(myArray[i]+ "" );
        }
    }

    public static void method2(){
        //This way can be used when the array is almost sorted already, with the lowest number at the start
        //Here the array will be sorted after the first run, but the bubble sort algorithm will continue to run
        //Declaring a new array named myArray
        int[] myArray = {7, 3, 9, 12, 11};
        //Assigning the length of array to a integer type variable
        int myArrayLen = myArray.length;

        //this is an outer loop, this makes sure the sorting process is repeated for each element of array
        for(int i = 0 ; i < myArrayLen - 1 ; i++){
            //declaring a flag for each outer loop iteration
            boolean swapped = false;
            //this is an inner loop, this the largest unsorted value "bubbles" upto the correct position
            for (int j = 0; j < myArrayLen - i - 1 ; j++){
                //to check if the current value of an array is greater than next value of a array
                if(myArray[j] > myArray[j+1]){
                    //Swapping Logic
                    //assigning the current value to a temp variable
                    int temp = myArray[j];
                    //assigning the next array position element to current position of array
                    myArray[j] = myArray[j+1];
                    //assigning temp value to next position of array
                    myArray[j+1] = temp;
                    //turning on the flag to true
                    swapped = true;
                }
            }
            //Check the flag value
            if(!swapped){
                //if it is not true it will break the outer for loop
                break;
            }
        }
        //Printing out the sorted array
        System.out.println("Sorted Array: ");
        //Looping through the array
        for (int i=0; i<myArrayLen ; i++){
            System.out.println(myArray[i] + " ");
        }
    }
}
