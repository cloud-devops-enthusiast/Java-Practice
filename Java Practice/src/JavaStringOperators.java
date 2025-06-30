import java.util.Locale;

public class JavaStringOperators {
    public static void main(String[] args){
        stringOperation();
    }

    protected static void stringOperation(){
        //Setting the String into a variable
        String testLine = "This is a String line for Java Practice.";
        //Printing the test String
        System.out.println("Printing the test line: "+testLine);
        //Taking out the length of string
        System.out.println("Length of the String: "+testLine.length());
        //Converting the whole string to Upper Case
        System.out.println("Uppercase String: "+testLine.toUpperCase());
        //Converting the whole string to Lower Case
        System.out.println("Lowercase String: "+testLine.toLowerCase());
        //Find a character in the String
        System.out.println("Finding index of the string java in the testString: "+testLine.indexOf("Java"));
        //Java String Concatination
        String test1="Java is a ";
        String test2="Programming language.";
        //Printing the test Strings
        System.out.println("test1: "+test1);
        System.out.println("test2: "+test2);
        //Concatinated Strings
        System.out.println("Concatinated Strings: "+(test1+test2));
    }
}
