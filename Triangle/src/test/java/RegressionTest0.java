import org.example.TriangleDeterminer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegressionTest0 {

    TriangleDeterminer triangleDeterminer = new TriangleDeterminer();

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        Assertions.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        
        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        Class<?> wildcardClass11 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertNotNull(wildcardClass11);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        
        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue(100, (int) (byte) -1, (int) (byte) 10);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        
        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        Class<?> wildcardClass6 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        
        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        Class<?> wildcardClass15 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass15);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");

        Class<?> wildcardClass1 = triangleDeterminer.getClass();
        Assertions.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");

        int int4 = triangleDeterminer.getMatchValue((int) (byte) 100, (int) 'a', 100);
        Class<?> wildcardClass5 = triangleDeterminer.getClass();
        Assertions.assertTrue(int4 == 2, "'" + int4 + "' != '" + 2 + "'");
        Assertions.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        Class<?> wildcardClass6 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        Class<?> wildcardClass11 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType((int) (byte) 100, (-1), (int) (short) 100, (-1));
        Class<?> wildcardClass11 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType(1, 2, 100, (int) (short) 10);
        Class<?> wildcardClass16 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "NotATriangle", "'" + str15 + "' != '" + "NotATriangle" + "'");
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(10, (int) ' ', (int) (byte) 1);
        Class<?> wildcardClass15 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass15);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer.getMatchValue((int) (byte) -1, (int) '#', 2);
        Class<?> wildcardClass10 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        String str14 = triangleDeterminer.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        Class<?> wildcardClass15 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertEquals(str14, "NotATriangle", "'" + str14 + "' != '" + "NotATriangle" + "'");
        Assertions.assertNotNull(wildcardClass15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue((int) '4', (int) (short) 0, (int) (byte) 100);
        Class<?> wildcardClass20 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass20);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer.getMatchValue(100, (int) ' ', (int) '4');
        Class<?> wildcardClass10 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer.getMatchValue(0, 0, (int) (short) 1);
        Class<?> wildcardClass24 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertTrue(int23 == 1, "'" + int23 + "' != '" + 1 + "'");
        Assertions.assertNotNull(wildcardClass24);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");

        String str5 = triangleDeterminer.getTriangleType((int) '4', 0, 0, 3);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType((-1), (int) '4', (int) (byte) 0, (int) 'a');
        Class<?> wildcardClass11 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        Class<?> wildcardClass6 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType((int) (short) 1, (int) (byte) 1, 10, (int) 'a');
        Class<?> wildcardClass16 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Isosceles", "'" + str15 + "' != '" + "Isosceles" + "'");
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        Class<?> wildcardClass16 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) 0);
        Class<?> wildcardClass15 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertNotNull(wildcardClass15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        Class<?> wildcardClass16 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass16);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (short) 10, (int) '#', 10);
        int int22 = triangleDeterminer.getMatchValue((int) (byte) -1, (int) (byte) 10, 0);
        Class<?> wildcardClass23 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 2, "'" + int18 + "' != '" + 2 + "'");
        Assertions.assertTrue(int22 == 0, "'" + int22 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass23);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");

        int int4 = triangleDeterminer.getMatchValue((int) (byte) 100, (int) 'a', 100);
        int int8 = triangleDeterminer.getMatchValue((int) (byte) -1, (int) (short) -1, (int) '#');
        int int12 = triangleDeterminer.getMatchValue((int) (short) 1, 2, 100);
        Assertions.assertTrue(int4 == 2, "'" + int4 + "' != '" + 2 + "'");
        Assertions.assertTrue(int8 == 1, "'" + int8 + "' != '" + 1 + "'");
        Assertions.assertTrue(int12 == 0, "'" + int12 + "' != '" + 0 + "'");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType((-1), (int) '4', (int) (byte) 0, (int) 'a');
        int int14 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) (byte) 0, (int) (short) 0);
        Class<?> wildcardClass15 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertNotNull(wildcardClass15);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) 0);
        String str19 = triangleDeterminer.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        String str24 = triangleDeterminer.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        String str29 = triangleDeterminer.getTriangleType(10, 100, 100, (int) (short) 100);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertEquals(str19, "Equilateral", "'" + str19 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str24, "Equilateral", "'" + str24 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str29, "Equilateral", "'" + str29 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");

        int int4 = triangleDeterminer.getMatchValue((int) (byte) 100, (int) 'a', 100);
        int int8 = triangleDeterminer.getMatchValue((int) (byte) -1, (int) (short) -1, (int) '#');
        Class<?> wildcardClass9 = triangleDeterminer.getClass();
        Assertions.assertTrue(int4 == 2, "'" + int4 + "' != '" + 2 + "'");
        Assertions.assertTrue(int8 == 1, "'" + int8 + "' != '" + 1 + "'");
        Assertions.assertNotNull(wildcardClass9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        String str15 = triangleDeterminer.getTriangleType((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) -1);
        String str20 = triangleDeterminer.getTriangleType(0, (int) (short) 0, (int) '#', 0);
        Class<?> wildcardClass21 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "NotATriangle", "'" + str20 + "' != '" + "NotATriangle" + "'");
        Assertions.assertNotNull(wildcardClass21);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer.getMatchValue((int) (short) 0, (int) (byte) 0, (int) (short) 1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 1, "'" + int18 + "' != '" + 1 + "'");
        Assertions.assertTrue(int22 == 1, "'" + int22 + "' != '" + 1 + "'");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType(1, 2, 100, (int) (short) 10);
        int int19 = triangleDeterminer.getMatchValue((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        Class<?> wildcardClass20 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "NotATriangle", "'" + str15 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        Class<?> wildcardClass23 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 1, "'" + int18 + "' != '" + 1 + "'");
        Assertions.assertTrue(int22 == 0, "'" + int22 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass23);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType((int) (byte) 100, (-1), (int) (short) 100, (-1));
        String str15 = triangleDeterminer.getTriangleType(1, 3, (int) (short) 0, (int) (byte) 1);
        int int19 = triangleDeterminer.getMatchValue(1, (int) (byte) 100, (int) (short) 1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Isosceles", "'" + str15 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int19 == 2, "'" + int19 + "' != '" + 2 + "'");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer.getMatchValue(0, 0, (int) (short) 1);
        String str28 = triangleDeterminer.getTriangleType((int) '4', 100, (int) (short) 0, (int) (short) -1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertTrue(int23 == 1, "'" + int23 + "' != '" + 1 + "'");
        Assertions.assertEquals(str28, "Equilateral", "'" + str28 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer.getMatchValue((-1), 2, (int) (short) 1);
        Class<?> wildcardClass14 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertTrue(int13 == 0, "'" + int13 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType(1, 2, 100, (int) (short) 10);
        String str20 = triangleDeterminer.getTriangleType((int) (short) 10, (int) ' ', (int) (byte) 10, 1);
        Class<?> wildcardClass21 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "NotATriangle", "'" + str15 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str20, "Equilateral", "'" + str20 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass21);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) 0);
        String str19 = triangleDeterminer.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        String str24 = triangleDeterminer.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        String str29 = triangleDeterminer.getTriangleType((int) (short) 1, 2, 10, 1);
        Class<?> wildcardClass30 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertEquals(str19, "Equilateral", "'" + str19 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str24, "Equilateral", "'" + str24 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str29, "NotATriangle", "'" + str29 + "' != '" + "NotATriangle" + "'");
        Assertions.assertNotNull(wildcardClass30);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType(1, 2, 100, (int) (short) 10);
        String str20 = triangleDeterminer.getTriangleType(0, (int) 'a', 3, (int) (byte) -1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "NotATriangle", "'" + str15 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str20, "NotATriangle", "'" + str20 + "' != '" + "NotATriangle" + "'");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer.getMatchValue((int) (byte) -1, (int) '#', 2);
        String str14 = triangleDeterminer.getTriangleType((int) (short) 1, (int) (short) 1, 10, 0);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertEquals(str14, "NotATriangle", "'" + str14 + "' != '" + "NotATriangle" + "'");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        String str19 = triangleDeterminer.getTriangleType((int) 'a', 1, 100, (int) (byte) 10);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertEquals(str19, "Equilateral", "'" + str19 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer.getMatchValue((-1), 2, (int) (short) 1);
        String str18 = triangleDeterminer.getTriangleType((int) (short) 1, (int) (byte) 100, (int) (byte) 0, 10);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertTrue(int13 == 0, "'" + int13 + "' != '" + 0 + "'");
        Assertions.assertEquals(str18, "Isosceles", "'" + str18 + "' != '" + "Isosceles" + "'");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");

        String str5 = triangleDeterminer.getTriangleType((-1), (int) (byte) -1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer.getMatchValue(1, (int) (short) -1, (int) 'a');
        String str23 = triangleDeterminer.getTriangleType((-1), 3, (int) (short) 100, (int) (byte) 10);
        Class<?> wildcardClass24 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertEquals(str23, "Equilateral", "'" + str23 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass24);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        Class<?> wildcardClass11 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) 0);
        String str19 = triangleDeterminer.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        String str24 = triangleDeterminer.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        String str29 = triangleDeterminer.getTriangleType((int) (short) 1, 2, 10, 1);
        String str34 = triangleDeterminer.getTriangleType(0, (int) (byte) 100, (int) (short) 1, (int) (short) 100);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertEquals(str19, "Equilateral", "'" + str19 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str24, "Equilateral", "'" + str24 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str29, "NotATriangle", "'" + str29 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str34, "Scalene", "'" + str34 + "' != '" + "Scalene" + "'");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        Class<?> wildcardClass20 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass20);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        String str15 = triangleDeterminer.getTriangleType((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) -1);
        String str20 = triangleDeterminer.getTriangleType(0, (int) (short) 0, (int) '#', 0);
        int int24 = triangleDeterminer.getMatchValue((int) ' ', 100, (int) (short) 10);
        String str29 = triangleDeterminer.getTriangleType((int) (short) 10, (int) '#', 3, 0);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "NotATriangle", "'" + str20 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int24 == 0, "'" + int24 + "' != '" + 0 + "'");
        Assertions.assertEquals(str29, "Equilateral", "'" + str29 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer.getMatchValue(1, (int) (short) -1, (int) 'a');
        String str23 = triangleDeterminer.getTriangleType((int) ' ', (int) 'a', 3, 10);
        Class<?> wildcardClass24 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertEquals(str23, "Equilateral", "'" + str23 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass24);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType((int) (byte) 100, (-1), (int) (short) 100, (-1));
        String str15 = triangleDeterminer.getTriangleType(1, 3, (int) (short) 0, (int) (byte) 1);
        int int19 = triangleDeterminer.getMatchValue((int) (byte) 0, (int) ' ', (int) (short) -1);
        Class<?> wildcardClass20 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Isosceles", "'" + str15 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass20);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        String str15 = triangleDeterminer.getTriangleType((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) -1);
        String str20 = triangleDeterminer.getTriangleType(0, (int) (short) 0, (int) '#', 0);
        int int24 = triangleDeterminer.getMatchValue((int) ' ', 100, (int) (short) 10);
        Class<?> wildcardClass25 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "NotATriangle", "'" + str20 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int24 == 0, "'" + int24 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass25);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer.getMatchValue((int) 'a', (int) (byte) 100, (int) (byte) 0);
        int int31 = triangleDeterminer.getMatchValue((int) (byte) 100, 100, 2);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertTrue(int23 == 1, "'" + int23 + "' != '" + 1 + "'");
        Assertions.assertTrue(int27 == 0, "'" + int27 + "' != '" + 0 + "'");
        Assertions.assertTrue(int31 == 1, "'" + int31 + "' != '" + 1 + "'");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");

        int int4 = triangleDeterminer.getMatchValue((int) (byte) 100, (int) 'a', 100);
        String str9 = triangleDeterminer.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        String str14 = triangleDeterminer.getTriangleType((int) (byte) 0, (int) (short) 1, (int) (byte) 1, 1);
        int int18 = triangleDeterminer.getMatchValue(0, 100, (int) (short) 10);
        Assertions.assertTrue(int4 == 2, "'" + int4 + "' != '" + 2 + "'");
        Assertions.assertEquals(str9, "Equilateral", "'" + str9 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str14, "Scalene", "'" + str14 + "' != '" + "Scalene" + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType((int) (short) 1, (int) (byte) 1, 10, (int) 'a');
        String str20 = triangleDeterminer.getTriangleType((int) (byte) 1, (int) (short) -1, (int) (short) 10, (int) 'a');
        Class<?> wildcardClass21 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Isosceles", "'" + str15 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str20, "Isosceles", "'" + str20 + "' != '" + "Isosceles" + "'");
        Assertions.assertNotNull(wildcardClass21);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");

        int int4 = triangleDeterminer.getMatchValue((int) (byte) 100, (int) 'a', 100);
        String str9 = triangleDeterminer.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        String str14 = triangleDeterminer.getTriangleType((int) (byte) 0, (int) (short) 1, (int) (byte) 1, 1);
        String str19 = triangleDeterminer.getTriangleType(1, 0, (int) (byte) 1, 0);
        Assertions.assertTrue(int4 == 2, "'" + int4 + "' != '" + 2 + "'");
        Assertions.assertEquals(str9, "Equilateral", "'" + str9 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str14, "Scalene", "'" + str14 + "' != '" + "Scalene" + "'");
        Assertions.assertEquals(str19, "NotATriangle", "'" + str19 + "' != '" + "NotATriangle" + "'");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");

        int int4 = triangleDeterminer.getMatchValue((int) (byte) 100, (int) 'a', 100);
        String str9 = triangleDeterminer.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        String str14 = triangleDeterminer.getTriangleType((int) (byte) 0, (int) (short) 1, (int) (byte) 1, 1);
        Class<?> wildcardClass15 = triangleDeterminer.getClass();
        Assertions.assertTrue(int4 == 2, "'" + int4 + "' != '" + 2 + "'");
        Assertions.assertEquals(str9, "Equilateral", "'" + str9 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str14, "Scalene", "'" + str14 + "' != '" + "Scalene" + "'");
        Assertions.assertNotNull(wildcardClass15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType((int) (short) 1, (int) (byte) 1, 10, (int) 'a');
        String str20 = triangleDeterminer.getTriangleType((int) (byte) 1, (int) (short) -1, (int) (short) 10, (int) 'a');
        int int24 = triangleDeterminer.getMatchValue(1, (-1), (int) (short) -1);
        int int28 = triangleDeterminer.getMatchValue(10, (int) (short) 0, (int) (short) 0);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Isosceles", "'" + str15 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str20, "Isosceles", "'" + str20 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int24 == 3, "'" + int24 + "' != '" + 3 + "'");
        Assertions.assertTrue(int28 == 3, "'" + int28 + "' != '" + 3 + "'");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        String str14 = triangleDeterminer.getTriangleType((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0);
        String str19 = triangleDeterminer.getTriangleType((int) '#', (int) '#', 100, (int) ' ');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertEquals(str14, "NotATriangle", "'" + str14 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str19, "Equilateral", "'" + str19 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer.getMatchValue((int) (short) -1, (int) '4', (int) (byte) 1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        String str20 = triangleDeterminer.getTriangleType((int) 'a', (int) (byte) 0, (int) '#', (int) (byte) -1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "Equilateral", "'" + str20 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        int int13 = triangleDeterminer.getMatchValue(3, (int) (short) 0, 0);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertTrue(int13 == 3, "'" + int13 + "' != '" + 3 + "'");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(2, 1, (int) (byte) -1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) 0);
        String str19 = triangleDeterminer.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        String str24 = triangleDeterminer.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        String str29 = triangleDeterminer.getTriangleType((int) (short) 1, 2, 10, 1);
        String str34 = triangleDeterminer.getTriangleType((int) '4', 3, (int) (short) 1, 3);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertEquals(str19, "Equilateral", "'" + str19 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str24, "Equilateral", "'" + str24 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str29, "NotATriangle", "'" + str29 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str34, "Equilateral", "'" + str34 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) 0);
        int int18 = triangleDeterminer.getMatchValue((int) (short) 0, (int) (byte) 1, (int) '4');
        Class<?> wildcardClass19 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass19);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType((int) (short) 1, (int) (byte) 1, 10, (int) 'a');
        int int19 = triangleDeterminer.getMatchValue((int) (byte) 100, (int) ' ', (int) '4');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Isosceles", "'" + str15 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");

        int int4 = triangleDeterminer.getMatchValue((int) (byte) 100, (int) 'a', 100);
        String str9 = triangleDeterminer.getTriangleType(2, (int) '4', (int) (byte) 1, 10);
        Assertions.assertTrue(int4 == 2, "'" + int4 + "' != '" + 2 + "'");
        Assertions.assertEquals(str9, "Isosceles", "'" + str9 + "' != '" + "Isosceles" + "'");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) 0);
        String str19 = triangleDeterminer.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        String str24 = triangleDeterminer.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        String str29 = triangleDeterminer.getTriangleType((int) (short) 1, 2, 10, 1);
        int int33 = triangleDeterminer.getMatchValue((int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        String str38 = triangleDeterminer.getTriangleType(0, (int) (byte) 100, (int) (short) 0, 1);
        String str43 = triangleDeterminer.getTriangleType((int) (short) -1, 10, 0, 2);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertEquals(str19, "Equilateral", "'" + str19 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str24, "Equilateral", "'" + str24 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str29, "NotATriangle", "'" + str29 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int33 == 2, "'" + int33 + "' != '" + 2 + "'");
        Assertions.assertEquals(str38, "NotATriangle", "'" + str38 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str43, "Equilateral", "'" + str43 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        String str23 = triangleDeterminer.getTriangleType((int) (short) 1, 3, (-1), 100);
        String str28 = triangleDeterminer.getTriangleType(10, (int) ' ', (int) (short) 0, (int) ' ');
        Class<?> wildcardClass29 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 1, "'" + int18 + "' != '" + 1 + "'");
        Assertions.assertEquals(str23, "Isosceles", "'" + str23 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str28, "Equilateral", "'" + str28 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass29);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) 0);
        String str19 = triangleDeterminer.getTriangleType((int) (short) 10, 2, (-1), (int) (byte) 10);
        Class<?> wildcardClass20 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertEquals(str19, "Equilateral", "'" + str19 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer.getMatchValue(1, (int) (short) -1, (int) 'a');
        String str23 = triangleDeterminer.getTriangleType(2, 2, (int) (byte) -1, (int) 'a');
        String str28 = triangleDeterminer.getTriangleType(10, 1, 1, (int) (short) 1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertEquals(str23, "Isosceles", "'" + str23 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str28, "Equilateral", "'" + str28 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer.getMatchValue(100, (int) ' ', (int) '4');
        int int13 = triangleDeterminer.getMatchValue((-1), 2, (int) (short) 1);
        String str18 = triangleDeterminer.getTriangleType((int) (short) 1, 0, 0, (int) (short) 10);
        String str23 = triangleDeterminer.getTriangleType(3, (int) (byte) 100, (int) (short) 1, (int) (byte) 1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertTrue(int13 == 0, "'" + int13 + "' != '" + 0 + "'");
        Assertions.assertEquals(str18, "Isosceles", "'" + str18 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str23, "NotATriangle", "'" + str23 + "' != '" + "NotATriangle" + "'");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType((int) (byte) 100, (-1), (int) (short) 100, (-1));
        String str15 = triangleDeterminer.getTriangleType((int) ' ', (int) (short) 100, (int) (byte) 100, (int) ' ');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue((int) '4', (int) (short) 0, (int) (byte) 100);
        int int23 = triangleDeterminer.getMatchValue((int) ' ', (int) 'a', (int) (byte) 10);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertTrue(int23 == 0, "'" + int23 + "' != '" + 0 + "'");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer.getMatchValue((int) (byte) 1, 100, (int) (byte) 0);
        Class<?> wildcardClass28 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertTrue(int23 == 1, "'" + int23 + "' != '" + 1 + "'");
        Assertions.assertTrue(int27 == 0, "'" + int27 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass28);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer.getMatchValue(1, (int) (short) -1, (int) 'a');
        String str23 = triangleDeterminer.getTriangleType((int) ' ', (int) 'a', 3, 10);
        int int27 = triangleDeterminer.getMatchValue((int) (short) 1, (int) (byte) 0, (int) (byte) -1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertEquals(str23, "Equilateral", "'" + str23 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int27 == 0, "'" + int27 + "' != '" + 0 + "'");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType(100, (int) (short) 10, (int) 'a', (-1));
        String str15 = triangleDeterminer.getTriangleType((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) -1);
        String str20 = triangleDeterminer.getTriangleType((int) (byte) 100, (int) (byte) 0, (int) '4', (-1));
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "Equilateral", "'" + str20 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");

        int int4 = triangleDeterminer.getMatchValue((int) (byte) 100, (int) 'a', 100);
        String str9 = triangleDeterminer.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        Class<?> wildcardClass10 = triangleDeterminer.getClass();
        Assertions.assertTrue(int4 == 2, "'" + int4 + "' != '" + 2 + "'");
        Assertions.assertEquals(str9, "Equilateral", "'" + str9 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) 0);
        String str19 = triangleDeterminer.getTriangleType(10, (int) (short) 0, 10, (int) (byte) 1);
        String str24 = triangleDeterminer.getTriangleType((int) (short) 100, 10, (int) ' ', (int) ' ');
        String str29 = triangleDeterminer.getTriangleType((int) (short) 1, 2, 10, 1);
        int int33 = triangleDeterminer.getMatchValue((int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        Class<?> wildcardClass34 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertEquals(str19, "Equilateral", "'" + str19 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str24, "Equilateral", "'" + str24 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str29, "NotATriangle", "'" + str29 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int33 == 2, "'" + int33 + "' != '" + 2 + "'");
        Assertions.assertNotNull(wildcardClass34);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        String str20 = triangleDeterminer.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        String str25 = triangleDeterminer.getTriangleType(10, (int) (short) 100, 0, 1);
        int int29 = triangleDeterminer.getMatchValue((int) (short) 1, (-1), (int) (byte) -1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "NotATriangle", "'" + str20 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str25, "Equilateral", "'" + str25 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int29 == 3, "'" + int29 + "' != '" + 3 + "'");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer.getMatchValue((int) (byte) -1, (int) '#', 2);
        int int13 = triangleDeterminer.getMatchValue(10, (int) (byte) -1, (int) (short) -1);
        String str18 = triangleDeterminer.getTriangleType(100, 3, (int) (byte) 0, (int) (byte) 100);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertTrue(int13 == 3, "'" + int13 + "' != '" + 3 + "'");
        Assertions.assertEquals(str18, "Equilateral", "'" + str18 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue((int) '4', (int) (short) 0, (int) (byte) 100);
        String str24 = triangleDeterminer.getTriangleType((int) (byte) 10, (int) (byte) 1, 1, 1);
        Class<?> wildcardClass25 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertEquals(str24, "Equilateral", "'" + str24 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass25);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        String str20 = triangleDeterminer.getTriangleType((int) (short) 0, (-1), (-1), (int) (byte) 10);
        String str25 = triangleDeterminer.getTriangleType(10, 0, (int) (byte) 10, (int) (byte) 100);
        String str30 = triangleDeterminer.getTriangleType((int) (short) 0, (-1), 0, 1);
        String str35 = triangleDeterminer.getTriangleType((int) (short) 100, (int) (short) 10, (int) (short) 1, (int) (byte) 10);
        int int39 = triangleDeterminer.getMatchValue(0, (int) (short) 100, (int) (byte) 1);
        Class<?> wildcardClass40 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "NotATriangle", "'" + str20 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str25, "Equilateral", "'" + str25 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str30, "NotATriangle", "'" + str30 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str35, "Equilateral", "'" + str35 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int39 == 0, "'" + int39 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass40);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        int int9 = triangleDeterminer.getMatchValue((int) (byte) 0, (int) (byte) 100, 1);
        Class<?> wildcardClass10 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer.getMatchValue(1, (int) (short) -1, (int) 'a');
        String str23 = triangleDeterminer.getTriangleType((-1), 3, (int) (short) 100, (int) (byte) 10);
        String str28 = triangleDeterminer.getTriangleType(0, (int) (short) 100, (int) ' ', (int) (short) 100);
        int int32 = triangleDeterminer.getMatchValue(2, (int) '#', (int) 'a');
        int int36 = triangleDeterminer.getMatchValue((int) (short) 1, (int) '4', (int) 'a');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertEquals(str23, "Equilateral", "'" + str23 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str28, "Scalene", "'" + str28 + "' != '" + "Scalene" + "'");
        Assertions.assertTrue(int32 == 0, "'" + int32 + "' != '" + 0 + "'");
        Assertions.assertTrue(int36 == 0, "'" + int36 + "' != '" + 0 + "'");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer.getMatchValue((int) 'a', (int) (byte) 100, (int) (byte) 0);
        int int31 = triangleDeterminer.getMatchValue((int) '4', (int) (byte) -1, (int) ' ');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertTrue(int23 == 1, "'" + int23 + "' != '" + 1 + "'");
        Assertions.assertTrue(int27 == 0, "'" + int27 + "' != '" + 0 + "'");
        Assertions.assertTrue(int31 == 0, "'" + int31 + "' != '" + 0 + "'");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        String str20 = triangleDeterminer.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        String str25 = triangleDeterminer.getTriangleType((int) (byte) -1, (int) (short) 0, (int) (byte) 1, (int) ' ');
        String str30 = triangleDeterminer.getTriangleType((int) (short) 10, (int) (byte) 10, (int) (byte) 10, (int) '4');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "NotATriangle", "'" + str20 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str25, "Equilateral", "'" + str25 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str30, "Equilateral", "'" + str30 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (short) 1, (int) (short) 100, (int) (byte) 10);
        String str23 = triangleDeterminer.getTriangleType((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 1);
        Class<?> wildcardClass24 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertEquals(str23, "Isosceles", "'" + str23 + "' != '" + "Isosceles" + "'");
        Assertions.assertNotNull(wildcardClass24);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        String str27 = triangleDeterminer.getTriangleType(10, 100, (int) (byte) 0, (int) (byte) 10);
        int int31 = triangleDeterminer.getMatchValue(3, (int) '#', (int) ' ');
        int int35 = triangleDeterminer.getMatchValue((int) (short) 10, (int) (short) 0, (int) (byte) 0);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 1, "'" + int18 + "' != '" + 1 + "'");
        Assertions.assertTrue(int22 == 0, "'" + int22 + "' != '" + 0 + "'");
        Assertions.assertEquals(str27, "Equilateral", "'" + str27 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int31 == 0, "'" + int31 + "' != '" + 0 + "'");
        Assertions.assertTrue(int35 == 3, "'" + int35 + "' != '" + 3 + "'");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        String str24 = triangleDeterminer.getTriangleType(10, (int) (byte) 0, (int) (short) 0, (int) '#');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertEquals(str24, "Equilateral", "'" + str24 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        int int19 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) ' ', 0);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        int int19 = triangleDeterminer.getMatchValue(1, (int) (byte) 10, (int) (byte) -1);
        int int23 = triangleDeterminer.getMatchValue(0, 0, (int) (short) 1);
        int int27 = triangleDeterminer.getMatchValue((int) ' ', 2, (int) (byte) 1);
        String str32 = triangleDeterminer.getTriangleType(3, (int) (short) 1, (int) (short) 1, 0);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertTrue(int23 == 1, "'" + int23 + "' != '" + 1 + "'");
        Assertions.assertTrue(int27 == 0, "'" + int27 + "' != '" + 0 + "'");
        Assertions.assertEquals(str32, "NotATriangle", "'" + str32 + "' != '" + "NotATriangle" + "'");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType((int) (short) 0, 100, (int) (short) 100, (int) (byte) -1);
        Class<?> wildcardClass11 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertNotNull(wildcardClass11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");

        String str5 = triangleDeterminer.getTriangleType((int) 'a', (int) (short) 1, 0, (int) 'a');
        String str10 = triangleDeterminer.getTriangleType((int) (byte) 100, 3, (int) (short) 100, (int) (byte) 10);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 3, (int) (short) 0);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer.getMatchValue(1, (int) (short) -1, (int) 'a');
        String str23 = triangleDeterminer.getTriangleType((-1), 3, (int) (short) 100, (int) (byte) 10);
        String str28 = triangleDeterminer.getTriangleType(0, (int) (short) 100, (int) ' ', (int) (short) 100);
        Class<?> wildcardClass29 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertEquals(str23, "Equilateral", "'" + str23 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str28, "Scalene", "'" + str28 + "' != '" + "Scalene" + "'");
        Assertions.assertNotNull(wildcardClass29);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType(1, 2, 100, (int) (short) 10);
        int int19 = triangleDeterminer.getMatchValue((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        int int23 = triangleDeterminer.getMatchValue((-1), (int) '#', (int) '#');
        String str28 = triangleDeterminer.getTriangleType((int) (short) 10, (int) (short) 0, 100, 3);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "NotATriangle", "'" + str15 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertTrue(int23 == 3, "'" + int23 + "' != '" + 3 + "'");
        Assertions.assertEquals(str28, "Equilateral", "'" + str28 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        String str23 = triangleDeterminer.getTriangleType((int) (short) 1, 3, (-1), 100);
        String str28 = triangleDeterminer.getTriangleType(0, (int) (short) 10, (int) ' ', (int) (byte) 0);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 1, "'" + int18 + "' != '" + 1 + "'");
        Assertions.assertEquals(str23, "Isosceles", "'" + str23 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str28, "NotATriangle", "'" + str28 + "' != '" + "NotATriangle" + "'");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        int int9 = triangleDeterminer.getMatchValue((int) (byte) -1, (int) '#', 2);
        int int13 = triangleDeterminer.getMatchValue(10, (int) (byte) -1, (int) (short) -1);
        String str18 = triangleDeterminer.getTriangleType(3, (int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertTrue(int13 == 3, "'" + int13 + "' != '" + 3 + "'");
        Assertions.assertEquals(str18, "Isosceles", "'" + str18 + "' != '" + "Isosceles" + "'");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");

        int int4 = triangleDeterminer.getMatchValue((int) (byte) 100, (int) 'a', 100);
        String str9 = triangleDeterminer.getTriangleType((int) ' ', (-1), (int) (byte) 0, 0);
        String str14 = triangleDeterminer.getTriangleType((int) (byte) 0, (int) (short) 1, (int) (byte) 1, 1);
        int int18 = triangleDeterminer.getMatchValue((int) 'a', (int) (byte) 0, (int) (short) -1);
        Assertions.assertTrue(int4 == 2, "'" + int4 + "' != '" + 2 + "'");
        Assertions.assertEquals(str9, "Equilateral", "'" + str9 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str14, "Scalene", "'" + str14 + "' != '" + "Scalene" + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        int int19 = triangleDeterminer.getMatchValue((-1), (int) (byte) 1, (int) (byte) -1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int19 == 2, "'" + int19 + "' != '" + 2 + "'");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        String str20 = triangleDeterminer.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        int int24 = triangleDeterminer.getMatchValue((int) (short) 10, 0, 0);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "NotATriangle", "'" + str20 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int24 == 3, "'" + int24 + "' != '" + 3 + "'");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        String str27 = triangleDeterminer.getTriangleType((int) (short) -1, (int) (byte) -1, 100, (int) (byte) 100);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 1, "'" + int18 + "' != '" + 1 + "'");
        Assertions.assertTrue(int22 == 0, "'" + int22 + "' != '" + 0 + "'");
        Assertions.assertEquals(str27, "Equilateral", "'" + str27 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType((int) (short) 0, 100, (int) (short) 100, (int) (byte) -1);
        String str15 = triangleDeterminer.getTriangleType((int) (short) 1, (int) '4', (int) 'a', (int) (byte) -1);
        int int19 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) -1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str15, "NotATriangle", "'" + str15 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer.getMatchValue(1, (int) (short) -1, (int) 'a');
        String str23 = triangleDeterminer.getTriangleType((-1), 3, (int) (short) 100, (int) (byte) 10);
        int int27 = triangleDeterminer.getMatchValue((int) (byte) 1, 3, (int) ' ');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertEquals(str23, "Equilateral", "'" + str23 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int27 == 0, "'" + int27 + "' != '" + 0 + "'");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");

        String str5 = triangleDeterminer.getTriangleType((-1), (int) (byte) -1, 0, (int) 'a');
        Class<?> wildcardClass6 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertNotNull(wildcardClass6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");

        int int4 = triangleDeterminer.getMatchValue(100, (-1), (int) '4');
        Assertions.assertTrue(int4 == 0, "'" + int4 + "' != '" + 0 + "'");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType(1, 2, 100, (int) (short) 10);
        int int19 = triangleDeterminer.getMatchValue((int) (byte) 10, (int) (byte) 0, (int) (byte) 1);
        int int23 = triangleDeterminer.getMatchValue((int) (byte) 10, (int) (short) 100, 100);
        Class<?> wildcardClass24 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "NotATriangle", "'" + str15 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int19 == 0, "'" + int19 + "' != '" + 0 + "'");
        Assertions.assertTrue(int23 == 3, "'" + int23 + "' != '" + 3 + "'");
        Assertions.assertNotNull(wildcardClass24);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        String str27 = triangleDeterminer.getTriangleType(2, (int) (byte) 1, (int) (byte) 1, (int) (short) -1);
        String str32 = triangleDeterminer.getTriangleType((int) (byte) 1, (int) (byte) 1, (int) (byte) 100, (int) '4');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 1, "'" + int18 + "' != '" + 1 + "'");
        Assertions.assertTrue(int22 == 0, "'" + int22 + "' != '" + 0 + "'");
        Assertions.assertEquals(str27, "NotATriangle", "'" + str27 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str32, "NotATriangle", "'" + str32 + "' != '" + "NotATriangle" + "'");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, (int) (byte) 1, (int) ' ', (int) ' ');
        String str20 = triangleDeterminer.getTriangleType((int) (short) 0, (-1), (-1), (int) (byte) 10);
        Class<?> wildcardClass21 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "NotATriangle", "'" + str20 + "' != '" + "NotATriangle" + "'");
        Assertions.assertNotNull(wildcardClass21);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(0, 0, (int) '4', 2);
        int int14 = triangleDeterminer.getMatchValue((int) ' ', 0, (int) (byte) 0);
        String str19 = triangleDeterminer.getTriangleType(1, 100, 2, (int) ' ');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "NotATriangle", "'" + str10 + "' != '" + "NotATriangle" + "'");
        Assertions.assertTrue(int14 == 3, "'" + int14 + "' != '" + 3 + "'");
        Assertions.assertEquals(str19, "Isosceles", "'" + str19 + "' != '" + "Isosceles" + "'");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        int int22 = triangleDeterminer.getMatchValue((int) (short) -1, (int) (byte) 1, (int) (short) 0);
        String str27 = triangleDeterminer.getTriangleType(10, 100, (int) (byte) 0, (int) (byte) 10);
        int int31 = triangleDeterminer.getMatchValue(0, (int) '#', 1);
        String str36 = triangleDeterminer.getTriangleType(1, (int) (byte) 100, (int) (byte) 0, (int) '#');
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 1, "'" + int18 + "' != '" + 1 + "'");
        Assertions.assertTrue(int22 == 0, "'" + int22 + "' != '" + 0 + "'");
        Assertions.assertEquals(str27, "Equilateral", "'" + str27 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int31 == 0, "'" + int31 + "' != '" + 0 + "'");
        Assertions.assertEquals(str36, "Isosceles", "'" + str36 + "' != '" + "Isosceles" + "'");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");

        String str5 = triangleDeterminer.getTriangleType((int) ' ', (int) '#', 2, (int) (short) 10);
        String str10 = triangleDeterminer.getTriangleType(10, (int) (byte) 1, 100, (int) (byte) 1);
        int int14 = triangleDeterminer.getMatchValue(10, (int) ' ', (int) (byte) 1);
        int int18 = triangleDeterminer.getMatchValue(1, (int) (short) -1, (int) 'a');
        String str23 = triangleDeterminer.getTriangleType(2, 2, (int) (byte) -1, (int) 'a');
        Class<?> wildcardClass24 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Equilateral", "'" + str10 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertEquals(str23, "Isosceles", "'" + str23 + "' != '" + "Isosceles" + "'");
        Assertions.assertNotNull(wildcardClass24);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        String str15 = triangleDeterminer.getTriangleType((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100);
        String str20 = triangleDeterminer.getTriangleType(2, 0, (int) (byte) 1, (int) (byte) 0);
        String str25 = triangleDeterminer.getTriangleType((int) (byte) -1, (int) (short) 0, (int) (byte) 1, (int) ' ');
        int int29 = triangleDeterminer.getMatchValue((-1), (int) (byte) 0, 3);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertEquals(str15, "Equilateral", "'" + str15 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str20, "NotATriangle", "'" + str20 + "' != '" + "NotATriangle" + "'");
        Assertions.assertEquals(str25, "Equilateral", "'" + str25 + "' != '" + "Equilateral" + "'");
        Assertions.assertTrue(int29 == 0, "'" + int29 + "' != '" + 0 + "'");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (short) 1, (int) (short) 100, (int) (byte) 10);
        String str23 = triangleDeterminer.getTriangleType((int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 0, "'" + int18 + "' != '" + 0 + "'");
        Assertions.assertEquals(str23, "Equilateral", "'" + str23 + "' != '" + "Equilateral" + "'");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue(2, 100, (int) (short) 1);
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");

        String str5 = triangleDeterminer.getTriangleType((int) '#', (int) (byte) 10, (int) (short) 0, 0);
        String str10 = triangleDeterminer.getTriangleType(1, 1, 0, 0);
        int int14 = triangleDeterminer.getMatchValue((int) '#', 100, 0);
        int int18 = triangleDeterminer.getMatchValue((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
        String str23 = triangleDeterminer.getTriangleType((int) (short) 1, 3, (-1), 100);
        int int27 = triangleDeterminer.getMatchValue((int) 'a', (int) (short) -1, (int) (short) 1);
        Class<?> wildcardClass28 = triangleDeterminer.getClass();
        Assertions.assertEquals(str5, "Equilateral", "'" + str5 + "' != '" + "Equilateral" + "'");
        Assertions.assertEquals(str10, "Isosceles", "'" + str10 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
        Assertions.assertTrue(int18 == 1, "'" + int18 + "' != '" + 1 + "'");
        Assertions.assertEquals(str23, "Isosceles", "'" + str23 + "' != '" + "Isosceles" + "'");
        Assertions.assertTrue(int27 == 0, "'" + int27 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass28);
    }
}

