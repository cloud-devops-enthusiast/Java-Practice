public class JavaMethods {
    public static void main(String[] args){
        firstMethod();
        System.out.println("***---------------------------------------***");
        callMethodMultipleTime();
        callMethodMultipleTime();
        callMethodMultipleTime();
        callMethodMultipleTime();
        callMethodMultipleTime();
    }

    public static void firstMethod(){
        System.out.println("This is an identifier that control is in First Method.");
        secondMethod();
    }

    public static void secondMethod(){
        System.out.println("This is an identifier that control is in second Method.");
    }

    protected static void callMethodMultipleTime(){
        System.out.println("This is a test String for printing it again and again.");
    }
}
