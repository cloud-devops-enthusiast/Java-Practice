public class JavaExceptionHandelling {
    public static void main(String args[]){
        //Testing the normal Usecase
        System.out.println("Normal Usecase: ");
        normalUsecase();
        System.out.println("***---------------------------------------***");
        System.out.println("Exception Handelled: ");
        exceptionHandelled();
        System.out.println("***---------------------------------------***");
        System.out.println("Final Keyword Usage: ");
        finalExceptionHandelled();
        System.out.println("***---------------------------------------***");
        System.out.println("Exception Issue: ");
        exceptionIssue();
    }

    public static void exceptionIssue(){
        //In this case we are looking for creating a exception.
        int[] myNumbers = {1,2,3};
        System.out.println("Highest Number in an Array: "+myNumbers[10]);//Error
    }

    public static void exceptionHandelled(){
        //In this case we are in handelling exception handelling using the try catch block
        try{
            //The suspected dark code goes here.
            int[] myNumbers = {1,2,3};
            System.out.println("Highest Number in an Array: "+myNumbers[10]);
        }
        catch(Exception e){
            //The Solution or clarification of Code goes here
            System.out.println("Something went wrong while finding the resuls.");
        }
    }

    public static void finalExceptionHandelled(){
        //In this case we are using the final keyword.
        try {
            int[] myNumber = {1,4,8};
            System.out.println("Higest Number in an array: ");
        }
        catch (Exception e){
            System.out.println("Something went Wrong");
        }
        finally {
            System.out.println("The both try and catch statemnent haas been processes.");
        }
    }

    public static void normalUsecase(){
        //This is a normal method testing the code in a simple manner.
        int[] myNumber = {1,4,8};
        System.out.println("Printing the Numbers: "+myNumber[2]);
    }
}