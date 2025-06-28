public class JavaOperators {
    public static void main(String[] args){
        arithmeticOperator();
        assignmentOperator();
    }

    protected static void arithmeticOperator(){
        //Declaring two integer type values
        int x,y;
        x=7;
        y=3;
        //Using different arithmetic operators on the two operands
        System.out.println("Additional Operator: "+ (x+y));
        System.out.println("Subtraction Operator: "+ (x-y));
        System.out.println("Multiplication Operator: "+ (x*y));
        System.out.println("Division Operator: "+ (x/y));
        System.out.println("Modulus Operator: "+ (x%y));
        System.out.println("Increment Operator: "+ (x++));
        System.out.println("Decrement Operator: "+ (x--));
    }

    private static void assignmentOperator(){
        //Declaring a variable
        int x,y;
        x=6;
        y=9;
        System.out.println("x= "+x);
        x+=3;
        System.out.println("x+= "+x);
        x-=3;
        System.out.println("x-= "+x);
        x*=3;
        System.out.println("x*= "+x);
        x/=3;
        System.out.println("x/= "+x);
        y%=2;
        System.out.println("y%= "+y);
        x&=3;
        System.out.println("x&= "+x);
        x|=3;
        System.out.println("x|= "+x);
        x^=3;
        System.out.println("x^= "+x);
        x>>=3;
        System.out.println("x>>= "+x);
        x<<=3;
        System.out.println("x<<= "+x);
    }
}
