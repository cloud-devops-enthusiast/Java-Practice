public class JavaOperators {
    public static void main(String[] args){
        arithmeticOperator();
        System.out.println("***---------------------------------------***");
        assignmentOperator();
        System.out.println("***---------------------------------------***");
        comparisonOperator();
        System.out.println("***---------------------------------------***");
        logicaloperator();
        System.out.println("***---------------------------------------***");
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

    private static void comparisonOperator(){
        int x,y;
        x=5;
        y=7;
        System.out.println("x:"+x+" "+"y:"+y);
        System.out.println("Equal to Operator(==): "+(x==y));
        System.out.println("Not equal Operator: "+(x!=y));
        System.out.println("Greater than: "+(x>y));
        System.out.println("Less than: "+(x<y));
        System.out.println("Greater than or Equal to: "+(x>=y));
        System.out.println("Less than or Equal to: "+(x<=y));
    }

    protected static void logicaloperator(){
        int x = 5;
        System.out.println("x:"+x);
        System.out.println("logical AND Operator: "+(x>3 && x<10));
        System.out.println("Logical OR Operator: "+(x>2 || x<10));
        System.out.println("Logical NOT Operator: "+!(x>3 && x<10));
    }
}
