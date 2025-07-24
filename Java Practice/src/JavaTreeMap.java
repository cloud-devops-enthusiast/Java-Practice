//import the TreeMap class
import java.util.TreeMap;

//A TreeMap is a collection that stores key/value pairs in sorted order by key

public class JavaTreeMap {
    public static void main(String[] args){
        //String type HashMap
        method1();
    }

    public static void method1(){
        //Create a HashMap objects called CapitalCities
        TreeMap<String, String> capitalCities = new TreeMap<String,String>();
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
        capitalCities.put("Rajasthan","Jaipur");//Duplicate Entry
        capitalCities.put("Jharkhand","Ranchi");
        capitalCities.put("Gujrat","GandhiNagar");//Duplicate Entry
        capitalCities.put("Sikkim","Gangtok");
        //Printing out the TreeMap
        System.out.println("capitalCities: "+capitalCities);
        //Accessing a value of an item
        capitalCities.get("Gujrat");
        //Adding a random element to the TreeMap
        capitalCities.put("Tamil Nadu","Chennai");
        //Printing out the TreeMap after adding an element
        System.out.println("capitalCities after adding: "+capitalCities);
        //Removing an element
        capitalCities.remove("Tamil Nadu");
        //Printing out the TreeMap after removing an element
        System.out.println("capitalCities after removing: "+capitalCities);
        //Calculating the total number of elements
        System.out.println("Size of capitalCities: "+capitalCities.size());
        //Looping through a TreeMap
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
            System.out.println("State: "+i+" "+"Capital: "+capitalCities.get(i));
        }
        //To remove all the elements from the TreeMap
        capitalCities.clear();
        //Printing out the TreeMap after clearing out the TreeMap
        System.out.println("capitalCities: "+capitalCities);
    }
}
