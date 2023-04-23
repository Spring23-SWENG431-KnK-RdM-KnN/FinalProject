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
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.sumStocks(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        double double1 = monthSales0.getSales();
        java.lang.Class<?> wildcardClass2 = monthSales0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.reset();
        java.lang.Class<?> wildcardClass2 = monthSales0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        double double1 = monthSales0.getSales();
        double double2 = monthSales0.getSales();
        monthSales0.sumStocks((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.setSales((double) (byte) 10);
        monthSales0.setSales((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.calcSales();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        monthSales0.calcSales();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.calcSales();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.setSales((double) 10L);
        monthSales0.calcSales();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.sumLocks((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.reset();
        monthSales0.calcCommission();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumLocks(100);
        int int8 = monthSales0.getLocksSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        double double3 = monthSales0.getCommission();
        monthSales0.calcSales();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.sumStocks((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) 1);
        int int5 = monthSales0.getStocksSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.reset();
        java.lang.Class<?> wildcardClass7 = monthSales0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumLocks(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.setSales((double) 10L);
        double double10 = monthSales0.getCommission();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) (byte) -1);
        monthSales0.sumStocks((int) (short) 100);
        monthSales0.sumStocks((int) '4');
        int int9 = monthSales0.getLocksSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        double double4 = monthSales0.getCommission();
        monthSales0.sumStocks(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        double double4 = monthSales0.getCommission();
        monthSales0.sumBarrels((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        int int6 = monthSales0.getBarrelsSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) (byte) -1);
        double double5 = monthSales0.getCommission();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.calcCommission();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.calcCommission();
        monthSales0.calcCommission();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.calcCommission();
        monthSales0.calcSales();
        double double3 = monthSales0.getCommission();
        int int4 = monthSales0.getStocksSold();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumLocks(100);
        monthSales0.sumBarrels((int) (byte) -1);
        double double10 = monthSales0.getSales();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.sumStocks(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.setSales((double) 100L);
        int int8 = monthSales0.getStocksSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.calcCommission();
        monthSales0.calcSales();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        double double10 = monthSales0.getSales();
        int int11 = monthSales0.getLocksSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.sumBarrels((int) (byte) 1);
        double double7 = monthSales0.getSales();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4500.0d + "'", double7 == 4500.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.reset();
        monthSales0.setSales((double) (byte) 1);
        monthSales0.sumStocks(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) 1);
        monthSales0.sumBarrels((int) (byte) 1);
        double double7 = monthSales0.getCommission();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.sumBarrels((-1));
        monthSales0.reset();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.calcSales();
        double double7 = monthSales0.getCommission();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) 1);
        monthSales0.sumBarrels((int) (byte) 1);
        monthSales0.setSales((double) 200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.sumBarrels((int) (byte) 1);
        monthSales0.setSales((double) (short) 10);
        monthSales0.calcCommission();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        monthSales0.calcSales();
        monthSales0.sumLocks((int) (short) 10);
        monthSales0.reset();
        monthSales0.setSales((double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = monthSales0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        monthSales0.calcCommission();
        monthSales0.calcSales();
        double double3 = monthSales0.getCommission();
        int int4 = monthSales0.getBarrelsSold();
        java.lang.Class<?> wildcardClass5 = monthSales0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getBarrelsSold();
        monthSales0.reset();
        double double3 = monthSales0.getCommission();
        monthSales0.sumBarrels((int) (byte) 100);
        int int6 = monthSales0.getBarrelsSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.setSales((double) 0.0f);
        int int7 = monthSales0.getLocksSold();
        monthSales0.reset();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumStocks(10);
        monthSales0.setSales((double) 'a');
        monthSales0.reset();
        monthSales0.calcCommission();
        int int8 = monthSales0.getStocksSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.calcCommission();
        int int9 = monthSales0.getLocksSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        int int2 = monthSales0.getStocksSold();
        monthSales0.setSales((double) (byte) -1);
        monthSales0.sumStocks((int) (short) 100);
        monthSales0.sumStocks((int) '4');
        monthSales0.sumStocks((int) (byte) 10);
        int int11 = monthSales0.getBarrelsSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        double double1 = monthSales0.getSales();
        double double2 = monthSales0.getSales();
        double double3 = monthSales0.getSales();
        monthSales0.reset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        double double10 = monthSales0.getSales();
        int int11 = monthSales0.getBarrelsSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        monthSales0.calcSales();
        monthSales0.sumBarrels((int) (byte) 1);
        monthSales0.setSales((double) (short) 10);
        int int9 = monthSales0.getBarrelsSold();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.example.MonthSales monthSales0 = new org.example.MonthSales();
        int int1 = monthSales0.getLocksSold();
        monthSales0.sumLocks((int) (short) 100);
        double double4 = monthSales0.getSales();
        int int5 = monthSales0.getLocksSold();
        monthSales0.sumBarrels((int) (short) 1);
        monthSales0.sumBarrels((int) (short) 0);
        monthSales0.sumLocks(200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }
}

