public class JavaMethodReturn {
    public static void main(String[] args){
        testMethod();
        System.out.println("***---------------------------------------***");
        testMethod2();
    }

    static int firstMethod(int x){
        return 5 + x;
    }

    static void testMethod(){
        System.out.println("Value: "+firstMethod(12));
    }

    static int secondMethod(int x, int y){
        return x+y;
    }

    static void testMethod2(){
        System.out.println("Sum of X and Y: "+secondMethod(5,9));
    }
}
