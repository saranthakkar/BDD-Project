package InheritanceDemo;

public class Bike {
    //grandparents class
        public void Bike1(){
            System.out.println("This is Bike brand");
        }
    }

    class Honda extends Bike {
        //parent class
        public void Honda1(){
            System.out.println("This is Honda");
        }
    }

    class Splender extends Honda {
        //child class
        public void Splender1(){
            System.out.println("This is Splender");
        }

        public static void main(String[] args){
            Splender obj = new Splender();
            obj.Splender1();
            obj.Honda1();
            obj.Bike1();
        }
    }

