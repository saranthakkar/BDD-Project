package SwitchStatements;

public class SwitchStatement {

    public static void main(String[] args){
        int age = 25;
        switch (age){
            case 16:
                System.out.println("You are under 18");
                break;
            case 18:
                System.out.println("You are eligible to vote");
                break;
            case 25:
                System.out.println("You are able to vote ");
                break;
            default:
                System.out.println("You are not eligible for vote");
        }
    }
}

class SwitchStatment2 {
    public static void main(String[] args){
        int Month = 3;
        switch (Month){
            case 1:
                System.out.println("This is January");
                break;
            case 2:
                System.out.println("This is Feb");
                break;
            case 3:
                System.out.println("This is March");
                break;
            default:
                System.out.println("This is April");
        }
    }

}

class SwitchStatement3{
    static int TesterSalary= 50000;
    public static void main(String[] args){
        UserDefine();
    }
    public static void UserDefine(){
        switch (TesterSalary){
            case 47000:
                System.out.println("This is underpay");
                break;
            case 50000:
                System.out.println("This is correct salary of Tester");
                break;
            case 60000:
                System.out.println("Highly paid Tester");
                break;
            default:
                System.out.println("Over paid ");
        }
    }
}
