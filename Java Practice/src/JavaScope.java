public class JavaScope {
    public static void main(String[] args){
        //Defining a variable and using it inside of particular scope
        //integer variable can' be used here

        {
            int x = 5;

            System.out.println("Value of variable x: "+x);

        }

        //System.out.println("Value of x:"+x);
        //the above one code line gives this error "Cannot resolve symbol 'x'"
    }
}
