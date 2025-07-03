public class JavaForLoop {
    public static void main(String[] args){
        simpleForLoop();
        System.out.println("***---------------------------------------***");
        sumNumberForLoop();
        System.out.println("***---------------------------------------***");
        nestedForLoop();
        System.out.println("***---------------------------------------***");
        nestedMultiplication();
    }

    private static void simpleForLoop(){
        for (int i=0; i<10; i++){
            System.out.println("Count: "+i);
        }
    }

    private static void sumNumberForLoop(){
        int sum = 0;
        for(int i=0; i<10; i++){
            sum = sum+1;
            System.out.println("Sum of sum+1: "+sum);
        }
    }

    public static void nestedForLoop(){
        //Outer Loop
        for(int i = 0; i<=2; i++){
            System.out.println("Outer loop value of i: "+i);
            //Inner Loop
            for(int j = 0; j<=3; j++){
                System.out.println("Inner loop value of j: "+j);
            }
        }
    }

    private static void nestedMultiplication(){
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <=3; j++){
                System.out.println("i * j: "+(i*j));
            }
            System.out.println("");
        }
    }
}
