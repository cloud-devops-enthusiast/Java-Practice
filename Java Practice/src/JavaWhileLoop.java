public class JavaWhileLoop {
    public static void main(String[] args){
        //The while loop, loops through a block of code till a specified condition is true
        simpleWhile();
        System.out.println("***---------------------------------------***");
        countdownWhile();
        System.out.println("***---------------------------------------***");
        doWhile();

    }

    public static void simpleWhile(){
        int i = 0;
        while(i<7){
            System.out.println("i: "+i);
            i++;
        }
    }

    protected static void countdownWhile(){
        int j = 10;
        while(j>0){
            System.out.println("Time to login in: "+j+"seconds.");
            j--;
        }
        System.out.println("Welcome to the system!!!!!!!");
    }

    private static void doWhile(){
        int i = 0;
        do{
            System.out.println("On the count of "+i);
            i++;
        }
        while (i<10);
        System.out.println("Wohoooo!!!!!");
    }
}
