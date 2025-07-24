import java.util.LinkedHashMap;

//A Linked HashMap stores keys and values, and keep them in the same order you put them in.

public class JavaLinkedHashMap {
    public static void main(String[] args){
        method1();
    }

    public static void method1(){
        //Create a HashMap objects called CapitalCities
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String,String>();
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
        //Printing out the LinkedHashMap
        System.out.println("capitalCities: "+capitalCities);
        //Accessing the element using the key
        System.out.println("Capital of Maharashtra is "+capitalCities.get("Maharashtra"));
        //Adding a random element to a LinkedHashMap
        capitalCities.put("Tamil Nadu","Chennai");
        //Printing out the LinkedHashMap after adding an element
        System.out.println("capitalCities after adding: "+capitalCities);
        //Removing an element
        capitalCities.remove("Tamil Nadu");
        //Printing out the LinkedHashMap after removing an element
        System.out.println("capitalCities after removing: "+capitalCities);
        //Calculating the total number of elements
        System.out.println("Size of capitalCities: "+capitalCities.size());
        //Looping through a LinkedHashMap
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
        //To remove all the elements from the LinkedHashMap
        capitalCities.clear();
        //Printing out the LinkedHashMap after clearing out the LinkedHashMap
        System.out.println("capitalCities: "+capitalCities);
    }
}
