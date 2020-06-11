/*
*
* Classame : Triangle
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

import java.util.Objects;

public class Triangle implements interTriangle, interBolean {

    private int firstSide;
    private int secondSide;
    private int thirdSide;


    public Triangle() {
    }

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }
    public void setFirstSide(int side) {
        this.firstSide = side;
    }

    public double getSecondSide() {
        return firstSide;
    }
    public void setSecondSide(int side) {
        this.firstSide = side;
    }

    public double getThirdSide() {
        return firstSide;
    }
    public void setThirdSide(int side) {
        this.firstSide = side;
    }



    public double getPerimetr(){

        return firstSide + secondSide +thirdSide;
    }

    public double getArea(){
        return Math.sqrt(getPerimetr() * (getPerimetr() - getFirstSide())
                *(getPerimetr() - getSecondSide())*
                (getPerimetr() - getThirdSide()));
    }

    public boolean isEquilateral(){


        boolean result;
        if (firstSide == secondSide &&
                firstSide == thirdSide) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public boolean isIsosceles(){


        boolean result1;
        if (this.getFirstSide() == this.getSecondSide() || this.getFirstSide()
                == this.getThirdSide() || this.getSecondSide()
                == this.getThirdSide()) {
            result1 = true;
        } else {
            result1 = false;
        }

        return result1;
    }

    public double longestSide(){
        double longestSide = 0;
        if (getFirstSide() > longestSide)
            longestSide = getFirstSide();
        if (getSecondSide() > longestSide)
            longestSide = getFirstSide();
        if (getThirdSide() > longestSide)
            longestSide = getFirstSide();
        return longestSide;
    }



    @Override
    public String toString() {
        return "Triangle:"+"\n" +
                "first side = " + firstSide + "\n" +
                "second side = " + secondSide + "\n" +
                "third side = " + thirdSide + "\n" +
                "The longest Side = " + thirdSide + "\n" +
                "is equilateral = " + isEquilateral() + "\n" +
                "is isosceles = " + isIsosceles() + "\n" +
                "Area = " + this.getArea() + "\n" +
                "Perimeter = " + this.getPerimetr();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return getPerimetr() == triangle.getPerimetr() &&
                Double.compare(triangle.getPerimetr(), getPerimetr()) == 0;
    }

    @Override
    public int hashCode() {
        return  Objects.hash(getFirstSide(),
                getSecondSide(), getThirdSide());
    }


    @Override
    public String toJSON() {
        String json = "Triangle{"
                + "\""  + "Area\":" + this.getArea()
                + ","
                + "\""  + "Perimeter\":" + this.getPerimetr()
                + "}";
        return json;
    }

    @Override
    public String toXML() {
        String xml = "<Triangle>"
                + "<area>" + this.getArea() + "<area>"
                + "<perimeter>" + this.getPerimetr() + "<perimeter>"
                +  "</Triangle>";

        return xml;
    }

    @Override
    public String toConsole() {
        String console = "Triangle{"
                + "-"  + "Area\":" + this.getArea()
                + "-"
                + "-"  + "Perimetr\":" + this.getPerimetr()
                + "}";
        return console;


    }
}
