package StaticKeyworldDemo;

public class StaticKeyWorldDemo {//beginning of the class
    static int a = 10;
    static int b = 20;
    static int c = a+b;
    static int d = b-a;

    public static void main(String[] args) {//main method cannot able to access instance varible
        StaticKeyWorldDemo obj = new StaticKeyWorldDemo(); //creating object by class name
        obj.demo();
    }
        public static void demo(){
        System.out.println(c);
    }
    }

    class StaticKeyWorldDemo2{
    static long a = 200;
    static long b = 100;
    static long c = 200/100;
    public static void demo1(){

        System.out.println(c);
    }
    public static void main(String[] args){

        demo1();
    }
    }

