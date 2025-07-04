public class JavaBreakContinue {
    public static void main(String[] agrs){
        basicBreak();
        System.out.println("***---------------------------------------***");
        basicContinue();
        System.out.println("***---------------------------------------***");
        whileBreak();
        System.out.println("***---------------------------------------***");
        whileContinue();
    }

    public static void basicBreak(){
        //this function stops the loop when i is equal to 4
        for(int i = 0; i < 10; i++){
            if(i==4){
                break;
            }
            System.out.println("i: "+i);
        }
    }

    public static void basicContinue(){
        //the continue statement breaks one iteration (in the loop)
        //here 4 is not there in the output
        for(int i = 0; i <10; i++){
            if(i == 4){
                continue;
            }
            System.out.println("i: "+i);
        }
    }

    public static void whileBreak(){
        int i = 0;
        while (i < 10){
            System.out.println("i: "+i);
            i++;
            if(i==4){
                break;
            }
        }
    }

    public static void whileContinue(){
        int i = 0;
        while (i < 10){
            if (i == 4){
                i++;
                continue;
            }
        System.out.println("i: "+i);
        i++;
        }
    }
}
