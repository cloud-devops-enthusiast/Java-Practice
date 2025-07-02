public class JavaConditionalStatements {
    public static void main(String[] agrs){
        //In this program we will be practising across conditional statements available in java.
        //Trying out if Statement
        ifStatement();
        System.out.println("***---------------------------------------***");
        whileStatement();
        System.out.println("***---------------------------------------***");
        elseIfStatement();
        System.out.println("***---------------------------------------***");
        shortHandIf();
        System.out.println("***---------------------------------------***");
        realLifeExample();
        System.out.println("***---------------------------------------***");
    }

    private static void ifStatement(){
        //Here we will be working on the if statement
        int x = 25;
        int y = 35;
        if(y>x){
            System.out.println("The value of y is greater than x, FYI x: "+x+" and y: "+y);
        }
        else{
            System.out.println("The value of x is less than y.");
        }
    }

    protected static void whileStatement(){
        //Here we will be checking how the execution of while statement
        //While condition executes when the condition is false
        int myAge = 26;
        int legalDrivingAge = 18;
        if(myAge<legalDrivingAge){
            System.out.println("You're under age for driving a vehicle.");
        }
        else{
            System.out.println("You're allowed to drive a vehicle");
        }
    }

    private static void elseIfStatement(){
        //Else if statement specify a new conditon if the first condition is false
        int myJobLevel = 14;
        int highestJobLevel = 5;
        int myManagerJobLevel = 10;

        if(myJobLevel<myManagerJobLevel){
            System.out.println("My manager job level is greater than my job level.");
        }
        else if(myJobLevel>highestJobLevel){
            System.out.println("My job level is not greater than highest job level");
        }
        else{
            System.out.println("Highest job level is 5.");
        }
    }

    private static void shortHandIf(){
        //This is an another method of handeling the if statement
        int time = 20;
        String result = (time < 18) ? "Good Day" : "Good Evening";
        System.out.println("result: "+result);
    }

    private static void realLifeExample(){
        //Real life examples
        int phonePINCode = 6162;

        if(phonePINCode == 6162){
            System.out.println("Welcome to the system.");
        }
        else{
            System.out.println("You're not allowed to enter the system.");
        }

    }
}
