package com.company;
/*
*
* Classame : RoadSign
*
*  11 June 2020
* @author: Danyshchuk Vitalii CHNU 543
* @version: 1.1
*
*  Module 2 task 2
*
* Inheritance

1. Create a child  from the class Triangle.

2. Create another class as a super class for your one.  Or create a daughterly class for your one.
*
* */
import java.util.Objects;
//a road sign that has a triangular shape and takes over some variables from the main triangle class
public class RoadSign extends Triangle{

        private String signType;       // groups of road signs for example: warning, prohibitive, etc.
        private double signNumber;     // serial number of the road sign from the traffic rules
        private boolean signWarning;   // s sign whether the sign is a warning
        private String signColor;      //for example: red - warning, green - indicative, yellow - prohibitive


        public RoadSign(int firstSide,
                        int secondSide,
                        int thirdSide) {
            super(firstSide, secondSide, thirdSide);
            this.signType = signType;
            this.signNumber = signNumber;
            this.signWarning = signWarning;
            this.signColor = signColor;

        }

        public RoadSign(String signType, int signNumber, boolean signWarning,
                        String signColor)
        {
            this.signType = signType;
            this.signNumber = signNumber;
            this.signWarning = signWarning;
            this.signColor = signColor;
        }

        public String getSignType() {
            return signType;
        }

        public void setSignType(String signType) {
            this.signType = signType;
        }

        public double getSignNumber() {
            return signNumber;
        }

        public void setSignNumber(int signNumber) {
            this.signNumber = signNumber;
        }

        public boolean isSignWarning() {
            return signWarning;
        }

        public void setSignWarning(boolean signWarning) {
            this.signWarning = signWarning;
        }

        public String getSignColor() {
            return signColor;
        }

        public void setSignColor(String signColor) {
            this.signColor = signColor;
        }

        public double getAmountSign() {
            return getSignNumber() + 1;
        }

        @Override
        public String toString() {
            return "roadSign{" + "\n" +
                    " Type of sign = '" + signType + '\'' + "\n" +
                    " Number of sign = '" + signNumber + '\'' + "\n" +
                    " Is sign Warning = " + signWarning + "\n" +
                    " Color of sign = " + signColor + "\n" +
                    " Sign Area = " + super.getArea() + "\n" +
                    " Sign Perimetr = " + super.getPerimetr() + "\n" +
                    " Amount of sign = " +getAmountSign() + "\n" +
                    '}';
        }
         @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoadSign sign = (RoadSign) o;
        return getPerimetr() == sign.getPerimetr() &&
                Double.compare(sign.getPerimetr(), getPerimetr()) == 0;
    }

        @Override
        public int hashCode() {
        return  Objects.hash(getFirstSide(),
                getSecondSide(), getThirdSide());
    }

    }
