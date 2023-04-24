import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegressionTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        double double1 = monthSales0.getSales();
        java.lang.Class<?> wildcardClass2 = monthSales0.getClass();
        Assertions.assertTrue(double1 == 0.0d, "'" + double1 + "' != '" + 0.0d + "'");
        Assertions.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.reset();
        java.lang.Class<?> wildcardClass2 = monthSales0.getClass();
        Assertions.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.setSales((double) 10L);
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.sumLocks((int) (byte) 1);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.reset();
        monthSales0.calcCommission();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumLocks(100);
        int int8 = monthSales0.getLocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(int8 == 200, "'" + int8 + "' != '" + 200 + "'");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        double double3 = monthSales0.getCommission();
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.reset();
        java.lang.Class<?> wildcardClass7 = monthSales0.getClass();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        int int6 = monthSales0.getBarrelsSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int6 == 0, "'" + int6 + "' != '" + 0 + "'");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.calcCommission();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.sumStocks(0);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.setSales((double) 100L);
        int int8 = monthSales0.getStocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int8 == 10, "'" + int8 + "' != '" + 10 + "'");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.calcCommission();
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        double double10 = monthSales0.getSales();
        int int11 = monthSales0.getLocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(double10 == 0.0d, "'" + double10 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int11 == 100, "'" + int11 + "' != '" + 100 + "'");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.sumBarrels((int) (byte) 1);
        double double7 = monthSales0.getSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double7 == 4500.0d, "'" + double7 + "' != '" + 4500.0d + "'");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.reset();
        monthSales0.setSales((double) (byte) 1);
        monthSales0.sumStocks(100);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) 1);
        monthSales0.sumBarrels((int) (byte) 1);
        monthSales0.setSales((double) 200);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.reset();
        monthSales0.setSales((double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = monthSales0.getClass();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.calcCommission();
        monthSales0.calcSales();
        double double3 = monthSales0.getCommission();
        int int4 = monthSales0.getBarrelsSold();
        java.lang.Class<?> wildcardClass5 = monthSales0.getClass();
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int4 == 0, "'" + int4 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.reset();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.reset();
        monthSales0.calcCommission();
        int int8 = monthSales0.getStocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int8 == 0, "'" + int8 + "' != '" + 0 + "'");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) (byte) -1);
        monthSales0.sumStocks((int) (short) 100);
        monthSales0.sumStocks((int) '4');
        monthSales0.sumStocks((int) (byte) 10);
        int int11 = monthSales0.getBarrelsSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        Assertions.assertTrue(int11 == 0, "'" + int11 + "' != '" + 0 + "'");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.sumBarrels((int) (byte) 1);
        monthSales0.setSales((double) (short) 10);
        int int9 = monthSales0.getBarrelsSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int9 == 1, "'" + int9 + "' != '" + 1 + "'");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.calcCommission();
        monthSales0.calcCommission();
        double double10 = monthSales0.getSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(double10 == 0.0d, "'" + double10 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.setSales((double) 10L);
        double double10 = monthSales0.getCommission();
        monthSales0.sumBarrels(100);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
        Assertions.assertTrue(double10 == 0.0d, "'" + double10 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.calcCommission();
        monthSales0.calcSales();
        int int3 = monthSales0.getBarrelsSold();
        Assertions.assertTrue(int3 == 0, "'" + int3 + "' != '" + 0 + "'");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.reset();
        monthSales0.calcCommission();
        monthSales0.setSales((double) 0L);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.sumBarrels((int) (byte) 1);
        monthSales0.setSales((double) (short) 10);
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = monthSales0.getClass();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertNotNull(wildcardClass10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.sumBarrels((-1));
        int int8 = monthSales0.getStocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int8 == 10, "'" + int8 + "' != '" + 10 + "'");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumLocks(100);
        monthSales0.sumBarrels((int) (byte) -1);
        double double10 = monthSales0.getSales();
        monthSales0.calcCommission();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(double10 == 0.0d, "'" + double10 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.calcSales();
        monthSales0.reset();
        monthSales0.setSales(97.0d);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        int int8 = monthSales0.getBarrelsSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(int8 == 1, "'" + int8 + "' != '" + 1 + "'");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.sumBarrels((int) (short) 10);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.sumBarrels((-1));
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.setSales((double) (byte) 10);
        monthSales0.setSales((double) (byte) 1);
        monthSales0.sumStocks(0);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        double double3 = monthSales0.getCommission();
        monthSales0.sumBarrels((int) (byte) 100);
        int int6 = monthSales0.getBarrelsSold();
        monthSales0.sumStocks((int) '#');
        monthSales0.sumStocks(0);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int6 == 100, "'" + int6 + "' != '" + 100 + "'");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.calcCommission();
        int int9 = monthSales0.getLocksSold();
        int int10 = monthSales0.getLocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(int9 == 100, "'" + int9 + "' != '" + 100 + "'");
        Assertions.assertTrue(int10 == 100, "'" + int10 + "' != '" + 100 + "'");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        double double2 = monthSales0.getCommission();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double2 == 0.0d, "'" + double2 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.calcSales();
        monthSales0.reset();
        java.lang.Class<?> wildcardClass8 = monthSales0.getClass();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.calcCommission();
        monthSales0.calcSales();
        double double3 = monthSales0.getCommission();
        int int4 = monthSales0.getBarrelsSold();
        int int5 = monthSales0.getStocksSold();
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int4 == 0, "'" + int4 + "' != '" + 0 + "'");
        Assertions.assertTrue(int5 == 0, "'" + int5 + "' != '" + 0 + "'");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.sumLocks((int) (byte) 10);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) (byte) -1);
        monthSales0.sumBarrels((int) (byte) 100);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        double double3 = monthSales0.getCommission();
        monthSales0.sumBarrels((int) (byte) 100);
        int int6 = monthSales0.getBarrelsSold();
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int6 == 100, "'" + int6 + "' != '" + 100 + "'");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        monthSales0.calcSales();
        double double11 = monthSales0.getCommission();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(double11 == 0.0d, "'" + double11 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) (byte) -1);
        monthSales0.sumStocks((int) (short) 100);
        monthSales0.sumStocks((int) '4');
        monthSales0.sumStocks((int) (byte) 10);
        monthSales0.sumStocks(0);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        double double10 = monthSales0.getSales();
        int int11 = monthSales0.getBarrelsSold();
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(double10 == 0.0d, "'" + double10 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int11 == 1, "'" + int11 + "' != '" + 1 + "'");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumLocks(100);
        monthSales0.sumBarrels((int) (byte) -1);
        int int10 = monthSales0.getLocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(int10 == 200, "'" + int10 + "' != '" + 200 + "'");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        double double3 = monthSales0.getCommission();
        monthSales0.sumBarrels((int) (byte) 100);
        int int6 = monthSales0.getBarrelsSold();
        monthSales0.setSales(1.0d);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int6 == 100, "'" + int6 + "' != '" + 100 + "'");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        double double8 = monthSales0.getSales();
        int int9 = monthSales0.getBarrelsSold();
        monthSales0.calcSales();
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
        Assertions.assertTrue(double8 == 0.0d, "'" + double8 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.sumStocks(1);
        monthSales0.sumLocks((int) ' ');
        monthSales0.sumBarrels((int) (byte) 100);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        double double1 = monthSales0.getSales();
        monthSales0.reset();
        Assertions.assertTrue(double1 == 0.0d, "'" + double1 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.reset();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.reset();
        double double7 = monthSales0.getSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double7 == 97.0d, "'" + double7 + "' != '" + 97.0d + "'");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        double double6 = monthSales0.getSales();
        monthSales0.calcCommission();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double6 == 97.0d, "'" + double6 + "' != '" + 97.0d + "'");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = monthSales0.getClass();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) 1);
        int int5 = monthSales0.getStocksSold();
        int int6 = monthSales0.getStocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        Assertions.assertTrue(int5 == 0, "'" + int5 + "' != '" + 0 + "'");
        Assertions.assertTrue(int6 == 0, "'" + int6 + "' != '" + 0 + "'");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.calcCommission();
        monthSales0.calcSales();
        monthSales0.sumStocks((int) (byte) 100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        monthSales0.sumLocks(200);
        int int12 = monthSales0.getBarrelsSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(int12 == 1, "'" + int12 + "' != '" + 1 + "'");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.calcCommission();
        java.lang.Class<?> wildcardClass2 = monthSales0.getClass();
        Assertions.assertNotNull(wildcardClass2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        int int6 = monthSales0.getBarrelsSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int6 == 0, "'" + int6 + "' != '" + 0 + "'");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        monthSales0.calcSales();
        monthSales0.sumLocks(200);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        double double6 = monthSales0.getSales();
        monthSales0.setSales((double) 10);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double6 == 97.0d, "'" + double6 + "' != '" + 97.0d + "'");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.setSales((double) 10L);
        int int10 = monthSales0.getStocksSold();
        monthSales0.calcCommission();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
        Assertions.assertTrue(int10 == 0, "'" + int10 + "' != '" + 0 + "'");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) (byte) -1);
        double double5 = monthSales0.getCommission();
        int int6 = monthSales0.getLocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        Assertions.assertTrue(double5 == 0.0d, "'" + double5 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int6 == 0, "'" + int6 + "' != '" + 0 + "'");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        double double1 = monthSales0.getSales();
        double double2 = monthSales0.getSales();
        monthSales0.sumStocks((int) (short) 0);
        monthSales0.setSales(4500.0d);
        monthSales0.sumBarrels((int) (short) -1);
        Assertions.assertTrue(double1 == 0.0d, "'" + double1 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(double2 == 0.0d, "'" + double2 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        double double4 = monthSales0.getCommission();
        monthSales0.sumBarrels((int) (short) 0);
        int int7 = monthSales0.getLocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int7 == 0, "'" + int7 + "' != '" + 0 + "'");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        double double1 = monthSales0.getSales();
        double double2 = monthSales0.getSales();
        double double3 = monthSales0.getSales();
        monthSales0.reset();
        monthSales0.calcCommission();
        Assertions.assertTrue(double1 == 0.0d, "'" + double1 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(double2 == 0.0d, "'" + double2 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        double double4 = monthSales0.getCommission();
        monthSales0.sumBarrels((int) (short) 0);
        monthSales0.setSales((double) 100L);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        double double4 = monthSales0.getCommission();
        monthSales0.calcCommission();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.calcSales();
        double double7 = monthSales0.getCommission();
        monthSales0.setSales(97.0d);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
        Assertions.assertTrue(double7 == 0.0d, "'" + double7 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        double double1 = monthSales0.getSales();
        double double2 = monthSales0.getSales();
        double double3 = monthSales0.getSales();
        monthSales0.reset();
        monthSales0.calcSales();
        Assertions.assertTrue(double1 == 0.0d, "'" + double1 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(double2 == 0.0d, "'" + double2 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.reset();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        double double3 = monthSales0.getSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.calcCommission();
        monthSales0.calcSales();
        double double3 = monthSales0.getCommission();
        int int4 = monthSales0.getBarrelsSold();
        int int5 = monthSales0.getBarrelsSold();
        monthSales0.setSales(97.0d);
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int4 == 0, "'" + int4 + "' != '" + 0 + "'");
        Assertions.assertTrue(int5 == 0, "'" + int5 + "' != '" + 0 + "'");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.sumBarrels((-1));
        monthSales0.reset();
        monthSales0.calcCommission();
        monthSales0.setSales((double) 0);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        java.lang.Class<?> wildcardClass4 = monthSales0.getClass();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.sumStocks(1);
        int int5 = monthSales0.getLocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int5 == 0, "'" + int5 + "' != '" + 0 + "'");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumLocks(10);
        monthSales0.sumBarrels(100);
        monthSales0.sumLocks(200);
        monthSales0.reset();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        double double4 = monthSales0.getCommission();
        monthSales0.sumStocks(10);
        int int7 = monthSales0.getStocksSold();
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int7 == 10, "'" + int7 + "' != '" + 10 + "'");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) 1);
        monthSales0.sumBarrels((int) (byte) 1);
        double double7 = monthSales0.getCommission();
        monthSales0.sumLocks(1);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        Assertions.assertTrue(double7 == 0.0d, "'" + double7 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.setSales((double) 10L);
        int int10 = monthSales0.getStocksSold();
        java.lang.Class<?> wildcardClass11 = monthSales0.getClass();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
        Assertions.assertTrue(int10 == 0, "'" + int10 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) (byte) -1);
        int int5 = monthSales0.getLocksSold();
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        Assertions.assertTrue(int5 == 0, "'" + int5 + "' != '" + 0 + "'");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        double double8 = monthSales0.getSales();
        int int9 = monthSales0.getBarrelsSold();
        int int10 = monthSales0.getBarrelsSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
        Assertions.assertTrue(double8 == 0.0d, "'" + double8 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertTrue(int10 == 0, "'" + int10 + "' != '" + 0 + "'");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) 1);
        monthSales0.sumBarrels((int) (byte) 1);
        double double7 = monthSales0.getCommission();
        int int8 = monthSales0.getStocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        Assertions.assertTrue(double7 == 0.0d, "'" + double7 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int8 == 0, "'" + int8 + "' != '" + 0 + "'");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        int int3 = monthSales0.getLocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int3 == 0, "'" + int3 + "' != '" + 0 + "'");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.reset();
        double double2 = monthSales0.getSales();
        Assertions.assertTrue(double2 == 0.0d, "'" + double2 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        double double2 = monthSales0.getSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double2 == 0.0d, "'" + double2 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.sumStocks(1);
        monthSales0.reset();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        monthSales0.sumLocks(200);
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 100, "'" + int5 + "' != '" + 100 + "'");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        int int8 = monthSales0.getLocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
        Assertions.assertTrue(int8 == 100, "'" + int8 + "' != '" + 100 + "'");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        double double8 = monthSales0.getSales();
        monthSales0.reset();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
        Assertions.assertTrue(double8 == 0.0d, "'" + double8 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.sumBarrels((int) (byte) 1);
        monthSales0.setSales((double) (short) 10);
        monthSales0.sumStocks((int) (short) 1);
        monthSales0.calcSales();
        java.lang.Class<?> wildcardClass12 = monthSales0.getClass();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertNotNull(wildcardClass12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.sumStocks((int) '4');
        monthSales0.calcSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) (byte) -1);
        monthSales0.sumStocks((int) (short) 100);
        monthSales0.sumStocks((int) '4');
        int int9 = monthSales0.getLocksSold();
        monthSales0.sumBarrels(200);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.sumBarrels((int) (byte) 1);
        monthSales0.setSales((double) (short) 10);
        monthSales0.calcCommission();
        monthSales0.sumStocks(0);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.calcCommission();
        int int11 = monthSales0.getLocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
        Assertions.assertTrue(int11 == 110, "'" + int11 + "' != '" + 110 + "'");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        double double8 = monthSales0.getSales();
        int int9 = monthSales0.getBarrelsSold();
        double double10 = monthSales0.getSales();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(int7 == 100, "'" + int7 + "' != '" + 100 + "'");
        Assertions.assertTrue(double8 == 0.0d, "'" + double8 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        Assertions.assertTrue(double10 == 0.0d, "'" + double10 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        double double4 = monthSales0.getCommission();
        int int5 = monthSales0.getStocksSold();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double4 == 0.0d, "'" + double4 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int5 == 0, "'" + int5 + "' != '" + 0 + "'");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.reset();
        monthSales0.setSales((double) 100L);
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        double double3 = monthSales0.getCommission();
        monthSales0.sumBarrels((int) (byte) 100);
        monthSales0.setSales((double) 200);
        double double8 = monthSales0.getCommission();
        Assertions.assertTrue(int1 == 0, "'" + int1 + "' != '" + 0 + "'");
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(double8 == 0.0d, "'" + double8 + "' != '" + 0.0d + "'");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        double double1 = monthSales0.getSales();
        double double2 = monthSales0.getSales();
        monthSales0.sumStocks((int) (short) 0);
        monthSales0.setSales(0.0d);
        int int7 = monthSales0.getStocksSold();
        Assertions.assertTrue(double1 == 0.0d, "'" + double1 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(double2 == 0.0d, "'" + double2 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int7 == 0, "'" + int7 + "' != '" + 0 + "'");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.calcCommission();
        monthSales0.calcSales();
        double double3 = monthSales0.getCommission();
        int int4 = monthSales0.getStocksSold();
        double double5 = monthSales0.getSales();
        Assertions.assertTrue(double3 == 0.0d, "'" + double3 + "' != '" + 0.0d + "'");
        Assertions.assertTrue(int4 == 0, "'" + int4 + "' != '" + 0 + "'");
        Assertions.assertTrue(double5 == 0.0d, "'" + double5 + "' != '" + 0.0d + "'");
    }
}

