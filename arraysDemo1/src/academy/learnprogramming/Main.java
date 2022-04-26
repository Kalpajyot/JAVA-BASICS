package academy.learnprogramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArrays = getIntegers(3);

        for (int i = 0; i < myIntArrays.length; i++) {
            System.out.println("Element " + i + " and typed value was " + myIntArrays[i]);
        }

        System.out.println("The average : " +getAverage(myIntArrays));

        int[]  mysortArray = sortIntegers(myIntArrays);
        printArray(mysortArray);

    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter the value: " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;

    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }

    public static int[] sortIntegers(int [] array){
        int [] sortedArray = new int [array.length];
        for (int i = 0; i<sortedArray.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i =0; i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    //swapping the values between the array's position
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }


}
