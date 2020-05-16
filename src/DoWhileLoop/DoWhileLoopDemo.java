package DoWhileLoop;

public class DoWhileLoopDemo {
    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while (i<=5);
    }
}

class  DoWhileLoopDemo2 {
    public static void main(String[] args){
        int i = 20;
        do{
            System.out.println(i);
            i++;
        }
        while (i<=25);
    }
}

class DoWhileLoopDemo3{
    static int i = 10;
    public static void main(String[] args){
        UserDefine();
    }
    public static void UserDefine(){
        do {
            System.out.println(i);
        i++;
        }
        while (i<=15);
    }
}
