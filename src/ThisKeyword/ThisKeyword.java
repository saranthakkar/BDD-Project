package ThisKeyword;

public class ThisKeyword {
    static int a;
    static int b;

    public ThisKeyword(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a+b);

    }
    public static void main(String[] args){

        ThisKeyword obj = new ThisKeyword(50,60);
    }
}

class ThisKeyword2 {
    int a;
    int b;

    public ThisKeyword2(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a-b);

    }
    public static void main(String[] args){
        ThisKeyword2 obj = new ThisKeyword2(100,60);
    }
}

class ThisKeyword3 {
        int a;
        int b;
//'this' is only used when instance variable is same
public ThisKeyword3(int c,int d){
        this.a = c;
        this.b = d;
        System.out.println(a-b);

        }
public static void main(String[] args){

    ThisKeyword3 obj = new ThisKeyword3(70,60);
        }
        }


        class ThisKeyword4{
    //this keyword in Jawa
        static int Saran;
        static int Chirag;
        ThisKeyword4(int Saran, int Chirag){
            this.Saran=Saran;
            this.Chirag=Chirag;
            System.out.println(Saran+Chirag);
            System.out.println(Chirag-Saran);
        }

        public static void main(String[] args) {
            ThisKeyword4 obj = new ThisKeyword4(32,48);
        }
}