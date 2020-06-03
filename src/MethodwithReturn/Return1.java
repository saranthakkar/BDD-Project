package MethodwithReturn;

public class Return1 {
    public String demo(){
        String fname = "Saran";
        String lname = "Thakkar";
        return fname +" "+lname;
    }
    public static void main(String[] args){
        Return1 obj = new Return1();
        System.out.println(obj.demo());
    }
}

class Return2 {
    public int demo1(){
        int a = 10;
        int b = 20;
        return a + b;
    }
    public static void main(String[] args){
        Return2 obj = new Return2();
        System.out.println(obj.demo1());
    }
}

class MethodwithReturn {
    public int demo(){
        int Salary = 20000;
        int Bonus = 4000;
        return Salary+Bonus;
    }
    public static void main(String[] args){
        MethodwithReturn obj = new MethodwithReturn();
        System.out.println(obj.demo());
    }
}


// Method with return using Inheritance
class MethodwithReturn2 {
    public String MyCountry() {
        String CountryName = "India";
        String Hometown = "Baroda";
        return "My country name is " + CountryName + " " + "and my hometown is " + Hometown;
    }

}
class Childclass extends MethodwithReturn2{
    public static void main(String[] args){
        MethodwithReturn2 obj = new MethodwithReturn2();
        System.out.println(obj.MyCountry());  //creating parent class object

        Childclass obj2 = new Childclass();
        System.out.println(obj2.MyCountry());  // creating child class object

        MethodwithReturn2 obj3 = new Childclass();  // using up casting - Parent class reference variable refers to child class object
        System.out.println(obj3.MyCountry());
    }
}
//git push