package Object;


public class ObjectDemo1 {
        int g = 10;
        int h = 30;
        int i = g+h;

        public static void main(String[] args) {
            ObjectDemo1 Object1 = new ObjectDemo1();
            Object1.ObjectDemo1();
            //System.out.println(Object1.g+Object1.h);
            //System.out.println(Object1.i);
            //System.out.println("Well Done Try Something New");

        }
        public void ObjectDemo1() {

            System.out.println(i);
        }
    }

class ObjectDemo2 {
        int a = 10;
        int b = 20;
        int c = a+b;
        public static void main(String[] args){
            ObjectDemo2 Obj1 = new ObjectDemo2();
            System.out.println(Obj1.c);
        }
        public void Saran(){
            //User define method
            System.out.println(c);
        }
    }
class ObjectDemo3 {
    int a = 10;
    int b = 20;
    int c = a+b;
    public static void main(String[] args) { //this is main method
        ObjectDemo3 obj = new ObjectDemo3(); // This is to create an object by class name
        obj.userdefineDemo1();//example of calling multiple userdedine into main method by creating only one object
        obj.userdefineDemo2();//example of calling multiple userdedine into main method by creating only one object
        obj.userdefineDemo3();//example of calling multiple userdedine into main method by creating only one object
        obj.userdefineDemo4();//example of calling multiple userdedine into main method by creating only one object
    }
    public void userdefineDemo1(){ //this is user define method
        System.out.println(c);
    }
    public void userdefineDemo2(){//this is user define method
        System.out.println(a-b);
    }
    public void userdefineDemo3(){//this is user define method
        System.out.println(b/a);
    }
    public void userdefineDemo4(){//this is user define method
        System.out.println(a*b);
    }
}

//Example of calling method with arguments by object
class ObjectDemo4 {
    public static void main(String[] args) {
        ObjectDemo4 obj = new ObjectDemo4();
        obj.userdefinemethod(20, 10, 30);
        obj.userdefinemethod(30, 40, 40);
        obj.userdefinemethod(50, 60, 40);
    }
    public void userdefinemethod (int a, int b,int c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b+c);
        System.out.println(a-b-c);
    }
}

class ObjectDemo5 {
    int a = 10;
    int b = 20;
    public static void main(String[] args){
        ObjectDemo5 ss = new ObjectDemo5();
        System.out.println(ss.a +" "+ss.b);
        System.out.println(ss.a + ss.b);
        System.out.println(ss.a*ss.b);
        System.out.println("Multiplication of a & b = "+ss.a*ss.b);
    }

}