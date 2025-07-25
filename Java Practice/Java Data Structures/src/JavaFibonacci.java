public class JavaFibonacci {
    public static void main(String[] args){
        method1();
        System.out.println("*****----------------*****");
        method2(0,1,1);
        System.out.println("*****----------------*****");
        method4();
    }

    public static void method1(){
        //Declaring two integer variables
        //Two variables to hold two fibonacci numbers
        int var2 = 0;
        int var1 = 1;

        //Checking out of values of Variableszxsedr2
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

    public static void method2(int prev1, int prev2, int count){
        //if you declare variable count the output will overflow and break the whole process
        //Checking the value of variable count is less than or equals to 10
        if (count <= 10) {
            //Declaring and assigning value to newFibo to create a fibonacci series
            //As fibonacci pattern is about the addition of last two results
            int newFibo = prev1 + prev2;
            System.out.println("Count: "+count+" Fibonacci No: "+newFibo);
            //Assiging prev1 value to prev 2 so it can be passed on next time
            prev2 = prev1;
            //Assigning newFibo which is a new fibonacci just created so it can be used in next iteration while adding with the prev2 number.
            prev1 = newFibo;
            //method calling itself
            //Recursion
            method2(prev1, prev2, count+1);
        } else {
            return;
        }
    }

    public static int method3(int n){
        //Finding the nth Fibonacci Number using Recursion
        //This means the Fibonacci Number of a certain number which you pass at any given nth position
        //F(n) = F(n-1)+F(n-2) (Here n is like the 10th Fibonacci Number which is the sum of 8th and 9th Fibonacci Numbers)
        //Printing out the value of (n-1) and (n-2)
        if(n <= 1){
            return n;
        }
        else {
            //Applying the formula F(n)=F(n-1)+F(n-2)
            return method3(n-1) + method3(n-2);
        }
    }

    public static void method4(){
        int n = 19;
        //Printing out the value of (n-1) and (n-2)
        System.out.println("n-1: "+(n-1));
        System.out.println("n-2: "+(n-2));
        //like here is the addition of 17th and 18th Fibonacci Numbers
        System.out.println("Addition of the last two number of Fibonacci Series: "+method3(n));
    }
}
