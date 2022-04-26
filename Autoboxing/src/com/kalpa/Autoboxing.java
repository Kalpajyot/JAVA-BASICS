package com.kalpa;

import java.util.ArrayList;
import java.util.Scanner;
// Example of autoboxing
//
//public class Autoboxing {
//
//    public static void main(String[] args) {
//        char ch = 'a';
//
//        Character c = ch;
//
//        ArrayList<Integer>arrayList = new ArrayList<Integer>();
//
//        arrayList.add(20);
//        System.out.println("Element in " + " 0 position is : " + arrayList.get(0));
//    }
//}

// Now example of unboxing
class Unboxing{

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        Character a = 'c';
        char ch = a;

        System.out.println(ch);

        ArrayList<String>arrayList = new ArrayList<String>();

        for (int i = 0; i<10; i++){
            System.out.println("Enter the item  " + i + " : ");
            arrayList.add(scanner.nextLine());
        }
        System.out.println("Array contains these items " + arrayList);

    }

}