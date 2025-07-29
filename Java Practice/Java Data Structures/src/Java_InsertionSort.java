public class Java_InsertionSort {
    public static void main(String[] args){
        method1();
    }

    public static void method1(){
        int[] myArray = {64, 32, 25, 12, 22, 11, 90, 5,};
        int myArrayLen = myArray.length;

        for(int i = 1 ; i < myArrayLen ; i++){
            int insertIndex = i;
            int currentValue = myArray[i];
            int j = i - 1 ;

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
