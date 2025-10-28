**Java Inheritance**

Inheritance refers to the ability to inherit the attributes and methods from one class to another.
We group the inheritance concepts to two main categories:
* Subclass(child): The class that inherits from another class
* Superclass(parent): The class being inherited from

To make a use of the objects of one class to another we can make use of the ***extend*** keyword.

Here is an example:

    class Vehicle {
        protected String brand = "Ford";
        public void honk(){
            System.out.println("Tutu Tutu");
        }
    }
    
    class Car extends Vehicle {
        private String modelName = "Mustang";
        public static void main(String[] args){
            Car myCar = new Car();
            myCar.honk();
            System.out.println(myCar.brand + " " + myCar.modelName)
        }
    }

*If you dont want other classes to inherit from a class, use the **Final** keyword.*

**Java Polymorphism**

Polymorphism means something which has many forms and it occurs when we have many classes.

Inheritance let us inherit attributes and methods from another class. Polymorphism uses these methods to perform different tasks.

For example:

        class Animal{
            public void animalSound(){
                System.out.println("Animals makes Sounds");
            }
        }
        
        class Pig extends Animal{
            public void animalSound(){
                System.out.println("The Pig says: Wee Wee");
            }
        }
        
        class Dog extends Animal{
            public void animalSound(){
                System.out.println("The Dog says: bow bow");
            }
        }

        class Main{
            public static void main(String[] args){
                Animal myAnimal = new Animal();
                Amimal myPig = new Pig();
                Animal myDog = new Dog();
                myAnimal.animalSound();
                myPig.animalSound();
                myDog.animalSound();
            }
        }

