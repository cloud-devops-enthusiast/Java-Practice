public class JavaClasses {
    int x = 10;

    public static void main(String[] args){
        //Creating multiple objects
        //Creating First Object myobj
        JavaClasses myobj = new JavaClasses();
        //Creating another object myobj2
        JavaClasses myobj2 = new JavaClasses();
        //Accessing variable from class object
        System.out.println("myobj: "+myobj.x);
        System.out.println("myobj1: "+myobj2.x);
    }
}
