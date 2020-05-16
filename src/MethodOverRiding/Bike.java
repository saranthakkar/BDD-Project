package MethodOverRiding;

public class Bike {
    public void run(){
        System.out.println("Bike is running safely");
    }
}

class Spendor extends Bike {
    public void run(){
        System.out.println("Splendor is running safely");
    }
    public static void main(String[] args){
        Spendor obj = new Spendor();
        obj.run();
        Bike obj1 = new Bike();
        obj1.run();
    }
}



class Bank{
    public void getRateOfInterest(){
        System.out.println("Main bank rate of interest");
    }
}

class Barclays extends Bank{
    public void getRateOfInterest(){
        System.out.println("Interest rate ="+1.2);
    }
    public static void main(String[] args){
        Barclays obj = new Barclays();
        obj.getRateOfInterest();
    }
}
class Santander extends Bank {
    public void getRateOfInterest() {

        System.out.println("Interest rate =" + 1.6);
    }

    public static void main(String[] args) {
        Santander obj = new Santander();
        obj.getRateOfInterest();
    }
}

class HSBC extends Bank {
    public void getRateOfInterest() {
        System.out.println("Interest rate =" + 1.6);
    }
    public static void main(String[] args) {
        HSBC obj = new HSBC();
        obj.getRateOfInterest();
    }
}


class Grandfather{
    // 1) Method over riding
    public void property(String name, int Castle){
        System.out.println("Total number of rooms in castle grandfather had = "+Castle);
    }
}
class Father extends Grandfather{
    public void property(String name, int room){
        System.out.println("number of rooms father got in castle = "+room);
    }
}
class Son extends Father{
    //Extended two above classes - Method Over-riding with same arguments
    public void property(String name, int room){
        System.out.println("number of rooms son got in castle = "+room );
    }

    public static void main(String[] args){
        Son obj = new Son();
        obj.property("Saran", 20);

        Father obj1 = new Father();
        obj1.property("Ashwin", 30);

        Grandfather obj3 = new Grandfather();
        obj3.property("Ramesh", 50);

        //////Following is an example of UP-CASTING to achieve RUN TIME Polymorphism - achieved by Method Over-riding
        ////UP-Casting: When the parent class reference variable refers to current class object
        Grandfather obj4 = new Son();
        obj4.property("Saran", 20);
    }
}

