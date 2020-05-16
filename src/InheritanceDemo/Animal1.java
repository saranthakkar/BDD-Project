package InheritanceDemo;

public class Animal1 {
//grandparents class
    public void eat(){
        System.out.println("Eating");
    }
}

class Dog1 extends Animal1 {
    //parent class
    public void barking(){
        System.out.println("Barking");
    }
}

class BabyDog1 extends Dog1{
//child class
    public void weep(){
        System.out.println("Weeping");
    }

    public static void main(String[] args){
        BabyDog1 obj = new BabyDog1();
        obj.weep();
        obj.barking();
        obj.eat();
    }
}