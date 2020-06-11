/*
*
* Classame : roadSign
*
*  11 June 2020
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



    public class roadSign extends Triangle{

        private String signType;
        private int signNumber;
        private boolean signWarning;
        private String signColor;

        public roadSign(int firstSide, int secondSide, int thirdSide,
                        String signType, int signNumber, boolean signWarning,
                        String signColor) {
            super(firstSide, secondSide, thirdSide);
            this.signType = signType;
            this.signNumber = signNumber;
            this.signWarning = signWarning;
            this.signColor = signColor;
        }

        public roadSign(String signType, int signNumber, boolean signWarning,
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

        public int getSignNumber() {
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

        public int getAmountSign() {
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
    }
