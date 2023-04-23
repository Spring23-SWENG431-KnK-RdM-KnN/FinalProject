import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(3, (int) (short) -1, (int) (short) 10, 100);
        java.lang.Class<?> wildcardClass16 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Isosceles" + "'", str15, "Isosceles");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (short) 0, (-1), (-1), (int) (byte) 10);
        java.lang.String str25 = triangleDeterminer0.getTriangleType(2, (int) '4', 0, (int) (short) 1);
        int int29 = triangleDeterminer0.getMatchValue((int) (short) 100, (int) (byte) 100, (int) 'a');
        int int33 = triangleDeterminer0.getMatchValue((int) (short) 0, (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass34 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Isosceles" + "'", str25, "Isosceles");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) -1);
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) -1, 3, (int) '#');
        java.lang.String str25 = triangleDeterminer0.getTriangleType((int) (byte) 10, (int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        int int29 = triangleDeterminer0.getMatchValue((int) (short) 1, (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equilateral" + "'", str20, "Equilateral");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equilateral" + "'", str25, "Equilateral");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        int int28 = triangleDeterminer0.getMatchValue(2, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str25 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (short) 0, (int) (byte) 1, (int) ' ');
        java.lang.String str30 = triangleDeterminer0.getTriangleType((int) (short) 10, (int) (byte) 10, (int) (byte) 10, (int) '4');
        int int34 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (short) 10, 3);
        int int38 = triangleDeterminer0.getMatchValue(1, 100, (int) (short) 10);
        int int42 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) (short) 100, (-1));
        int int46 = triangleDeterminer0.getMatchValue((int) (short) 1, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equilateral" + "'", str25, "Equilateral");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equilateral" + "'", str30, "Equilateral");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType((-1), (int) 'a', (int) (short) 0, (int) '#');
        int int27 = triangleDeterminer0.getMatchValue((int) (short) 100, (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equilateral" + "'", str23, "Equilateral");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 1, 2, 10, 1);
        java.lang.String str34 = triangleDeterminer0.getTriangleType((int) '4', 3, (int) (short) 1, 3);
        int int38 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) 'a', 1);
        java.lang.Class<?> wildcardClass39 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NotATriangle" + "'", str29, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equilateral" + "'", str34, "Equilateral");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) '#', (int) '#', 100, (int) ' ');
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) '4', 3, 0, 10);
        int int28 = triangleDeterminer0.getMatchValue((int) '4', (int) (byte) -1, (int) (short) 0);
        java.lang.String str33 = triangleDeterminer0.getTriangleType(100, 0, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Equilateral" + "'", str33, "Equilateral");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        int int13 = triangleDeterminer0.getMatchValue(3, (int) (short) 0, 0);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) -1, 0, 10, 6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equilateral" + "'", str18, "Equilateral");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 10, (int) (byte) 10, (-1));
        int int27 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) '#', (int) (short) 10);
        int int31 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) ' ', (int) (short) 0);
        java.lang.String str36 = triangleDeterminer0.getTriangleType((int) (byte) 10, 10, (int) (short) 10, (int) (short) 0);
        java.lang.String str41 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (short) -1, 0, (int) (byte) -1);
        int int45 = triangleDeterminer0.getMatchValue(1, 0, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NotATriangle" + "'", str23, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equilateral" + "'", str36, "Equilateral");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "NotATriangle" + "'", str41, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 10, (int) (byte) 10, (-1));
        int int27 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) '#', (int) (short) 10);
        int int31 = triangleDeterminer0.getMatchValue(3, (int) (byte) 10, (int) (byte) 1);
        int int35 = triangleDeterminer0.getMatchValue(2, 2, 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NotATriangle" + "'", str23, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(10, 100, (int) (byte) 0, (int) (byte) 10);
        int int31 = triangleDeterminer0.getMatchValue(3, (int) '#', (int) ' ');
        int int35 = triangleDeterminer0.getMatchValue((int) (short) 10, (int) (short) 0, (int) (byte) 0);
        int int39 = triangleDeterminer0.getMatchValue((-1), (int) ' ', (int) (byte) 1);
        int int43 = triangleDeterminer0.getMatchValue(2, (int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass44 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equilateral" + "'", str27, "Equilateral");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 1, 2, 10, 1);
        java.lang.String str34 = triangleDeterminer0.getTriangleType(3, (int) 'a', 2, (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NotATriangle" + "'", str29, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "NotATriangle" + "'", str34, "NotATriangle");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 10, (int) (byte) 10, (-1));
        int int27 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) '#', (int) (short) 10);
        int int31 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) (short) 100, (int) '#');
        int int35 = triangleDeterminer0.getMatchValue(1, (int) (short) 0, (int) '4');
        java.lang.String str40 = triangleDeterminer0.getTriangleType((int) '#', 1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NotATriangle" + "'", str23, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equilateral" + "'", str40, "Equilateral");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((-1), (int) (byte) -1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(0, 10, 0);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) -1, (int) (short) 10, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equilateral" + "'", str14, "Equilateral");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 2, 100, (int) (short) 10);
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        int int23 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (short) 100, 100);
        int int27 = triangleDeterminer0.getMatchValue((int) 'a', (int) 'a', 0);
        java.lang.String str32 = triangleDeterminer0.getTriangleType(0, (int) '4', (int) (short) -1, 10);
        int int36 = triangleDeterminer0.getMatchValue((int) ' ', 0, 10);
        java.lang.Class<?> wildcardClass37 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "NotATriangle" + "'", str32, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.String str9 = triangleDeterminer0.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        int int13 = triangleDeterminer0.getMatchValue(0, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = triangleDeterminer0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equilateral" + "'", str9, "Equilateral");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 10, (int) (byte) 10, (-1));
        int int27 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) '#', (int) (short) 10);
        int int31 = triangleDeterminer0.getMatchValue((int) (short) 100, 0, 1);
        java.lang.String str36 = triangleDeterminer0.getTriangleType(100, (-1), (-1), (int) ' ');
        java.lang.Class<?> wildcardClass37 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NotATriangle" + "'", str23, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equilateral" + "'", str36, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        int int8 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) (short) -1, (int) '#');
        int int12 = triangleDeterminer0.getMatchValue((int) (short) 1, 2, 100);
        java.lang.String str17 = triangleDeterminer0.getTriangleType((int) (short) 100, 3, (int) '4', (int) 'a');
        int int21 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equilateral" + "'", str17, "Equilateral");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (short) 0, (int) (byte) 1, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (byte) 0, (int) (short) 100, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) '#', (int) '#', 100, (int) ' ');
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) '4', 3, 0, 10);
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 100, (int) (short) 10, (int) (short) 1, 10);
        java.lang.String str34 = triangleDeterminer0.getTriangleType((int) (short) 0, 2, (int) (short) 10, 0);
        java.lang.String str39 = triangleDeterminer0.getTriangleType((int) (short) 10, (int) (byte) 100, (int) 'a', 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equilateral" + "'", str29, "Equilateral");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "NotATriangle" + "'", str34, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Equilateral" + "'", str39, "Equilateral");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 1, 10, (int) 'a');
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) ' ', (int) '4');
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) '4', (int) (byte) 10, (int) (short) 10, (int) '4');
        int int28 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Isosceles" + "'", str15, "Isosceles");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 2, 100, (int) (short) 10);
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        int int23 = triangleDeterminer0.getMatchValue((-1), (int) '#', (int) '#');
        java.lang.String str28 = triangleDeterminer0.getTriangleType((int) (short) 10, (int) (short) 0, 100, 3);
        java.lang.String str33 = triangleDeterminer0.getTriangleType(0, (int) (byte) 100, (int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass34 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equilateral" + "'", str28, "Equilateral");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "NotATriangle" + "'", str33, "NotATriangle");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) '#', (int) '#', 100, (int) ' ');
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) '4', 3, 0, 10);
        int int28 = triangleDeterminer0.getMatchValue((int) '4', (int) (byte) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass29 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        int int13 = triangleDeterminer0.getMatchValue(3, (int) (short) 0, 0);
        int int17 = triangleDeterminer0.getMatchValue((-1), (int) (byte) -1, 3);
        int int21 = triangleDeterminer0.getMatchValue((int) 'a', (int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        int int22 = triangleDeterminer0.getMatchValue((int) 'a', (int) ' ', (int) (short) 0);
        int int26 = triangleDeterminer0.getMatchValue(0, 1, 0);
        int int30 = triangleDeterminer0.getMatchValue(10, 3, (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) '#', 2);
        int int13 = triangleDeterminer0.getMatchValue(10, (int) (byte) -1, (int) (short) -1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType(100, 3, (int) (byte) 0, (int) (byte) 100);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) 100, 2, (int) (byte) 10);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(6, (int) (byte) 1, (int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass28 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equilateral" + "'", str18, "Equilateral");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equilateral" + "'", str27, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType((-1), (int) '4', (int) (byte) 0, (int) 'a');
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) '4', 0, (-1), (int) '#');
        java.lang.Class<?> wildcardClass16 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (short) 100, (int) (short) 0, (int) (short) 0);
        int int22 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (byte) 100, 3, (int) (short) 100, (int) (byte) 10);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(0, (int) (byte) 10, (int) (byte) 1, 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) '4', (int) (short) 0, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equilateral" + "'", str20, "Equilateral");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 10, (int) (byte) 10, (-1));
        int int27 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) '#', (int) (short) 10);
        int int31 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) ' ', (int) (short) 0);
        java.lang.String str36 = triangleDeterminer0.getTriangleType((int) (byte) 10, 10, (int) (short) 10, (int) (short) 0);
        int int40 = triangleDeterminer0.getMatchValue(6, 3, 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NotATriangle" + "'", str23, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equilateral" + "'", str36, "Equilateral");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(10, 100, (int) (byte) 0, (int) (byte) 10);
        int int31 = triangleDeterminer0.getMatchValue(0, (int) '#', 1);
        java.lang.String str36 = triangleDeterminer0.getTriangleType((int) (byte) 10, 0, (int) ' ', (int) (short) 1);
        java.lang.String str41 = triangleDeterminer0.getTriangleType((int) (byte) -1, (-1), 3, (int) (short) 0);
        int int45 = triangleDeterminer0.getMatchValue((int) (short) 0, 10, (int) '#');
        java.lang.String str50 = triangleDeterminer0.getTriangleType(0, (int) (short) -1, 2, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equilateral" + "'", str27, "Equilateral");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equilateral" + "'", str36, "Equilateral");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Equilateral" + "'", str41, "Equilateral");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "NotATriangle" + "'", str50, "NotATriangle");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 10, (int) (byte) 10, (-1));
        int int27 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) '#', (int) (short) 10);
        int int31 = triangleDeterminer0.getMatchValue((int) (short) 100, 0, 1);
        int int35 = triangleDeterminer0.getMatchValue(3, (int) (short) -1, (int) (short) 10);
        java.lang.String str40 = triangleDeterminer0.getTriangleType((int) (short) 10, 3, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NotATriangle" + "'", str23, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equilateral" + "'", str40, "Equilateral");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 10, (int) (byte) 10, (-1));
        int int27 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) '#', (int) (short) 10);
        int int31 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) ' ', (int) (short) 0);
        java.lang.String str36 = triangleDeterminer0.getTriangleType((int) (byte) 10, 10, (int) (short) 10, (int) (short) 0);
        int int40 = triangleDeterminer0.getMatchValue(2, 2, 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NotATriangle" + "'", str23, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equilateral" + "'", str36, "Equilateral");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        int int8 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) (short) -1, (int) '#');
        int int12 = triangleDeterminer0.getMatchValue((int) (short) 1, 2, 100);
        java.lang.String str17 = triangleDeterminer0.getTriangleType((int) (short) 100, 3, (int) '4', (int) 'a');
        java.lang.String str22 = triangleDeterminer0.getTriangleType((int) '4', (int) (short) 1, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Equilateral" + "'", str17, "Equilateral");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Equilateral" + "'", str22, "Equilateral");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(2, (int) (byte) 1, (int) (byte) 1, (int) (short) -1);
        java.lang.String str32 = triangleDeterminer0.getTriangleType(2, 0, 0, (int) (short) 0);
        java.lang.String str37 = triangleDeterminer0.getTriangleType((int) 'a', (int) ' ', (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "NotATriangle" + "'", str27, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "NotATriangle" + "'", str32, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Equilateral" + "'", str37, "Equilateral");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue(10, (int) (short) 1, 6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((-1), (int) (byte) -1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) ' ', (int) (byte) 10, (int) 'a', (int) (short) -1);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 1, (int) (short) -1, 1);
        int int23 = triangleDeterminer0.getMatchValue(0, (int) '4', (int) (byte) -1);
        java.lang.String str28 = triangleDeterminer0.getTriangleType(2, 1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Equilateral" + "'", str14, "Equilateral");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Isosceles" + "'", str19, "Isosceles");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "NotATriangle" + "'", str28, "NotATriangle");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(10, 100, (int) (byte) 0, (int) (byte) 10);
        int int31 = triangleDeterminer0.getMatchValue(3, (int) '#', (int) ' ');
        java.lang.String str36 = triangleDeterminer0.getTriangleType((int) (byte) 100, (int) ' ', 3, 10);
        java.lang.String str41 = triangleDeterminer0.getTriangleType(0, (int) (byte) 100, (int) (byte) 100, 0);
        int int45 = triangleDeterminer0.getMatchValue(2, (int) (byte) 10, 3);
        int int49 = triangleDeterminer0.getMatchValue((int) '#', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equilateral" + "'", str27, "Equilateral");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equilateral" + "'", str36, "Equilateral");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "NotATriangle" + "'", str41, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 10, (int) (byte) 10, (-1));
        int int27 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) '#', (int) (short) 10);
        int int31 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) ' ', (int) (short) 0);
        java.lang.String str36 = triangleDeterminer0.getTriangleType((int) (byte) 10, 10, (int) (short) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NotATriangle" + "'", str23, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equilateral" + "'", str36, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (short) 0, 100, (int) (short) 100, (int) (byte) -1);
        int int14 = triangleDeterminer0.getMatchValue((int) (short) 0, 6, (int) '#');
        java.lang.Class<?> wildcardClass15 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 2, 100, (int) (short) 10);
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        int int23 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (short) 100, 100);
        int int27 = triangleDeterminer0.getMatchValue(100, 2, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(2, (int) (byte) 1, (int) (byte) 1, (int) (short) -1);
        java.lang.String str32 = triangleDeterminer0.getTriangleType(1, 2, (int) '#', (int) 'a');
        java.lang.String str37 = triangleDeterminer0.getTriangleType((int) (short) 10, (int) (byte) 1, (int) (byte) 10, (int) 'a');
        int int41 = triangleDeterminer0.getMatchValue((int) 'a', (int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "NotATriangle" + "'", str27, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Isosceles" + "'", str32, "Isosceles");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Equilateral" + "'", str37, "Equilateral");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(1, 100, 2, (int) ' ');
        int int23 = triangleDeterminer0.getMatchValue(0, (int) (byte) 100, 100);
        int int27 = triangleDeterminer0.getMatchValue(1, 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Isosceles" + "'", str19, "Isosceles");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) '#', (int) '#', 100, (int) ' ');
        int int23 = triangleDeterminer0.getMatchValue((int) '4', (int) '#', (int) ' ');
        int int27 = triangleDeterminer0.getMatchValue(2, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(10, 100, (int) (byte) 0, (int) (byte) 10);
        int int31 = triangleDeterminer0.getMatchValue(0, (int) '#', 1);
        java.lang.String str36 = triangleDeterminer0.getTriangleType((int) '4', (int) '4', (int) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equilateral" + "'", str27, "Equilateral");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Equilateral" + "'", str36, "Equilateral");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str25 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (short) 0, (int) (byte) 1, (int) ' ');
        java.lang.String str30 = triangleDeterminer0.getTriangleType((int) (short) 10, (int) (byte) 10, (int) (byte) 10, (int) '4');
        int int34 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (short) 10, 3);
        int int38 = triangleDeterminer0.getMatchValue(1, 100, (int) (short) 10);
        int int42 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 0, 10);
        java.lang.String str47 = triangleDeterminer0.getTriangleType(0, (int) 'a', (int) 'a', 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equilateral" + "'", str25, "Equilateral");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equilateral" + "'", str30, "Equilateral");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Scalene" + "'", str47, "Scalene");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 0);
        java.lang.String str23 = triangleDeterminer0.getTriangleType(3, 3, (int) (byte) 0, (int) (short) 100);
        java.lang.String str28 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 10, (int) (short) 10, (int) (byte) -1);
        int int32 = triangleDeterminer0.getMatchValue((int) (byte) 10, 10, 100);
        java.lang.Class<?> wildcardClass33 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Isosceles" + "'", str23, "Isosceles");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equilateral" + "'", str28, "Equilateral");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str25 = triangleDeterminer0.getTriangleType(10, (int) (short) 100, 0, 1);
        int int29 = triangleDeterminer0.getMatchValue((int) (short) 1, (-1), (int) (byte) -1);
        java.lang.String str34 = triangleDeterminer0.getTriangleType((int) (short) -1, (int) (short) 10, 100, (int) '#');
        int int38 = triangleDeterminer0.getMatchValue((int) (byte) 0, 3, (int) (short) -1);
        java.lang.String str43 = triangleDeterminer0.getTriangleType((int) (byte) 100, 0, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equilateral" + "'", str25, "Equilateral");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equilateral" + "'", str34, "Equilateral");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Equilateral" + "'", str43, "Equilateral");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (short) 0, (-1), (-1), (int) (byte) 10);
        java.lang.String str25 = triangleDeterminer0.getTriangleType(2, (int) '4', 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Isosceles" + "'", str25, "Isosceles");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) '#', (int) '#', 100, (int) ' ');
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) '4', 3, 0, 10);
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 100, (int) (short) 10, (int) (short) 1, 10);
        int int33 = triangleDeterminer0.getMatchValue((int) '4', (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equilateral" + "'", str29, "Equilateral");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) '#', (int) '#', 100, (int) ' ');
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) '4', 3, 0, 10);
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 100, (int) (short) 10, (int) (short) 1, 10);
        java.lang.String str34 = triangleDeterminer0.getTriangleType((int) (short) 0, 2, (int) (short) 10, 0);
        int int38 = triangleDeterminer0.getMatchValue((int) (short) 10, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equilateral" + "'", str29, "Equilateral");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "NotATriangle" + "'", str34, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) '#', (int) '#', 100, (int) ' ');
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) '4', 3, 0, 10);
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 100, (int) (short) 10, (int) (short) 1, 10);
        java.lang.String str34 = triangleDeterminer0.getTriangleType((int) (short) 0, 2, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass35 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equilateral" + "'", str29, "Equilateral");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "NotATriangle" + "'", str34, "NotATriangle");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (short) 100, (int) (short) 0, (int) (short) 0);
        int int22 = triangleDeterminer0.getMatchValue((int) ' ', (int) (short) 100, (int) '#');
        int int26 = triangleDeterminer0.getMatchValue(2, (int) ' ', 0);
        int int30 = triangleDeterminer0.getMatchValue((int) (short) 100, 2, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.String str9 = triangleDeterminer0.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (byte) 0, (int) (short) 1, (int) (byte) 1, 1);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) (short) -1, (int) ' ', (int) (short) 1, 10);
        int int23 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 0, (int) ' ');
        java.lang.Class<?> wildcardClass24 = triangleDeterminer0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equilateral" + "'", str9, "Equilateral");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Scalene" + "'", str14, "Scalene");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer0.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer0.getMatchValue((int) 'a', (int) (byte) 100, (int) (byte) 0);
        int int31 = triangleDeterminer0.getMatchValue((int) '4', (int) (byte) -1, (int) ' ');
        int int35 = triangleDeterminer0.getMatchValue((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str40 = triangleDeterminer0.getTriangleType(6, (int) (short) 0, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Equilateral" + "'", str40, "Equilateral");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue(3, 10, (int) (byte) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType((int) ' ', 100, (int) (short) 0, (int) (short) 10);
        java.lang.String str32 = triangleDeterminer0.getTriangleType(10, (int) 'a', 6, (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equilateral" + "'", str27, "Equilateral");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Equilateral" + "'", str32, "Equilateral");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer0.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer0.getMatchValue((int) (byte) 1, 100, (int) (byte) 0);
        int int31 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 0, 100);
        java.lang.String str36 = triangleDeterminer0.getTriangleType((int) (byte) 1, (int) (byte) 1, 6, (int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Isosceles" + "'", str36, "Isosceles");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 1, 2, 10, 1);
        java.lang.String str34 = triangleDeterminer0.getTriangleType((int) '4', 3, (int) (short) 1, 3);
        int int38 = triangleDeterminer0.getMatchValue((int) (short) 10, (int) (byte) 1, (int) (short) -1);
        int int42 = triangleDeterminer0.getMatchValue((int) (short) 10, 3, 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NotATriangle" + "'", str29, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equilateral" + "'", str34, "Equilateral");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }
}

