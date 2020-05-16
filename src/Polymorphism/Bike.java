package Polymorphism;

//public class Bike {
//}

// This is UPCASTING Example
class Bike1{
    void run(){System.out.println("Bike is running");}
}
class Splendor1 extends Bike1{
    void run(){System.out.println("Spendor is running");}

    public static void main(String args[]){
        Bike1 obj = new Splendor1();//upcasting
        obj.run();
    }
}