public class JavaBooleans {
    public static void main(String[] agrs){
        //boolean data types
        boolean test1 = true;
        boolean test2 = false;
        //Printing out these variables
        System.out.println("test1: "+test1);
        System.out.println("test2: "+test2);
        int x, y;
        x = 10;
        y = 9;
        //Using > (Greater) Operator
        System.out.println("Is 10 is greater than 9: "+(x>y));
        //Using < (Less) Operator
        System.out.println("Is 10 is less than 9: "+(x<y));
        //Using == Equals to Operator
        System.out.println("Is the value of x is equal to 10: "+(x==10));
        System.out.println("Is the value of y is equal to 4: "+(y==4));
        //Using greater than or equal to operator (>=)
        int legalDrinkingAge=25;
        int myAge=26;
        System.out.println("Am i under the legal drinking age: "+(myAge>=legalDrinkingAge));
    }
}
