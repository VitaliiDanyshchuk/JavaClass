/**
 * @author Danyschuk Vitalii CHNU
 * @version 1.0
 * Classname AbstractFactory*
 *
 * Module 2 Task 4. Programming patterns. Factory, Builder.
 */
package com.company;

public class AbstractFactory {

    public static IGeometry create(int sideA,int sideB, int sideC, Figure figure) {
        switch (figure) {
            case TRIANGLE: return new Triangle(sideA, sideB, sideC);
            case ROADSIGN: return new RoadSign(sideA, sideB, sideC);
            default: return null;
        }
    }

}
