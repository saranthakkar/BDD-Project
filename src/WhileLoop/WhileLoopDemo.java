package WhileLoop;

public class WhileLoopDemo {
    public static void main(String[] args){
        int i = 1;
        while (i<=5){
            System.out.println(i);
            i++;
        }
    }
}

class WhileLoopDemo2 {
    public static void main(String[] args){
        int i = 1;
        while (i<=7){
            System.out.println(i);
            i++;
        }
    }
}

class WhileLoopDemo3 {
    static int a = 10;
    public static void main(String[] args){
       UserDefine();
    }
    public static void UserDefine (){
        while (a<=15){
            System.out.println(a);
            a++;
        }
    }
}
