//import the HashMap Class
import java.util.HashMap;

//A HashMap stores items in Key/Value pairs, where each key maps to a specific value.

public class JavaHashMap {
    public static void main(String[] args){
        //String type HashMap
        method1();
        //String and Int type HashMap
        method2();
    }

    public static void method1(){
        //Create a HashMap objects called CapitalCities
        HashMap<String, String> capitalCities = new HashMap<String,String>();
        //Add keys and values (State,Capital)
        capitalCities.put("Maharashtra","Mumbai");
        capitalCities.put("Madhya Pradesh","Bhopal");
        capitalCities.put("Uttar Pradesh","Lucknow");
        capitalCities.put("Rajasthan","Jaipur");
        capitalCities.put("West Bengal","Kolkata");
        capitalCities.put("Bihar","Patna");
        capitalCities.put("Chattisgarh","Raipur");
        capitalCities.put("Gujrat","GandhiNagar");
        capitalCities.put("Andhra Pradesh","Hyderabad");
        capitalCities.put("Jharkhand","Ranchi");
        capitalCities.put("Sikkim","Gangtok");
        //Printing out the HashMap
        System.out.println("capitalCities: "+capitalCities);
        //Accessing an element from the HashMap
        System.out.println("Maharashtra: "+capitalCities.get("Maharashtra"));
        //Adding a random element to the HashMap
        capitalCities.put("Tamil Nadu","Chennai");
        //Printing out the HashMap after adding an element
        System.out.println("capitalCities after adding: "+capitalCities);
        //Removing an element
        capitalCities.remove("Tamil Nadu");
        //Printing out the HashMap after removing an element
        System.out.println("capitalCities after removing: "+capitalCities);
        //Calculating the total number of elements
        System.out.println("Size of capitalCities: "+capitalCities.size());
        //Looping through a HashMap
        //Printing the keys
        for(String i : capitalCities.keySet()){
            System.out.println("State: "+i);
        }
        //Printing the Values
        for(String i : capitalCities.values()){
            System.out.println("Capital: "+i);
        }
        //Printing key value pairs
        for(String i : capitalCities.keySet()){
            System.out.println("Key: "+i+" "+"Values: "+capitalCities.get(i));
        }
        //To remove all the elements from the HashMap
        capitalCities.clear();
        //Printing out the HashMap after clearing out the HashMap
        System.out.println("capitalCities: "+capitalCities);
    }

    public static void method2(){
        //Create a HashMap objects called CapitalCities
        HashMap<String, Integer> nameAge = new HashMap<String,Integer>();
        //Adding keys and values (Name, Age)
        nameAge.put("Abhinav",26);
        nameAge.put("Himanshu",34);
        nameAge.put("Dinesh",38);
        nameAge.put("Siddharth",26);
        nameAge.put("Prateek",36);
        nameAge.put("Umakant",45);
        nameAge.put("Kaushiki",25);
        nameAge.put("Catalina",3);
        nameAge.put("Akshay",49);
        nameAge.put("Manika",22);
        //Size of HashMap
        System.out.println("nameAge Size: "+nameAge.size());
        //Looping through the HashMap
        for(String i : nameAge.keySet()){
            System.out.println("Name: "+i+" "+"Age: "+nameAge.get(i));
        }
    }
}
