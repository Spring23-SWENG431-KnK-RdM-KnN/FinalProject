import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.Class<?> wildcardClass11 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.Class<?> wildcardClass6 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.String str9 = triangleDeterminer0.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Equilateral" + "'", str9, "Equilateral");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.Class<?> wildcardClass1 = triangleDeterminer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        java.lang.Class<?> wildcardClass5 = triangleDeterminer0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass6 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (short) 1, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (byte) 100, (-1), (int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass11 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) '#', 2);
        java.lang.Class<?> wildcardClass10 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer0.getMatchValue(100, (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass10 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '4', 0, 0, 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType((-1), (int) '4', (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass11 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.Class<?> wildcardClass6 = triangleDeterminer0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) '#', 2);
        int int13 = triangleDeterminer0.getMatchValue(10, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer0.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer0.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer0.getMatchValue((int) ' ', 2, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (byte) 100, (-1), (int) (short) 100, (-1));
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 3, (int) (short) 0, (int) (byte) 1);
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 0, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Isosceles" + "'", str15, "Isosceles");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer0.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer0.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer0.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        java.lang.String str27 = triangleDeterminer0.getTriangleType(10, 100, (int) (byte) 0, (int) (byte) 10);
        int int31 = triangleDeterminer0.getMatchValue(3, (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Equilateral" + "'", str27, "Equilateral");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        int int8 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) (short) -1, (int) '#');
        int int12 = triangleDeterminer0.getMatchValue((int) (short) 1, 2, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType((int) (byte) 100, 3, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType((int) ' ', (int) 'a', 3, 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equilateral" + "'", str23, "Equilateral");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        int int4 = triangleDeterminer0.getMatchValue((int) (byte) 100, (int) 'a', 100);
        int int8 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass9 = triangleDeterminer0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (short) 0, (-1), (-1), (int) (byte) 10);
        java.lang.String str25 = triangleDeterminer0.getTriangleType(10, 0, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Equilateral" + "'", str25, "Equilateral");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        java.lang.String str10 = triangleDeterminer0.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) -1);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(0, (int) (short) 0, (int) '#', 0);
        int int24 = triangleDeterminer0.getMatchValue((int) ' ', 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
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
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (byte) 1, 10, (int) 'a');
        java.lang.String str20 = triangleDeterminer0.getTriangleType((int) (byte) 1, (int) (short) -1, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Isosceles" + "'", str15, "Isosceles");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Isosceles" + "'", str20, "Isosceles");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
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
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
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
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
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
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        java.lang.String str15 = triangleDeterminer0.getTriangleType(1, 2, 100, (int) (short) 10);
        int int19 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        int int23 = triangleDeterminer0.getMatchValue((-1), (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "NotATriangle" + "'", str15, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
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
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer0.getMatchValue((int) ' ', 0, (int) (byte) 0);
        java.lang.String str19 = triangleDeterminer0.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str24 = triangleDeterminer0.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        java.lang.String str29 = triangleDeterminer0.getTriangleType((int) (short) 1, 2, 10, 1);
        int int33 = triangleDeterminer0.getMatchValue((int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        java.lang.String str38 = triangleDeterminer0.getTriangleType(0, (int) (byte) 100, (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NotATriangle" + "'", str10, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Equilateral" + "'", str19, "Equilateral");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Equilateral" + "'", str24, "Equilateral");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NotATriangle" + "'", str29, "NotATriangle");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NotATriangle" + "'", str38, "NotATriangle");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(1, 1, 0, 0);
        java.lang.String str15 = triangleDeterminer0.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        java.lang.String str20 = triangleDeterminer0.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Isosceles" + "'", str10, "Isosceles");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Equilateral" + "'", str15, "Equilateral");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "NotATriangle" + "'", str20, "NotATriangle");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType(2, 2, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Isosceles" + "'", str23, "Isosceles");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        java.lang.String str10 = triangleDeterminer0.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer0.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer0.getMatchValue(1, (int) (short) -1, (int) 'a');
        java.lang.String str23 = triangleDeterminer0.getTriangleType((-1), 3, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Equilateral" + "'", str10, "Equilateral");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Equilateral" + "'", str23, "Equilateral");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
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
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
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
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.example.TriangleDeterminer triangleDeterminer0 = new org.example.TriangleDeterminer();
        java.lang.String str5 = triangleDeterminer0.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer0.getMatchValue((int) (byte) -1, (int) '#', 2);
        java.lang.String str14 = triangleDeterminer0.getTriangleType((int) (short) 1, (int) (short) 1, 10, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Equilateral" + "'", str5, "Equilateral");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NotATriangle" + "'", str14, "NotATriangle");
    }
}

