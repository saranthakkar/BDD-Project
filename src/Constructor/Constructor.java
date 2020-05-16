package Constructor;
//Example of default constructor - without value
public class Constructor {

    public Constructor() {
        System.out.println("Constructor demo");
    }

     public static void main(String[] args){
        Constructor obj = new Constructor();  // initialise only object, no need to call Constructor into main method
    }
}

class Constructor2{
    //Example of default Constructor
    public Constructor2() {

        System.out.println("Pass");
    }
    public static void main(String[] args){

        Constructor2 obj = new Constructor2();
    }
}


class Constructor3 {
    //Example of Parameterised contractor
    public Constructor3(int a, int b){

        System.out.println(a/b);
    }
    public static void main(String[] args){
        Constructor3 obj = new Constructor3(100,20);    //declare the value in object inside main method
        Constructor3 obj2 = new Constructor3(200,40);   //declare parameters in object inside main method
    }
}

class Constructor4{
    //Example of Parameterised
    public Constructor4(int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args){
        Constructor4 obj = new Constructor4(100,50);
        Constructor4 obj2 = new Constructor4(50,25);
    }
}

class Constructor5{
    //default
    static int a = 10;
    static int b = 20;
    Constructor5(){                     //Constructor cannot be static, abstract or final

        System.out.println(a+b);
    }
    public static void main(String[] args){

        Constructor5 obj = new Constructor5();
    }
}

class Constructor6{
    //Parameterised Contractor
    Constructor6(int a, int b){
        System.out.println(a+b);
    }
    Constructor6(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        Constructor6 obj = new Constructor6(40,50);
        Constructor6 obj2 = new Constructor6(40,50,10);

    }
}
