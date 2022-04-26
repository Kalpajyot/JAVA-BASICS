package com.company;

public class Sample extends Object{
    public static void main(String[] args) {
        System.out.println(Gender.FEMALE.comment());
//        Print "1:f"
        System.out.println(Gender.MALE.comment());
        // print '2:m'
        System.out.println(Gender.UNDEFINED.comment());
        // print '3:u'
    }
}
