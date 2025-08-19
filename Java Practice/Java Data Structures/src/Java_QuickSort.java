public class Java_QuickSort {
    public static void main(String[] args){
        int[] myArray = {62, 43, 52, 32, 12, 22, 21, 93, 4};
        quickSort(myArray, 0, myArray.length-1);

        System.out.println("Sorted Array: ");
        for(int value : myArray){
            System.out.println(value + " ");
        }
    }

    public static void quickSort(int[] myArray, int low, int high){
        if(low<high){
            int pivotIndex = partition(myArray, low, high);
            quickSort(myArray, low, pivotIndex-1);
            quickSort(myArray, pivotIndex+1, high);
        }
    }

    public static int partition(int[] myArray, int low, int high){
        int pivot = myArray[high];

        int i = low - 1;

        for(int j = low; j < high; j++){
            if(myArray[j] <= pivot){
                i++;
                int temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
            }
        }

        int temp = myArray[i + 1];
        myArray[i + 1] = myArray[high];
        myArray[high] = temp;
        return i + 1;
    }
}
