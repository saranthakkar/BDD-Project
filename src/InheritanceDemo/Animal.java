package InheritanceDemo;
//Example of Single inheritance
public class Animal {//super/parent class start

    public void eat(){
        System.out.println("Eating");
    }
}//super class finished

class Dog extends Animal{// subclass extends the superclass
    public void bark(){

        System.out.println("Barking");
    }
    public static void main(String[] args){
        Dog obj = new Dog();//you only need to create one object(with current claass name) to inherit/extend parent class
        obj.bark();//userdefine of child/same class
        obj.eat();//you can called userdefine method from parent class without creating object

        Animal obj2 = new Animal();//up casting is when a parent class reference variable refers to child class object
        obj2.eat();
    }
}

class Britvic{
    public void Pepsi(){

        System.out.println("Mccurrach works for Britvic");
    }
}

class Mccurrach extends Britvic{
    public void Employee(){

        System.out.println("Saran works for Mccurrach");
    }

}
class London extends Mccurrach {
//example of Multilevel Inheritance
    public void WestLondon(){

        System.out.println("Saran covers London area");
    }
    public static void main(String[] args){
    London obj = new London();
    obj.WestLondon();
    obj.Employee();
    obj.Pepsi();

   Britvic obj2 = new London();//up casting
    obj2.Pepsi();

    }
}

