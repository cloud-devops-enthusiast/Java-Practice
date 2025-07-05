public class JavaMethodOverloading {
    public static void main(String[] args){
        //With method overloading, multiple methods can have the same name with different parameters.
        addMethod();
        //Here you can check addMethod is defined 3 times but 1st time it is defined as int type, 2nd time as double and 3rd time is void type
    }

    static int addMethod(int x, int y){
        return x + y;
    }

    static double addMethod(double x, double y){
        return x + y;
    }

    static void addMethod(){
        System.out.println("Int Type addMethod(): "+addMethod(3,9));
        System.out.println("Double Type addMethod(): "+addMethod(4.9,9.2));
    }
}
