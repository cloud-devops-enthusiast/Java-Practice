package JavaEncapsulation;

public class JavaEncapsulation {
    public static void main(String[] args){
        //Creating a constructor of Person.java
        Person myObj = new Person();
        //Setting the value to the setter of Person.java
        myObj.setName("Abhinav Singh");
        myObj.setAge(26);
        myObj.setEmailID("abhinav41999@gmail.com");
        //Reading the value of name from Person.java
        System.out.println("Name: "+myObj.getName());
        System.out.println("Age: "+myObj.getAge());
        System.out.println("EmailID: "+myObj.getEmailID());
    }
}
