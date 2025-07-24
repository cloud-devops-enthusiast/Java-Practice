public class JavaFibonacci {
    public static void main(String[] args){
        method1();
        System.out.println("*****-------------*****");
        System.out.println(0);
        System.out.println(1);
        method2(1,0);
    }

    public static void method1(){
        //Declaring two integer variables
        //Two variables to hold two fibonacci numbers
        int var2 = 0;
        int var1 = 1;

        //Checking out of values of Variables
        System.out.println("Variable 2: "+var2);
        System.out.println("Variable 1: "+var1);

        //Looping to make the fibonacci series
        //This loop runs 18 times
        for(int fibo = 0 ; fibo < 18 ; fibo++){
            //Creating a new fibonacci number by adding two previous ones
            int newFibo = var1 + var2;
            System.out.println("Value: "+newFibo);
            //Updating the variables to hold the values of those previous two fibonacci numbers
            var2 = var1;
            var1 = newFibo;
        }
    }

    public static void method2(int prev1, int prev2){
        //Creating a new variable count
        int count = 2;
        if (count <= 19) {
            int newFibo = prev1 + prev2;
            System.out.println(newFibo);
            prev2 = prev1;
            prev1 = newFibo;
            count += 1;
            //method calling itself
            method2(prev1, prev2);
        } else {
            return;
        }
    }
}
