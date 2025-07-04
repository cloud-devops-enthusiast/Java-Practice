public class JavaSwitch {
    public static void main(String[] args){
        intSwitch();
        System.out.println("***---------------------------------------***");
        stringSwitch();
    }

    private static void intSwitch(){
        int day = 3;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    public static void stringSwitch(){
        String today = "Wednesday";
        switch (today){
            case "Monday":
                System.out.println("Today is "+today);
                break;
            case "Tuesday":
                System.out.println("Today is "+today);
                break;
            case "Wednesday":
                System.out.println("Today is "+today);
                break;
            case "Thursday":
                System.out.println("Today is "+today);
                break;
            case "Friday":
                System.out.println("Today is "+today);
                break;
            case "Saturday":
                System.out.println("Today is "+today);
                break;
            case "Sunday":
                System.out.println("Today is "+today);
                break;
        }
    }
}
