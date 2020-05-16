package InheritanceDemo;

public class Bank {
    public void Main(){
        System.out.println("This is MAIN branch");
    }
}//super class finished

class HSBC extends Bank{// subclass extends the superclass
    public void Branch(){
        System.out.println("This is HSBC branch");
    }
    public static void main(String[] args){
        HSBC obj = new HSBC();
        obj.Branch();
        obj.Main();
           }
}
