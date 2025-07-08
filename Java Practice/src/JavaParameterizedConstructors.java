public class JavaParameterizedConstructors {
    int modelYear;
    String modelName;

    public JavaParameterizedConstructors(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args){
        JavaParameterizedConstructors myCar = new JavaParameterizedConstructors(1999,"Altroz");
        System.out.println("Car Name: "+myCar.modelName);
        System.out.println("Car Model: "+myCar.modelYear);
    }
}
