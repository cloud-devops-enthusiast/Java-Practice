import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args){
        method1();
    }

    public static void method1(){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("Tata");
        cars.add("Mahindra");
        cars.add("Honda");
        cars.add("Volkswagen");
        cars.add("Hyundai");
        cars.add("Kia");
        //Printing out the LinkedList
        System.out.println("Cars: "+cars);
        //Add using addFirst() to the begining of the Linked List
        cars.addFirst("Toyota");
        //Printing out the LinkedList after adding at the First
        System.out.println("Cars after addFirst(): "+cars);
        //Add using addLast() to the end of the Linked List
        cars.addLast("BMW");
        //Printing out the LinkedList after adding to the last
        System.out.println("Cars after addLast(): "+cars);
        //Removing the first element of the LinkedList
        cars.removeFirst();
        //Printing out the LinkedList after removing from the first of the Linked List
        System.out.println("Cars after removeFirst(): "+cars);
        //Removing the last element of the LinkedList
        cars.removeLast();
        //Printing out the LinkedList after removing from the last of the Linked List
        System.out.println("Cars after removeLast(): "+cars);
        //Printing out the LinkedList's First Element
        System.out.println("Cars getFirst(): "+cars.getFirst());
        //Printing out the LinkedList's Last Element
        System.out.println("Cars getLast(): "+cars.getLast());
    }
}
