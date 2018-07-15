package com.example.triangle.app;

import java.util.Scanner;
import java.util.Locale;
import com.example.triangle.model.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Wprowadź długość boku A (przyprostokątna): ");
        double sideA = scanner.nextDouble();
        System.out.print("Wprowadź długość boku B (przyprostokątna): ");
        double sideB = scanner.nextDouble();
        System.out.print("Wprowadź długość boku C (przeciwprostokątna): ");
        double sideC = scanner.nextDouble();
        RectangularTriangle rectangularTriangle = new RectangularTriangle();

        Triangle triangle = new Triangle(sideA, sideB, sideC);

            if (rectangularTriangle.isRightTriangle(triangle)){

                System.out.println("Trójkąt jest prostokątny.");
            }

            else {

                System.out.println("Trójkąt nie jest przyprostokątny.");

            }
        }



    }


