package IfElse;

public class IfDemo { //class bracket start

    public static void main (String[] args){        //Main Method Breacket
        int age = 21;                               //Local Variable inside the main method
        if(age>=18) {                               //If block bracket start
            System.out.println("Eligible to vote");
        }                                           //if block bracket finished
    }                                               //Main Method bracket finished
}                                                   //class bracket finished

class Ifdemo2 {

    public static void main(String[] args) {
        int marks = 60;
        if (marks >= 35) {
            System.out.println("Pass");
        }
    }
}

class ifElseDemo {
    public static void main(String[] args){
        int marks = 45;
        if(marks>=50){//if block brackets starts
            System.out.println("Pass");
        }//if block bracket finished
        else {//else block start
            System.out.println("Fail");
        }//else block finsihed
    }
}

class ifElseDemo2 {
    public static void main(String[] args){
        int age = 25;
        if(age>=18){
            System.out.println("Eligible for vote");
        }
        else {
            System.out.println("Not Eligible for vote");
        }
    }

}

class ifElseDemo3 {
    //example of OR = ||
    public static void main(String[] args) {
        float sugarlevel = 6.5f;//Local variable

        if (sugarlevel >= 6.5||sugarlevel >= 10.00){
            System.out.println("Type-1 Diabetes ");
        }

    else{
            System.out.println("No Diabetes");
        }
    }
}

class ifEleseDemo4 {
    //example of AND = &&

    public static void main(String[] args){
        float sugarlevel1 = 6.5f; //local variable

        if(sugarlevel1>=6.5&&sugarlevel1>=7.5){//use of logical operator - AND - &&
            System.out.println("Type-1 Diabetes");
        }
        else{
            System.out.println("No Diabetes");
        }
    }
}

class IfelseDemo5 {
//if else using static method with logical &&
    static int PassingMarks = 40;

    public static void main(String[] args){
        Userdefinedemo1();
    }
    public static void Userdefinedemo1(){
        if (PassingMarks<=50&&PassingMarks==40){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}

class ifElseifDemo {
    public static void main(String[] args){//main method
        double time = 15.00;//local variable
        if(time>=06.00&&time<=12.00){//if condition 1 starting bracket
            System.out.println("Its morning");
        }//if codition 1 finished
        else
            if(time>=12.00&&time<=17.00){//if condition 2 starting bracket
                System.out.println("Its afternoon");
            }//if codition 2 finished
            else
                if(time>=17.00&&time<=20.00){//if condition 3 starting bracket
                    System.out.println("Its evening");
                }//if codition 3 finished
                else{//else block starting
                    System.out.println("Its night");
                }//else block finished
    }
}

class IfelseelseDemo2 {
    //If else if demo - using static method
    static int Weather = 39;

    public static void main(String[] args){
        Userdefine();
    }
    public static void Userdefine(){
        if (Weather<=20){
            System.out.println("Low");
        }
        else
            if (Weather<=30){
                System.out.println("Medium");
            }
            else if (Weather<=40){
                System.out.println("Hot");
        }
            else {
                System.out.println("Very Hot");
            }
    }
}

class NestedIfDemo {
    public static void main(String[] args) {
    int father = 50;
    int son = 25;
    if(father >=25){//condition 1 - outer conditon
        System.out.println("Outer Condition = Father is above 30");
        if(son >= 26){//condition 2 - inner condition
            System.out.println("Inner Condition = Son is 25");
        }
    }else {
        System.out.println("inner condition is wrong");
    }
    }
}

class DemoNestedif {
    int SaranAge = 32;
    int RadhaAge = 28;
    public static void main(String[] args){
        DemoNestedif obj = new DemoNestedif();
        obj.UserdefinedDemo();
    }
    public void UserdefinedDemo(){
        if (SaranAge>=25){
            System.out.println("Outer statement");
            if (RadhaAge>=28){
                System.out.println("Inner Statement");
            }
        }else{
            System.out.println("Wrong");
        }
    }
}

