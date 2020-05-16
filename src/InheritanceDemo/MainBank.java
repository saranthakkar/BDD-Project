package InheritanceDemo;
// example of Hierarchical Inheritance
public class MainBank {
    public void mainBranch(){
        System.out.println("This is the main bank");
    }
}

class Hsbc extends MainBank{
    //1st child class
    public void branch(){
        System.out.println("This is the HSBC bank");
    }
}

class Llyods extends MainBank{
    //2nd child class
    public void SubBranch(){
        System.out.println("This is Llyod Bank");
    }

    public static void main(String[] args){
        Llyods obj = new Llyods();
        obj.SubBranch();
        obj.mainBranch();
    }
}