/*
*
* Classame : Main
*
*  06 June 2020
*
* Copyright Danyshchuk Vitalii CHNU 543
*  Module 2 task 1
*
* Create a class from the attached document according to the order in your group .  The class must contain
1. Constructor.
2.. Getters/Setters.
3. 5 methods.
4. Override toString() method
5. Override hash() and equals() methods.
*
* */
package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle firstTriangle = new Triangle(3,1,3);

       System.out.println(firstTriangle);
       System.out.println(firstTriangle.hashCode());


        Triangle secondTriangle = new Triangle(4,4,5);
        System.out.println(firstTriangle.equals(secondTriangle));
        System.out.println("To JSON " + secondTriangle.toJSON());
        System.out.println("To XML " + secondTriangle.toXML());
        System.out.println("To console" +secondTriangle.toConsole());

        //Road Sign extend class

        roadSign sign = new roadSign("warning",2,true,"red");
        sign.setSignNumber(5);
        System.out.println(sign);
    }
}
