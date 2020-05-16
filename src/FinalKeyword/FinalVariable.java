package FinalKeyword;

//Example of final variable value cannot be change
public class FinalVariable {
    final int EmployeeID = 1111;
    //int EmployeeID = 1111;

    public void demo1(){
       // EmployeeID = 2222;  //you cannot change the value of final variable
        System.out.println(EmployeeID);
    }
    public static void main(String[] args){
        FinalVariable obj = new FinalVariable();
        obj.demo1();
    }
}


