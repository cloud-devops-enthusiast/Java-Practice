public class TypeCasting {
    public static void main(String[] args){
        WideningCasting();
        NarrowingCasting();
        RealifeCasting();
    }

    public static void WideningCasting(){
        //Widening Casting
        int i = 12;
        double testDouble = i;
        //Printing both the values
        System.out.println("Integer Value: "+i);
        System.out.println("Double Value: "+ testDouble);
    }

    protected static void NarrowingCasting(){
        //Narrowing Casting
        double testDouble1 = 7.62d;
        //Manual Casting Double to int
        int i1 = (int)testDouble1;
        //Printing out all the values
        System.out.println("Value of double: "+ testDouble1);
        System.out.println("Value of integer: "+ i1);
    }

    protected static void RealifeCasting(){
        //RealLifeCasting
        int maxAmount = 550;
        int testAmount = 237;
        //Calculating the Percentage
        float finalValue = (float) testAmount / maxAmount * 100;
        //Printing the percentage
        System.out.println("Pecentage is "+ finalValue);
    }
}
