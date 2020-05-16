package Abstract;
//example of abstract class and abstract method inside
public abstract class Bike {
    public abstract void run();
    //abstract method without body
}

class Splendor extends Bike {
    public void run(){

        System.out.println("Running Safely");
    }
    public static void main(String[] args){
        Splendor obj = new Splendor();
        obj.run();
    }
}

abstract class Parent{
    public abstract void property();//abstract method

public void balance(){
    System.out.println("Parent balance");
}//user define method finishes
}//class finishes

class Children extends Parent{
    //child class extending parent class
    //abstract and non-abstract
    public void property(){

        System.out.println("This is parent property");
    }
    public static void main(String[] args){
        Children obj = new Children();
        obj.property();
        obj.balance();
    }
}

// Following is great example of Abstract class - extends

abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}
class Scooter extends Vehicle{
    void start(){

        System.out.println("Scooter starts with kick");
    }
    public static void main(String[] args) {
        //Vehicle obj = new Vehicle();//---Vehicle is abstract class and so you cannot create an object(or cannot be instantiated)
        Car obj = new Car();
        obj.start();

        Scooter obj1 = new Scooter();
        obj1.start();

        Vehicle obj3 = new Scooter();//Up-casting: Giving reference variable of Abstract class that refer to current class object
        obj3.start();

        Vehicle obj4 = new Car(); // Up-casting: Giving reference variable of Abstract class that refer to extended class object
        obj4.start();
    }
}


