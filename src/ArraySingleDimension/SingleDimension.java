package ArraySingleDimension;

import java.util.Arrays;
import java.util.Collections;

public class SingleDimension {
    //Array Single Dimension
    public static void main(String[] args){
        String Employee[] = new String[5]; //size of arrays are 5
        Employee[0]="Ketan";// 0 index
        Employee[1]="Saj";
        Employee[2]="Mike";
        Employee[3]="Chirag";
        Employee[4]="Saran";//4 index
        //System.out.println(Employee.length);
        System.out.println(Employee[2]);
        //System.out.println(Employee[5]); index 5 is not possible
    }
}

class SingleDimensionForEachLoop{
        public static void main(String[] args){
        int arr[] = new int[5];//declaration and instantiation of array
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        //arr[5]=60; //Array index out of bounds exception
        System.out.println("length is "+arr.length);
        System.out.println(arr[2]);

            //for each loop
       for(int i : arr){//i of arr
           System.out.println(i);
        }
    }
}

//Declaration, Instantiation and initialisation of Array
class SingleDimension2 {
    // for each loop
    public static void main(String[] args) {
        int arr[] = {33,3,4,40,50};// declaration, instantiation and initialisation
        //for(data type new variable : variable)
        for (int i :arr)
        {
            System.out.println(i);
        }
    }
}


class ForEachLoop1{
    public static void main(String[] args){
        int[] a = {10,20,30};  // given condition
        //for(declare variable; condition; increment/decrement)
        for(int i : a){
            System.out.println(i); //to print all numbers
            //System.out.println(a[2]); can print particular index number
        }
}
}

class ForEachLoop2{
    public static void main(String [] args){
        int arr[] = {18,4,8,12,16,2};
        for (int i : arr){                  //for each loop starts
                System.out.println(i);
            }                              // for each loop ends
        }
    }

class MinMax{
    // Array minimum and maximum
    public static void main(String[] args){
        int[] arr ={-6,-4,30,8,50,10};  //(-6,-4,8,10,30,50)
        Arrays.sort(arr);
        System.out.println(arr[0]);//min number
        //System.out.println(arr[arr.length-1]);//max number
    }
}
