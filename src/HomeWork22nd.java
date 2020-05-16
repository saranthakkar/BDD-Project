
public class HomeWork22nd {

        int age;
        String name;

        public static void main(String[] args) {
        HomeWork22nd s1 = new HomeWork22nd();
        HomeWork22nd s2 = new HomeWork22nd();
        HomeWork22nd s3 = new HomeWork22nd();
        HomeWork22nd s4 = new HomeWork22nd();
        HomeWork22nd s5 = new HomeWork22nd();
        HomeWork22nd s6 = new HomeWork22nd();
        HomeWork22nd s7 = new HomeWork22nd();

        s1.age = 18;
        s1.name = "Saran1";
        s2.age = 19;
        s2.name = "Saran2";
        s3.age = 20;
        s3.name = "Saran3";
        s4.age = 21;
        s4.name = "Saran4";
        s5.age = 22;
        s5.name = "Saran5";
        s6.age = 23;
        s6.name = "Saran6";
        s7.age = 24;
        s7.name = "Saran7";
        System.out.println(s1.name+" "+s1.age);
        System.out.println(s2.name+" "+s2.age);
        System.out.println(s3.name+ " "+s3.age);
        System.out.println(s4.name+ " "+s4.age);
        System.out.println(s5.name+ " "+s5.age);
        System.out.println(s6.name+ " "+s6.age);
        System.out.println(s7.name+ " "+s7.age);
    }
    }

    class Homework22ndDemo1 {
    int a = 50;
    int b = 30;
    int c = a+b;
    public static void main(String[] args){
        Homework22ndDemo1 home1 = new Homework22ndDemo1();
        System.out.println("Total of a & b = "+" "+home1.c);
    }
    }

class Homework22ndDemo2{
    //Example of calling method with arguments by object
    public static void main(String[] args){
        Homework22ndDemo2 obj = new Homework22ndDemo2();
        obj.userdefine(10,20,30);
        obj.userdefine(40,50,60);
        obj.userdefine(70,80,90);
    }

    public void userdefine (int a, int b, int c){
        //System.out.println(a);
        //System.out.println(b);
        System.out.println("Total of abc is "+(a+b+c));
        //System.out.println(a+b+c);
        //System.out.println(a-b-c);
    }
}
class Homework22ndDemo3 {
    //example of String 
    String month = "January";
    int number = 1;
    public static void main(String[] args){
        Homework22ndDemo3 s1 = new Homework22ndDemo3();
        System.out.println(s1.month+s1.number);
        System.out.println(s1.month+" "+s1.number);
    }
}

class Homework22ndDemo4 {
    ////Example of Arithmetic Operator
    int aa = 50;
    int bb = 30;
    int cc = 20;
    public static void main(String[] args){
        Homework22ndDemo4 ss = new Homework22ndDemo4();
        System.out.println(ss.aa+ss.bb+ss.cc);
        System.out.println(ss.aa-ss.bb-ss.cc);
        System.out.println(ss.aa*ss.bb*ss.cc);
        System.out.println(ss.aa/ss.bb);
        System.out.println(ss.aa%ss.cc);
    }
}

class Homework22ndDemo5 {
    //Example of Relational Operator
    int aaa = 20;
    int bbb = 30;
    int ccc = 50;
    public static void main(String[] args){
        Homework22ndDemo5 sss = new Homework22ndDemo5();
        System.out.println(sss.aaa<sss.bbb);
        System.out.println(sss.aaa>=sss.bbb);
        System.out.println(sss.ccc==sss.aaa);
        System.out.println(sss.ccc!=sss.bbb);
    }
}

class Homework22ndDemo6 {
    public static void main(String[] args) {
        int boy, girl;
        boy = 18;
        girl = 68;

        if (boy < 19 && girl > 67) {
            System.out.println("You Can Enter");
        }else{
            System.out.println("You cannot enter");
        }
    }
}

class SaranThakkar {
    int age = 18;
    String name = "Saj";

    public static void main (String[] args){
        SaranThakkar obj = new SaranThakkar();

        System.out.println(obj.name+" "+obj.age);
    }
}

