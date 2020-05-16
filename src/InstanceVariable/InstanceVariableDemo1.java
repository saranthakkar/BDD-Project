package InstanceVariable;

public class InstanceVariableDemo1 {
}

class InstanceVariableDemo2 {
    int g = 10;
    int h = 30;
    int i = g+h;

        public static void main(String[] args) {
            InstanceVariableDemo2 INST1 = new InstanceVariableDemo2();
            INST1.InstanceVariableDemo2();// by calling userdefine method into main method
            System.out.println(INST1.i); // by giving executing printing from method method
            System.out.println(INST1.g);
        }
        public void InstanceVariableDemo2() {
            System.out.println(i);
            System.out.println("Well Done Try Something New");
        }
    }

    class InstanceVariableDemo3 {
        //Example of Instance
        int a = 10;
        int b = 20;
        int c = a+b;
        public void main(String[] args){
            InstanceVariableDemo3 obj = new InstanceVariableDemo3();
            obj.Saran();//calling userdefine method into main method
        }
        public void Saran(){
            //User define method
            System.out.println(c);
        }
    }

    class InstanceVariableDemo4 {
        //example of Instance Variable
        int abc = 100;
        int aaa = 200;
        int bbb = abc+aaa;
        public void SaranT() {
            System.out.println(bbb);
        }
        public static void main(String[] args){
            InstanceVariableDemo4 obj = new InstanceVariableDemo4();
            obj.SaranT();
        }
    }
