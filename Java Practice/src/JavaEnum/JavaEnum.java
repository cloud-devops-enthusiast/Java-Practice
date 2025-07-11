package JavaEnum;
//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables)
//To make use of the enum, use the enum keyword (instead of class or interface) and seperate the constants with a comma

public class JavaEnum {
    //Defining an enum
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args){
        //Accessing and assigning value of an enum
        Level myVar = Level.MEDIUM;
        System.out.println("myVar: "+myVar);
    }
}
