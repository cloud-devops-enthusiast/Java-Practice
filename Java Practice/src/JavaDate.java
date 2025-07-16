import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args){
        localDate();
        System.out.println("***---------------------------------------***");
        localTime();
        System.out.println("***---------------------------------------***");
        localDateTime();
        System.out.println("***---------------------------------------***");
        dateTimeFormatter();
    }

    public static void localDate(){
        LocalDate myObj = LocalDate.now();
        System.out.println("LocalDate: "+myObj);
    }

    public static void localTime(){
        LocalTime myObj = LocalTime.now();
        System.out.println("LocalTime: "+myObj);
    }

    public static void localDateTime(){
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("LocalDateTime: "+myObj);
    }

    public static void dateTimeFormatter(){
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Before Formatting: "+myObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDate = myObj.format(myFormatObj);
        System.out.println("After Formatting: "+formatDate);
    }
}
