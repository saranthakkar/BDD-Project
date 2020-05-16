package ExceptionHandling;

import java.util.ArrayList;

public class TryCatch1 {
    public static void main(String[] args){
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);// 0 index
        numbers.add(20);// 1st index
        numbers.add(30);// 2nd index
        numbers.add(40); // 3rd index
        numbers.add(50); // 4th index

        try{
            System.out.println(numbers.get(8));   // Exception handled by try and  catch
        }
        catch (Exception E) {
            System.out.println("8th index doesn't exist");
        }
        finally {
            System.out.println("try catch block is finished");
        }
    }
}

class ExceptionDemo {
    public static void main(String[] args){
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(27.57);   //0 index
        numbers.add(11.19);
        numbers.add(19.24);
        numbers.add(1.2);
        numbers.add(-44.55);   // 4 index
        try {
            System.out.println(numbers.get(3));
        }catch (Exception E){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("checked");
        }
    }
}

class TryCatch2{
    public static void main(String[] args){
        int a = 100;
        int b = 0;
        int c = a+b;
        System.out.println(c);
        try{
        int d = a/b;
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("d is not possible");
        }finally {
            System.out.println("verified");
        }

    }
}