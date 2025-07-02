public class JavaForLoop {
    public static void main(String[] args){
        simpleForLoop();
        System.out.println("***---------------------------------------***");
        sumNumberForLoop();
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
}
