package StringDatabase;

public class StringDataTypeDemo1 {
    public static void main(String args[]) {
        double salary = 25000;
        String DEPARTMENT = "Development ";
        System.out.println(DEPARTMENT + salary);
    }
}


class StringDataTypeDemo2 {
    public static void main(String [] args){
        String Name ="Saj";
        int ID = 20;
        System.out.println(Name + " "+ID );
    }
}

class StringDataDemo3 {
    int id = 10;
    String Name = "Saran";
    String Surname = "Thakkar";

    public static void main(String[] args){
        StringDataDemo3 s1 = new StringDataDemo3(); //Object
        System.out.println(s1.Name);
        System.out.println(s1.Name+" "+s1.id);
        System.out.println(s1.id);
        System.out.println(s1.Name + s1.Name);
        System.out.println(s1.Name+" "+s1.Surname);

    }
}

class StringDataDemo4 {
    int age;
    String name;

    public static void main(String[] args) {
        StringDataDemo4 s1 = new StringDataDemo4();
        StringDataDemo4 s2 = new StringDataDemo4();
        StringDataDemo4 s3 = new StringDataDemo4();
        StringDataDemo4 s4 = new StringDataDemo4();
        StringDataDemo4 s5 = new StringDataDemo4();
        StringDataDemo4 s6 = new StringDataDemo4();
        StringDataDemo4 s7 = new StringDataDemo4();

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

class StringDataTypeDemo5 {
    int id;
    String name;

    public static void main(String[] args) {
        StringDataTypeDemo5 s1 = new StringDataTypeDemo5();
        StringDataTypeDemo5 s2 = new StringDataTypeDemo5();
        StringDataTypeDemo5 s3 = new StringDataTypeDemo5();
        s1.name = "Ketan";
        s1.id = 20;
        s2.name = "Saj";
        s2.id = 30;
        s3.name = "Mike";
        s3.id = 40;
        System.out.println(s1.name+" "+s1.id);
        System.out.println(s2.name+" "+s2.id);
        System.out.println(s3.name+ " "+s3.id);
        System.out.println("Multiplication of Ketan, Saj & Mike is "+s1.id*s2.id*s3.id);
    }

}

class StringDataTypeDemo6 {
    public static void main(String[] args){
        String firstname = "Saran";
        String lastname = "Thakkar";
        System.out.println(firstname+" "+lastname);
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("total of a and b = " + c);
    }
}

class StringDataTypeDemo7 {
    int id = 10;
    String name = "Rohit";

    public static void main(String[] args){
        StringDataTypeDemo7 s1 = new StringDataTypeDemo7();
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}