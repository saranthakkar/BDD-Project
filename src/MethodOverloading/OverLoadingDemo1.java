package MethodOverloading;

public class OverLoadingDemo1 {
    public void demo1(int a, int b){
        System.out.println(a+b);
    }
    public void demo1(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        OverLoadingDemo1 obj = new OverLoadingDemo1();
        obj.demo1(10,20);
        obj.demo1(30,40,50);
    }
}

class OverLoadingDemo2{
    public void demo2(String FirstName, String LastName){
        System.out.println(FirstName+" "+LastName);
    }
    public void dem02(String FirstName, String MiddleName, String LastName){
        System.out.println(FirstName+" "+MiddleName+" "+LastName);
    }
    public static void main(String [] args){
        OverLoadingDemo2 obj = new OverLoadingDemo2();
        obj.demo2("Saran", "Thakkar");
        obj.dem02("Saran", "Ashwin", "Thakkar");
    }
}

