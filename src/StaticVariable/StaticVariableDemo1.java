package StaticVariable;

public class StaticVariableDemo1 {
        //Example of Static variable
        static int aaa = 111;
        static int bbb = 222;
        static int ccc = 555;
        static int ddd = ccc-bbb+aaa;
        public static void main(String[] args){

            System.out.println(ddd);
        }
    }

class Student{
    static int a = 10;
    static int b = 20;
    static int c = a+b;
    public static void main(String[] args){

        System.out.println(c);
    }
}


