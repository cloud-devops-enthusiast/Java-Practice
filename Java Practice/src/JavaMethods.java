public class JavaMethods {
    public static void main(String[] args){
        firstMethod();
        System.out.println("***---------------------------------------***");
        callMethodMultipleTime();
        System.out.println("***---------------------------------------***");
        callMethodMultipleTime();
        System.out.println("***---------------------------------------***");
        callMethodMultipleTime();
        System.out.println("***---------------------------------------***");
        callMethodMultipleTime();
        System.out.println("***---------------------------------------***");
        callMethodMultipleTime();
        System.out.println("***---------------------------------------***");
        javaMethodTest();
        System.out.println("***---------------------------------------***");
        javaMethodTest2();
        System.out.println("***---------------------------------------***");
        accessLevelCheck();
    }

    public static void firstMethod(){
        System.out.println("This is an identifier that control is in First Method.");
        secondMethod();
    }

    public static void javaMethod(String fname){
        System.out.println(fname+" is my bestfriend.");
    }

    public static void javaMethodTest(){
        javaMethod("Kaushiki");
        javaMethod("Deepali");
        javaMethod("Vaishali");
        javaMethod("Prerna");
    }

    public static void multiParameter(String object, int age){
        System.out.println("Age of "+object+" is "+age+ "years old.");
    }

    public static void javaMethodTest2(){
        multiParameter("Table",2);
        multiParameter("chair",3);
        multiParameter("Fan",1);
        multiParameter("Monitor",4);
        multiParameter("laptop",1);
        multiParameter("Pillow",6);
        multiParameter("Bed",7);
    }

    public static void checkAcces(int level){
        if(level==1){
            System.out.println("You've the owner access.");
        }
        else if(level==2){
            System.out.println("You've the editor access.");
        }
        else if(level==3){
            System.out.println("You've the viewer access.");
        }
        else{
            System.out.println("You don't have access.");
        }
    }

    public static void accessLevelCheck(){
        checkAcces(1);
        checkAcces(2);
        checkAcces(3);
        checkAcces(0);
    }

    public static void secondMethod(){
        System.out.println("This is an identifier that control is in second Method.");
    }

    protected static void callMethodMultipleTime() {
        System.out.println("This is a test String for printing it again and again.");
    }
}
