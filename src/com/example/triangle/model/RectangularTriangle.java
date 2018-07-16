package com.example.triangle.model;

import static java.lang.Math.*;
public class RectangularTriangle {

    private boolean isRightTriangle;

    public boolean isRightTriangle(Triangle triangle) {

        if (triangle.getSideC() > triangle.getSideA() && triangle.getSideC() > triangle.getSideB()) {

            return pow(triangle.getSideA(), 2) + pow(triangle.getSideB(), 2) == pow(triangle.getSideC(), 2);
        }
        else if (triangle.getSideB() > triangle.getSideC() && triangle.getSideB() > triangle.getSideA()){
            return pow(triangle.getSideA(), 2) + pow(triangle.getSideC(), 2) == pow(triangle.getSideB(), 2);
        }

        else {
            return pow(triangle.getSideB(), 2) + pow(triangle.getSideC(), 2) == pow(triangle.getSideA(), 2);
        }


    }
}
