package Interface;

// example of interface with only abstract method
public interface Bike {
    public abstract void run();
}

class Splendor implements Bike{
    public void run(){

        System.out.println("Running Safely");
    }
    public static void main(String[] args){
        Bike obj = new Splendor();// using Up-Casting
        obj.run();

        Splendor obj2 =new Splendor();
        obj2.run();
    }
}

//example of Multiple Inheritance by using Interface
interface GrandParent{
    public abstract void property();
}
interface Parent{
    public abstract void balance();
}
interface Children{
    public abstract void account();
        }

class Grandchildren implements GrandParent, Parent, Children{
    public void property(){

        System.out.println("This is Grandparent property");
    }
    public void balance(){

        System.out.println("This is Parent balance");
    }
    public void account(){

        System.out.println("This is Children account");
    }
    public static void main(String[] args){
        Grandchildren obj = new Grandchildren();
        obj.property();
        obj.balance();
        obj.account();
    }
       }

       interface animal{
    public abstract void demo1();
       }

       interface dog{
    public abstract void demo2();
       }

class babydog implements animal, dog {
    public void demo1(){

        System.out.println("Animal");
    }
    public void demo2(){

        System.out.println("Dog");
    }
    public static void main(String[] args ){
        babydog obj = new babydog();
        obj.demo1();
        obj.demo2();
    }
       }
