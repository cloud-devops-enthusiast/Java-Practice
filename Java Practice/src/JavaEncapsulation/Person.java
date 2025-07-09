package JavaEncapsulation;

public class Person {
    private String name;
    private int age;
    private String emailID;

    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmailID(){
        return emailID;
    }

    //Setter
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setEmailID(String newEmailID){
        this.emailID = newEmailID;
    }
}
