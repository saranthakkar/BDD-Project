package FinalKeyword;

public class FinalMethodinheritance {
}
// final method inheritance is possible
class Ashwin{
    final void FatherName(){

        System.out.println("Saran's father name is Aswhin");
    }
}

class Saran extends Ashwin{
    public static void main(String[] args){
        Saran obj = new Saran();
        obj.FatherName();
    }
}