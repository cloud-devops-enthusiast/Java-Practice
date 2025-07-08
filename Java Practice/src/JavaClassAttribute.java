public class JavaClassAttribute {
    //First attribute of class JavaClassAttribute
    int x = 3;
    //Second attribute of class JavaClassAttribute
    int y = 7;
    //Making a blank variable
    int z;

    public static void main(String[] args){
        Object();
        Object1();
    }

    public static void Object(){
        //Creating an object from class JavaClassAttribute and using it to print values
        //Creating myobj from JavaClassAttribute
        JavaClassAttribute myobj = new JavaClassAttribute();
        System.out.println("myobj(x*y): "+(myobj.x*myobj.y));
    }

    private static void Object1(){
        //Assigning value to the variables
        JavaClassAttribute myobj = new JavaClassAttribute();
        myobj.z = 1234;
        System.out.println("myobj.z: "+myobj.z);
    }
}
