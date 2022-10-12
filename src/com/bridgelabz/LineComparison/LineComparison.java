package com.bridgelabz.LineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double length = 0.0;
        System.out.println("Welcome to the line comparison");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Using the cartesian coordinate system enter the endpoint of the line");
        System.out.println("Endpoint 1 (x1, y1)");
        System.out.println("Enter the abscissa (x-Coordinate) =");
        x1 = sc.nextInt();
        System.out.println("Enter the ordinate (y-Coordinate) =");
        y1 = sc.nextInt();
        System.out.println("Endpoint 2 (x2, y2)");
        System.out.println("Enter the abscissa (x-Coordinate) =");
        x2 = sc.nextInt();
        System.out.println("Enter the ordinate (y-Coordinate) =");
        y2 = sc.nextInt();
        length = Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        System.out.println("Length of Line is => " +length);


    }
}
