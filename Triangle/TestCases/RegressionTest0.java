import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.Class<?> wildcardClass11 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(100, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.Class<?> wildcardClass6 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        java.lang.Class<?> wildcardClass15 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.Class<?> wildcardClass1 = triangleDeterminer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.Class<?> wildcardClass5 = triangleDeterminer0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass6 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (byte) 100, (-1), (int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass11 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 2, 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) '#', 2);
        java.lang.Class<?> wildcardClass10 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue((int) '4', (int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass10 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer0.getMatchValue(0, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '4', 0, 0, 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType((-1), (int) '4', (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass11 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.Class<?> wildcardClass6 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 1, 10, (int) 'a');
        java.lang.Class<?> wildcardClass16 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Isosceles" + "'", str15, "Isosceles");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass16 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (short) 10, (int) '#', 10);
        int int22 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass23 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        int int8 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) (short) -1, (int) '#');
        int int12 = triangleDeterminer0.getMatchValue((int) (short) 1, 2, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType((-1), (int) '4', (int) (byte) 0, (int) 'a');
        int int14 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        java.lang.String str29 = triangleDeterminer0.getTriangleType(10, 100, 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equilateral" + "'", str29, "Equilateral");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        int int8 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass9 = triangleDeterminer0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) -1);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(0, (int) (short) 0, (int) '#', 0);
        java.lang.Class<?> wildcardClass21 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) 0, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 2, 100, (int) (short) 10);
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (byte) 100, (-1), (int) (short) 100, (-1));
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 3, (int) (short) 0, (int) (byte) 1);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Isosceles" + "'", str15, "Isosceles");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer0.getMatchValue(0, 0, (int) (short) 1);
        java.lang.String str28 = triangleDeterminer0.getTriangleType((int) '4', 100, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equilateral" + "'", str28, "Equilateral");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 2, 100, (int) (short) 10);
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (short) 10, (int) ' ', (int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass21 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equilateral" + "'", str20, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 1, 2, 10, 1);
        java.lang.Class<?> wildcardClass30 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NotATriangle" + "'", str29, "NotATriangle");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 2, 100, (int) (short) 10);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(0, (int) 'a', 3, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) '#', 2);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (short) 1, 10, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) 'a', 1, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((-1), (int) (byte) -1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType((-1), 3, (int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equilateral" + "'", str23, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        java.lang.Class<?> wildcardClass11 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 1, 2, 10, 1);
        java.lang.String str34 = triangleDeterminer0.getTriangleType(0, (int) (byte) 100, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NotATriangle" + "'", str29, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Scalene" + "'", str34, "Scalene");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) -1);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(0, (int) (short) 0, (int) '#', 0);
        int int24 = triangleDeterminer0.getMatchValue((int) ' ', 100, (int) (short) 10);
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 10, (int) '#', 3, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Equilateral" + "'", str29, "Equilateral");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType((int) ' ', (int) 'a', 3, 10);
        java.lang.Class<?> wildcardClass24 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equilateral" + "'", str23, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (byte) 100, (-1), (int) (short) 100, (-1));
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 3, (int) (short) 0, (int) (byte) 1);
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Isosceles" + "'", str15, "Isosceles");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) -1);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(0, (int) (short) 0, (int) '#', 0);
        int int24 = triangleDeterminer0.getMatchValue((int) ' ', 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer0.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer0.getMatchValue((int) 'a', (int) (byte) 100, (int) (byte) 0);
        int int31 = triangleDeterminer0.getMatchValue((int) (byte) 100, 100, 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.String str9 = triangleDeterminer0.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (byte) 0, (int) (short) 1, (int) (byte) 1, 1);
        int int18 = triangleDeterminer0.getMatchValue(0, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equilateral" + "'", str9, "Equilateral");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Scalene" + "'", str14, "Scalene");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 1, 10, (int) 'a');
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (byte) 1, (int) (short) -1, (int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass21 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Isosceles" + "'", str15, "Isosceles");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Isosceles" + "'", str20, "Isosceles");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.String str9 = triangleDeterminer0.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (byte) 0, (int) (short) 1, (int) (byte) 1, 1);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(1, 0, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equilateral" + "'", str9, "Equilateral");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Scalene" + "'", str14, "Scalene");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NotATriangle" + "'", str19, "NotATriangle");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.String str9 = triangleDeterminer0.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (byte) 0, (int) (short) 1, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass15 = triangleDeterminer0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equilateral" + "'", str9, "Equilateral");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Scalene" + "'", str14, "Scalene");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 1, 10, (int) 'a');
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (byte) 1, (int) (short) -1, (int) (short) 10, (int) 'a');
        int int24 = triangleDeterminer0.getMatchValue(1, (-1), (int) (short) -1);
        int int28 = triangleDeterminer0.getMatchValue(10, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Isosceles" + "'", str15, "Isosceles");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Isosceles" + "'", str20, "Isosceles");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) '#', (int) '#', 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) 'a', (int) (byte) 0, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equilateral" + "'", str20, "Equilateral");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        int int13 = triangleDeterminer0.getMatchValue(3, (int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(2, 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 1, 2, 10, 1);
        java.lang.String str34 = triangleDeterminer0.getTriangleType((int) '4', 3, (int) (short) 1, 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NotATriangle" + "'", str29, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Equilateral" + "'", str34, "Equilateral");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (short) 0, (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass19 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 1, 10, (int) 'a');
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Isosceles" + "'", str15, "Isosceles");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.String str9 = triangleDeterminer0.getTriangleType(2, (int) '4', (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Isosceles" + "'", str9, "Isosceles");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 1, 2, 10, 1);
        int int33 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        java.lang.String str38 = triangleDeterminer0.getTriangleType(0, (int) (byte) 100, (int) (short) 0, 1);
        java.lang.String str43 = triangleDeterminer0.getTriangleType((int) (short) -1, 10, 0, 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NotATriangle" + "'", str29, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NotATriangle" + "'", str38, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Equilateral" + "'", str43, "Equilateral");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        java.lang.String str23 = triangleDeterminer0.getTriangleType((int) (short) 1, 3, (-1), 100);
        java.lang.String str28 = triangleDeterminer0.getTriangleType(10, (int) ' ', (int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass29 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Isosceles" + "'", str23, "Isosceles");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equilateral" + "'", str28, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType((int) (short) 10, 2, (-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 2, (int) (byte) -1, (int) 'a');
        java.lang.String str28 = triangleDeterminer0.getTriangleType(10, 1, 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Isosceles" + "'", str23, "Isosceles");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equilateral" + "'", str28, "Equilateral");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer0.getMatchValue((-1), 2, (int) (short) 1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType((int) (short) 1, 0, 0, (int) (short) 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType(3, (int) (byte) 100, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NotATriangle" + "'", str23, "NotATriangle");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (byte) 100, (-1), (int) (short) 100, (-1));
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) ' ', (int) (short) 100, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue((int) '4', (int) (short) 0, (int) (byte) 100);
        int int23 = triangleDeterminer0.getMatchValue((int) ' ', (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer0.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer0.getMatchValue((int) (byte) 1, 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType((int) ' ', (int) 'a', 3, 10);
        int int27 = triangleDeterminer0.getMatchValue((int) (short) 1, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equilateral" + "'", str23, "Equilateral");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) -1);
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (byte) 100, (int) (byte) 0, (int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Equilateral" + "'", str20, "Equilateral");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.String str9 = triangleDeterminer0.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass10 = triangleDeterminer0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equilateral" + "'", str9, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 1, 2, 10, 1);
        int int33 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass34 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NotATriangle" + "'", str29, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str25 = triangleDeterminer0.getTriangleType(10, (int) (short) 100, 0, 1);
        int int29 = triangleDeterminer0.getMatchValue((int) (short) 1, (-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equilateral" + "'", str25, "Equilateral");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) '#', 2);
        int int13 = triangleDeterminer0.getMatchValue(10, (int) (byte) -1, (int) (short) -1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType(100, 3, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Equilateral" + "'", str18, "Equilateral");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue((int) '4', (int) (short) 0, (int) (byte) 100);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (byte) 10, (int) (byte) 1, 1, 1);
        java.lang.Class<?> wildcardClass25 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (short) 0, (-1), (-1), (int) (byte) 10);
        java.lang.String str25 = triangleDeterminer0.getTriangleType(10, 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str30 = triangleDeterminer0.getTriangleType((int) (short) 0, (-1), 0, 1);
        java.lang.String str35 = triangleDeterminer0.getTriangleType((int) (short) 100, (int) (short) 10, (int) (short) 1, (int) (byte) 10);
        int int39 = triangleDeterminer0.getMatchValue(0, (int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass40 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equilateral" + "'", str25, "Equilateral");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "NotATriangle" + "'", str30, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Equilateral" + "'", str35, "Equilateral");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass10 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType((-1), 3, (int) (short) 100, (int) (byte) 10);
        java.lang.String str28 = triangleDeterminer0.getTriangleType(0, (int) (short) 100, (int) ' ', (int) (short) 100);
        int int32 = triangleDeterminer0.getMatchValue(2, (int) '#', (int) 'a');
        int int36 = triangleDeterminer0.getMatchValue((int) (short) 1, (int) '4', (int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equilateral" + "'", str23, "Equilateral");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Scalene" + "'", str28, "Scalene");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer0.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer0.getMatchValue((int) 'a', (int) (byte) 100, (int) (byte) 0);
        int int31 = triangleDeterminer0.getMatchValue((int) '4', (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str25 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (short) 0, (int) (byte) 1, (int) ' ');
        java.lang.String str30 = triangleDeterminer0.getTriangleType((int) (short) 10, (int) (byte) 10, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equilateral" + "'", str25, "Equilateral");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Equilateral" + "'", str30, "Equilateral");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (short) 1, (int) (short) 100, (int) (byte) 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Isosceles" + "'", str23, "Isosceles");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(10, 100, (int) (byte) 0, (int) (byte) 10);
        int int31 = triangleDeterminer0.getMatchValue(3, (int) '#', (int) ' ');
        int int35 = triangleDeterminer0.getMatchValue((int) (short) 10, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equilateral" + "'", str27, "Equilateral");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType(10, (int) (byte) 0, (int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer0.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer0.getMatchValue((int) ' ', 2, (int) (byte) 1);
        java.lang.String str32 = triangleDeterminer0.getTriangleType(3, (int) (short) 1, (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "NotATriangle" + "'", str32, "NotATriangle");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (short) 0, 100, (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (byte) 100, 3, (int) (short) 100, (int) (byte) 10);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 3, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType((-1), 3, (int) (short) 100, (int) (byte) 10);
        java.lang.String str28 = triangleDeterminer0.getTriangleType(0, (int) (short) 100, (int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass29 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equilateral" + "'", str23, "Equilateral");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Scalene" + "'", str28, "Scalene");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 2, 100, (int) (short) 10);
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        int int23 = triangleDeterminer0.getMatchValue((-1), (int) '#', (int) '#');
        java.lang.String str28 = triangleDeterminer0.getTriangleType((int) (short) 10, (int) (short) 0, 100, 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Equilateral" + "'", str28, "Equilateral");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        java.lang.String str23 = triangleDeterminer0.getTriangleType((int) (short) 1, 3, (-1), 100);
        java.lang.String str28 = triangleDeterminer0.getTriangleType(0, (int) (short) 10, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Isosceles" + "'", str23, "Isosceles");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "NotATriangle" + "'", str28, "NotATriangle");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) '#', 2);
        int int13 = triangleDeterminer0.getMatchValue(10, (int) (byte) -1, (int) (short) -1);
        java.lang.String str18 = triangleDeterminer0.getTriangleType(3, (int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Isosceles" + "'", str18, "Isosceles");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.String str9 = triangleDeterminer0.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (byte) 0, (int) (short) 1, (int) (byte) 1, 1);
        int int18 = triangleDeterminer0.getMatchValue((int) 'a', (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equilateral" + "'", str9, "Equilateral");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Scalene" + "'", str14, "Scalene");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        int int19 = triangleDeterminer0.getMatchValue((-1), (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        int int24 = triangleDeterminer0.getMatchValue((int) (short) 10, 0, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType((int) (short) -1, (int) (byte) -1, 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equilateral" + "'", str27, "Equilateral");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (short) 0, 100, (int) (short) 100, (int) (byte) -1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) '4', (int) 'a', (int) (byte) -1);
        int int19 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType((-1), 3, (int) (short) 100, (int) (byte) 10);
        int int27 = triangleDeterminer0.getMatchValue((int) (byte) 1, 3, (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equilateral" + "'", str23, "Equilateral");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((-1), (int) (byte) -1, 0, (int) 'a');
        java.lang.Class<?> wildcardClass6 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue(100, (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 2, 100, (int) (short) 10);
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        int int23 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass24 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(2, (int) (byte) 1, (int) (byte) 1, (int) (short) -1);
        java.lang.String str32 = triangleDeterminer0.getTriangleType((int) (byte) 1, (int) (byte) 1, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "NotATriangle" + "'", str27, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "NotATriangle" + "'", str32, "NotATriangle");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (short) 0, (-1), (-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(1, 100, 2, (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Isosceles" + "'", str19, "Isosceles");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(10, 100, (int) (byte) 0, (int) (byte) 10);
        int int31 = triangleDeterminer0.getMatchValue(0, (int) '#', 1);
        java.lang.String str36 = triangleDeterminer0.getTriangleType(1, (int) (byte) 100, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equilateral" + "'", str27, "Equilateral");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Isosceles" + "'", str36, "Isosceles");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 2, (int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass24 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Isosceles" + "'", str23, "Isosceles");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str25 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (short) 0, (int) (byte) 1, (int) ' ');
        int int29 = triangleDeterminer0.getMatchValue((-1), (int) (byte) 0, 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equilateral" + "'", str25, "Equilateral");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (short) 1, (int) (short) 100, (int) (byte) 10);
        java.lang.String str23 = triangleDeterminer0.getTriangleType((int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equilateral" + "'", str23, "Equilateral");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue(2, 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        java.lang.String str23 = triangleDeterminer0.getTriangleType((int) (short) 1, 3, (-1), 100);
        int int27 = triangleDeterminer0.getMatchValue((int) 'a', (int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Isosceles" + "'", str23, "Isosceles");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }
}

