package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;


public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Generate a new Array with getInteger
        int[] newArray = getInteger(3);

        // print the unsorted array
        printArray(newArray);

        // print the sorted array
        int[] newsortArray = sortedArray(newArray);
        printArray(newsortArray);

//
//        Vector v = new Vector(1,10);
//        int[] n = new int[] {1,2,3,4,5,6,7,8,9,9};
//        v.add(n);
    }

    // Lets create some method for
    //* printing , * getInteger *sortedArray


    // printArray
    public static void printArray(int[] array) {

        // this will print the array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at " + i + " : " + array[i]);
        }
    }

    // getInteger method to generate the integer
    public static int[] getInteger(int number) {
        System.out.println("Enter the value: ");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();

        }
        return values;
    }

    // method to sort the array
    public static int[] sortedArray(int[] array) {

//        int[] sortarray = new int[array.length];
//
//        for (int i =0; i<sortarray.length; i++){
//            sortarray[i] = array[i];
//        }
//        System.out.println("The sorted array is :");

        int[] sortarray = Arrays.copyOf(array, array.length);


        // first set the flaa as true
        boolean flag = true;
        // temp variable to store the value temporily
        int temp;

        // while the flag is true it will running

        while (flag) {
            // flag is false for the first time...
            // Now it will run through the loop
            flag = false;

            // since indexing starts from 0 so, the for loop will run upto array length -1;

            for (int i = 0; i < sortarray.length - 1; i++) {
                if (sortarray[i] < sortarray[i + 1]) {
                    temp = sortarray[i];

                    // Swapping
                    sortarray[i] = sortarray[i + 1];
                    //
                    sortarray[i + 1] = temp;

                    // flag becomes true and it will continue again

                    flag = true;

                }
            }
        }
        return sortarray;

    }


}
