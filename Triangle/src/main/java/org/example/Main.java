package org.example;

import java.util.Scanner;

/**
 * Code adapted with little change from
 * pseudo code Module 2 PartII.2 Unit Testing Illustration_1
 * The Triangle Program on canvas.
 */
public class Main {
    public static void main(String[] args) {
        Scanner inputGetter = new Scanner(System.in);
        System.out.println("Enter 3 integers as the sides of a triangle.");

        int a, b, c;
        int[] triangle = new int[3];
        for (int i = 0; i < 3; i++) {
            int sideLen = inputGetter.nextInt();
            while (sideLen < 1) {
                sideLen = inputGetter.nextInt();
            }
            triangle[i] = sideLen;
        }
        a = triangle[0];
        b = triangle[1];
        c = triangle[2];

        TriangleDeterminer tri = new TriangleDeterminer();
        int matchVal = tri.getMatchValue(a, b, c);
        String triType = tri.getTriangleType(matchVal, a, b, c);

        System.out.println(triType);
    }
}