package org.example;

/**
 * Code adapted with little change from
 * pseudo code Module 2 PartII.2 Unit Testing Illustration_1
 * The Triangle Program on canvas.
 */
public class TriangleDeterminer {

    private final String nonTri = "NotATriangle";
    private final String scalene = "Scalene";
    private final String equilat = "Equilateral";
    private final String isosc = "Isosceles";

    /**
     * Returns the match value based on 3 provided triangle
     * side lengths
     * @param a triangle side
     * @param b triangle side
     * @param c triangle side
     * @return match value used to determine triangle type
     */
    public int getMatchValue(int a, int b, int c) {
        int match = 0;
        if (a == b) {
            match += 1;
        }
        if (a == c) {
            match += 2;
        }
        if (b == c) {
            match += 3;
        }

        return match;
    }

    /**
     * Returns string title of triangle type
     * @param match number of matching sides
     * @param a triangle side
     * @param b triangle side
     * @param c triangle side
     * @return string name of triangle type
     */
    public String getTriangleType(int match, int a, int b, int c) {
        if (match == 0) { // No sides same len
            if (a + b <= c) {
                return nonTri;
            } else if (b + c <= a) {
                return nonTri;
            } else if (a + c <= b) {
                return nonTri;
            } else {
                return scalene;
            }
        } else if (match == 1) { // a == b
            if (a + c <= b) {
                return nonTri;
            } else {
                return isosc;
            }
        } else if (match == 2) { // a == c
            if (a + c <= b) {
                return nonTri;
            } else {
                return isosc;
            }
        } else if (match == 3) { // b == c
            if (b + c <= a) {
                return nonTri;
            } else {
                return isosc;
            }
        } else {  // a == b && a == c && b == c
            return equilat;
        }
    }
}

