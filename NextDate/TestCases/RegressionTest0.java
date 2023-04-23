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
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (short) -1, (int) (byte) 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str4, "Tomorrow's date is -1 00 1\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, 0, (int) 'a');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass6 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str4, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str5, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', 1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (int) (short) 100, 100);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 100 00 100\n" + "'", str4, "Tomorrow's date is 100 00 100\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((-1), (int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((-1), (int) ' ', (int) (byte) 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 32 00 10\n" + "'", str4, "Tomorrow's date is 32 00 10\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass6 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str4, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str5, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, 0, (int) ' ');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 100, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, 0, (int) 'a');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass7 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str4, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str5, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str6, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(10, (int) '4', (int) '#');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 52 00 35\n" + "'", str4, "Tomorrow's date is 52 00 35\n");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(100, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 100, 0, (int) (short) 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 10\n" + "'", str4, "Tomorrow's date is 00 00 10\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (short) -1, (int) (byte) 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str4, "Tomorrow's date is -1 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str5, "Tomorrow's date is -1 00 1\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str6, "Tomorrow's date is -1 00 1\n");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, 0, (int) 'a');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        java.lang.String str7 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass8 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str4, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str5, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str6, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str7, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((-1), (int) (short) 0, 10);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (-1), (int) (byte) 100);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 100\n" + "'", str4, "Tomorrow's date is -1 00 100\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 10, (int) (byte) 0, 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, 10, (int) ' ');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 10 00 32\n" + "'", str4, "Tomorrow's date is 10 00 32\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(100, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, 0, (int) 'a');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str4, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        java.lang.String str7 = dateCalculator3.getTomorrowDate();
        java.lang.String str8 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str4, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str5, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str6, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str7, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str8, "Tomorrow's date is 97 00 1\n");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) (short) -1, 10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '#', (-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (short) -1, (int) (byte) 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass6 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str4, "Tomorrow's date is -1 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str5, "Tomorrow's date is -1 00 1\n");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 100, 0, (int) (short) 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 10\n" + "'", str4, "Tomorrow's date is 00 00 10\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 00 00 10\n" + "'", str5, "Tomorrow's date is 00 00 10\n");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', (int) (byte) 1, (int) '4');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 02 01 52\n" + "'", str4, "Tomorrow's date is 02 01 52\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', 1, 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 02 01 0\n" + "'", str4, "Tomorrow's date is 02 01 0\n");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, 0, (int) ' ');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 100, (int) '4', (int) 'a');
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(10, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, (int) '4', (int) '4');
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (int) (byte) 100, 1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', (int) (byte) 1, (int) '4');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 02 01 52\n" + "'", str4, "Tomorrow's date is 02 01 52\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 02 01 52\n" + "'", str5, "Tomorrow's date is 02 01 52\n");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (-1), (int) (byte) 100);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 100\n" + "'", str4, "Tomorrow's date is -1 00 100\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is -1 00 100\n" + "'", str5, "Tomorrow's date is -1 00 100\n");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) '#', (int) (short) 1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        java.lang.String str7 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass8 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str4, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str5, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str6, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str7, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 10, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 10, 0, 100);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) (short) -1, 1);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) ' ', (int) (short) 10, (int) (byte) 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 11 01 0\n" + "'", str4, "Tomorrow's date is 11 01 0\n");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 0, 10, (int) (short) 1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 0, (int) ' ', (int) (byte) 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 32 00 1\n" + "'", str4, "Tomorrow's date is 32 00 1\n");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 0\n" + "'", str4, "Tomorrow's date is -1 00 0\n");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 100 00 0\n" + "'", str4, "Tomorrow's date is 100 00 0\n");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 0, 0, (int) ' ');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 32\n" + "'", str4, "Tomorrow's date is 00 00 32\n");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 100, (int) (short) 100, 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 100 00 1\n" + "'", str4, "Tomorrow's date is 100 00 1\n");
    }
}

