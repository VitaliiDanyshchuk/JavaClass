/*
*
* Classame : Main
*
*  06 June 2020
*
* Author: Danyshchuk Vitalii CHNU 543
* Version: 1.3
*
*  Module 2
*
*
* */
package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
       Triangle firstTriangle = new Triangle(3,1,3);

      // System.out.println(firstTriangle);
       //System.out.println(firstTriangle.hashCode());


        Triangle secondTriangle = new Triangle(4,4,5);
        //System.out.println(firstTriangle.equals(secondTriangle));
        //System.out.println("To JSON " + secondTriangle.toJSON());
        //System.out.println("To XML " + secondTriangle.toXML());
        //System.out.println("To console" +secondTriangle.toConsole());

        //Road Sign extend class

        RoadSign sign = new RoadSign("warning",2,true,"red");
        sign.setSignNumber(5);
        //System.out.println(sign);

        // create an instance of the Triangle class
        Triangle triangle1 = new Triangle(5,2,3);


        // Create triangle instance with AbstractFactory
        IGeometry triangle2 = AbstractFactory.create(10,1,2,Figure.TRIANGLE);
        System.out.println(triangle2.getPerimetr());
    }
}
