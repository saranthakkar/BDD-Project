package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {
    public static void main(String[] args){
        ArrayList<String>cars = new ArrayList<>();// creating ArrayList
        //Add items
        cars.add("Volvo");//0 index
        cars.add("BMW"); // 1 index
        cars.add("Ford"); //2 index
        //System.out.println(cars);
        //System.out.println(cars.get(0));// print car by index

        //use for each loop to print all cars
        for(String car : cars){
            System.out.println(car);
        }
    }
}

class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();// creating ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        //use for each loop to print all cars
        for(int number:numbers){
            System.out.println(number);
        }
    }
}

class SortingAscending {
    public static void main(String[] args){
        ArrayList<Integer>numbers = new ArrayList<>(); // creating Arraylist
        //Add items
        numbers.add(8);// 0 index
        numbers.add(26);// 1 index
        numbers.add(13); // 2 index

        Collections.sort(numbers);//  Sort numbers in Ascending orders
        //Collections.sort(numbers,Collections.reverseOrder()); // sort numbers in Descending order
        System.out.println(numbers);  // to print in one box

        for(int number : numbers){
          System.out.println(number);  // to print one by one
        }
    }
}


class ForEachLoop {
    public static void main(String[] args){
        ArrayList<String>Employee = new ArrayList<>();
        //adding Employee names
        Employee.add("Saran"); // 0 index
        Employee.add("Chirag");
        Employee.add("Ketan");
        //System.out.println(Employee); // to print all names in one line []
        //System.out.println(Employee.get(2));  // print name by index

        //by using ForEach loop
        for (String EMPLOYEE : Employee ){ //use Primitive Data type: String data type is same in Primitive & Wrapper
            System.out.println(EMPLOYEE); // to print all names individually
        }
    }
}

class SortingDescending {
    public static void main(String[] args){
        ArrayList<Long>numbers = new ArrayList<>(); // creating Arraylist
        //Add items
        numbers.add(-50l);// 0 index
        numbers.add(2l);// 1st index
        numbers.add(79l); // 2nd index
        numbers.add(33l);// 3rd index

        //Collections.sort(numbers);//  Sort numbers in Ascending orders
        Collections.sort(numbers,Collections.reverseOrder()); // sort numbers in Descending order

        //use for each loop to print all number at once
        for(long number : numbers){
            System.out.println(number);
        }
    }
}
