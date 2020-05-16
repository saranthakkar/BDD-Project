package FinalKeyword;


public class FinalMethod {
}

//final method cannot be override - Spendlor class trying to extends Bike's final method but not possible
class Bike {
    final public void run(){
        System.out.println("Bike is running");
    }
}

class Spendlor extends Bike{
    //public void run(){ // final method cannot be override .
    {
        System.out.println("Splendor is running");
    }
    public static void main(String[] args){
        Spendlor obj = new Spendlor();
        obj.run();
    }
}