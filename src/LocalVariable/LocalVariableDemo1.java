package LocalVariable;

public class LocalVariableDemo1 {
    public static void main(String[] args){
        //This is a local variable example
        int a1 = 30;
        int b1 = 40;
        int c1 = a1 + b1;
        System.out.println(c1);
    }
}

class LocalVariableDemo3 {
    public static void main(String[] args){
        //This is a local variable example by using boolean data type.
        boolean aa = true;
        boolean bb = false;
        boolean cc = 25>30? true:false;
        System.out.println(cc);

    }
}

class LocalVariableDemo4 {
    //This is an example of local variable with private accessibility
    //private access CANNOT run!
    private void main(String[] args){
        int a = 30;
        int b = 20;
        int c = a+b;
        System.out.println(c);
    }
}

class LocalVariableDemo5 {
    //Example of an local variable by using byte
    public static void main(String[] args){
        byte aa = 127;
        byte bb = 120;
        byte cc = -128;
        System.out.println(cc);
    }
}

class LocalVariableDemo6 {
    //Example of char to int
    public static void main(String[] args){
        char a = 435;
        char b = 476;
        int TotalChar = a+b;
        System.out.println("value of " + "Total Char " + "is : "+ TotalChar );

    }

}

class LocalVariableDemo7 {
    //Example of char to int
    //value of c is 99 & value of d is 100
    public static void main(String[] args){
        char ch = 'c';
        char ch2 = 'd';
        int aa = ch;
        int bb = ch2;
        System.out.println("value of char "+ch+ " is: "+aa);
        System.out.println("value of char "+ch2+ " is: "+bb);
    }
}

class LocalVariableDemo8 {
public void Demo777 (String[] args){
        //This is a user define method
        int a1 = 30;
        int b1 = 40;
        int c1 = a1 + b1;
        System.out.println(c1);
        }
}