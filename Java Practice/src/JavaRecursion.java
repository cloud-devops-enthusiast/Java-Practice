public class JavaRecursion {
    //Recursion is a process in which a fucntion calls itself directly or indirectly.
    public static void main(String[] args){
        int result = sum(10);
        System.out.println("Result: "+result);
    }

    public static int sum(int k){
        //function defined
        if(k>0){
            //function called again inside the same function
            return k + sum(k - 1);
        }
        else {
            return 0;
        }
    }
}
