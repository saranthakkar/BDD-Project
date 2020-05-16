package SuperKeyword;

public class Animal {
    String colour = "White";
}

class Dog extends Animal{
    String colour = "Black";

    public void printColour(){
        System.out.println(colour);
        System.out.println(super.colour);
    }
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.printColour();
    }
}

