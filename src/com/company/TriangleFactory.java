/**
 * author Danyschuk Vitalii CHNU
 * @version 1.0
 * Classname TriangleFactory*
 *
 * Module 2 Task 4. Programming patterns. Factory, Builder.
 */
package com.company;

public class TriangleFactory {

        public static Triangle create(int sideA, int sideB, int sideC) {

            if (sideA>0 && sideB>0 && sideC > 0) {
                return new Triangle(sideA, sideB, sideC);
            } return null;
        }

    }




