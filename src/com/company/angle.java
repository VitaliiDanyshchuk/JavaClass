/*
*
* Classame : angle
*
*  08 June 2020
*
* Copyright Danyshchuk Vitalii CHNU 543
*  Module 2 task 2
*
* Inheritance

1. Create a child  from the class Rectangle.

2. Create another class as a super class for your one.  Or create a daughterly class for your one.
*
* */
package com.company;

public class angle  extends  Triangle {


        private int angleA;
        private int angleB;
        private int angleC;


    public angle( int angleA, int angleB, int angleC) {
        super(angleA, angleB, angleC);
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
    }

    public int getAngleA() {

        return angleA;
    }

    public void setAngleA(int angleA) {
        this.angleA = angleA;
    }

    public int getAngleB() {
        return angleB;
    }

    public void setAngleB(int angleB) {
        this.angleB = angleB;
    }
    public int getAngleC() {
        return angleC;
    }

    public void setAngleC(int angleC) {
        this.angleC = angleC;
    }

    @Override
    public String toString() {
        return "Angle{" +
                "Angle A = " + angleA +
                "Angle B = " + angleB +
                "Angle C = " + angleC +
                '}';
}}
