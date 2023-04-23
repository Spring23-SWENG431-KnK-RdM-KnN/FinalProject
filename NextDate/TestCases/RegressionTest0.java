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
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (short) -1, (int) (byte) 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str4, "Tomorrow's date is -1 00 1\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, 0, (int) 'a');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass6 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str4, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str5, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', 1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (int) (short) 100, 100);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 100 00 100\n" + "'", str4, "Tomorrow's date is 100 00 100\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((-1), (int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((-1), (int) ' ', (int) (byte) 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 32 00 10\n" + "'", str4, "Tomorrow's date is 32 00 10\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass6 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str4, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str5, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 100, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(10, (int) '4', (int) '#');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 52 00 35\n" + "'", str4, "Tomorrow's date is 52 00 35\n");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 100, 0, (int) (short) 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 10\n" + "'", str4, "Tomorrow's date is 00 00 10\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (short) -1, (int) (byte) 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str4, "Tomorrow's date is -1 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str5, "Tomorrow's date is -1 00 1\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str6, "Tomorrow's date is -1 00 1\n");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((-1), (int) (short) 0, 10);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (-1), (int) (byte) 100);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 100\n" + "'", str4, "Tomorrow's date is -1 00 100\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, 10, (int) ' ');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 10 00 32\n" + "'", str4, "Tomorrow's date is 10 00 32\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(100, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, 0, (int) 'a');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 97\n" + "'", str4, "Tomorrow's date is 00 00 97\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '#', (-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (short) -1, (int) (byte) 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass6 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str4, "Tomorrow's date is -1 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is -1 00 1\n" + "'", str5, "Tomorrow's date is -1 00 1\n");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', (int) (byte) 1, (int) '4');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 02 01 52\n" + "'", str4, "Tomorrow's date is 02 01 52\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', 1, 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 02 01 0\n" + "'", str4, "Tomorrow's date is 02 01 0\n");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, 0, (int) ' ');
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 100, (int) '4', (int) 'a');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, (int) '4', (int) '4');
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', (int) (byte) 1, (int) '4');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 02 01 52\n" + "'", str4, "Tomorrow's date is 02 01 52\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 02 01 52\n" + "'", str5, "Tomorrow's date is 02 01 52\n");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) '#', (int) (short) 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 10, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 10, 0, 100);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) (short) -1, 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 100, (int) (short) 100, 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 100 00 1\n" + "'", str4, "Tomorrow's date is 100 00 1\n");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 0, (int) ' ', (int) (byte) 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 32 00 1\n" + "'", str4, "Tomorrow's date is 32 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 32 00 1\n" + "'", str5, "Tomorrow's date is 32 00 1\n");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, 0, (int) ' ');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 32\n" + "'", str4, "Tomorrow's date is 00 00 32\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 10, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(1, 1, (int) (short) 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(10, (int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(100, (int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 0, 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 0\n" + "'", str4, "Tomorrow's date is -1 00 0\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', 1, 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(1, (int) (short) 0, 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 10\n" + "'", str4, "Tomorrow's date is 00 00 10\n");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(1, (int) (short) 0, 10);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 0, 1, 10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        java.lang.String str7 = dateCalculator3.getTomorrowDate();
        java.lang.String str8 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass9 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str4, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str5, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str6, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str7, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str8, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 0, (int) ' ', (int) ' ');
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) ' ', (int) (short) 10, (int) (byte) 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 11 01 0\n" + "'", str4, "Tomorrow's date is 11 01 0\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        java.lang.String str7 = dateCalculator3.getTomorrowDate();
        java.lang.String str8 = dateCalculator3.getTomorrowDate();
        java.lang.String str9 = dateCalculator3.getTomorrowDate();
        java.lang.String str10 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str4, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str5, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str6, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str7, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str8, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str9, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str10, "Tomorrow's date is 97 00 1\n");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) ' ', (int) (short) 1, (int) '4');
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(10, (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 10, (int) ' ', (int) 'a');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (-1), (int) (byte) 100);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 100\n" + "'", str4, "Tomorrow's date is -1 00 100\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is -1 00 100\n" + "'", str5, "Tomorrow's date is -1 00 100\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is -1 00 100\n" + "'", str6, "Tomorrow's date is -1 00 100\n");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(100, (int) ' ', 10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (byte) 100, 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 100 00 0\n" + "'", str4, "Tomorrow's date is 100 00 0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 100 00 0\n" + "'", str5, "Tomorrow's date is 100 00 0\n");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 1, (int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, (int) (short) 0, (int) '#');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 35\n" + "'", str4, "Tomorrow's date is 00 00 35\n");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(10, (int) (byte) 10, (int) (short) 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 10 11 10\n" + "'", str4, "Tomorrow's date is 10 11 10\n");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) (short) -1, 100);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(1, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) 'a', (int) (byte) -1, (int) 'a');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 97\n" + "'", str4, "Tomorrow's date is -1 00 97\n");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, (-1), (int) ' ');
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', (int) (byte) 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass7 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 97 00 0\n" + "'", str4, "Tomorrow's date is 97 00 0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 97 00 0\n" + "'", str5, "Tomorrow's date is 97 00 0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 97 00 0\n" + "'", str6, "Tomorrow's date is 97 00 0\n");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 0\n" + "'", str4, "Tomorrow's date is 00 00 0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 00 00 0\n" + "'", str5, "Tomorrow's date is 00 00 0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 00 00 0\n" + "'", str6, "Tomorrow's date is 00 00 0\n");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(10, (int) (byte) 1, (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(100, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(100, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(1, 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) -1, (int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 100, (int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) (byte) 100, 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 100 00 0\n" + "'", str4, "Tomorrow's date is 100 00 0\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) ' ', (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((-1), 100, (int) (short) 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, 10, (int) ' ');
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 100 00 0\n" + "'", str4, "Tomorrow's date is 100 00 0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 100 00 0\n" + "'", str5, "Tomorrow's date is 100 00 0\n");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', (int) '#');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 100, (int) '#', 0);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) (byte) -1, 10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(100, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 100, 0, (int) (short) 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass6 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 10\n" + "'", str4, "Tomorrow's date is 00 00 10\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 00 00 10\n" + "'", str5, "Tomorrow's date is 00 00 10\n");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass7 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str4, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str5, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 97 00 1\n" + "'", str6, "Tomorrow's date is 97 00 1\n");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 10, (int) (byte) 0, 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 0\n" + "'", str4, "Tomorrow's date is 00 00 0\n");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 1, (int) (byte) 0, 10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 0, 0, (int) ' ');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.Class<?> wildcardClass5 = dateCalculator3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 32\n" + "'", str4, "Tomorrow's date is 00 00 32\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (int) ' ', (int) '#');
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '#', (int) '#', (int) (byte) 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, 0, 1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 100, 0, (int) (short) 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 00 00 10\n" + "'", str4, "Tomorrow's date is 00 00 10\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 00 00 10\n" + "'", str5, "Tomorrow's date is 00 00 10\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 00 00 10\n" + "'", str6, "Tomorrow's date is 00 00 10\n");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) (byte) 0, 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) '4', (int) 'a');
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 52 00 97\n" + "'", str4, "Tomorrow's date is 52 00 97\n");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 100, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 10, (-1), (int) (short) 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 1, (int) (short) 1, (int) (byte) 1);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 01 02 1\n" + "'", str4, "Tomorrow's date is 01 02 1\n");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) (short) -1, 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is -1 00 10\n" + "'", str4, "Tomorrow's date is -1 00 10\n");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 0, 10, (int) 'a');
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) '4', (int) (short) 100, (int) (byte) 10);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 100 00 10\n" + "'", str4, "Tomorrow's date is 100 00 10\n");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 0, (int) (short) 0, 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (short) 100, (int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 1, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass4 = dateCalculator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(0, (-1), (int) (short) 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) 10, (int) 'a', (int) (byte) 100);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 97 00 100\n" + "'", str4, "Tomorrow's date is 97 00 100\n");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator((int) (byte) -1, (int) 'a', (int) (byte) 0);
        java.lang.String str4 = dateCalculator3.getTomorrowDate();
        java.lang.String str5 = dateCalculator3.getTomorrowDate();
        java.lang.String str6 = dateCalculator3.getTomorrowDate();
        java.lang.String str7 = dateCalculator3.getTomorrowDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tomorrow's date is 97 00 0\n" + "'", str4, "Tomorrow's date is 97 00 0\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tomorrow's date is 97 00 0\n" + "'", str5, "Tomorrow's date is 97 00 0\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tomorrow's date is 97 00 0\n" + "'", str6, "Tomorrow's date is 97 00 0\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tomorrow's date is 97 00 0\n" + "'", str7, "Tomorrow's date is 97 00 0\n");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.example.DateCalculator dateCalculator3 = new org.example.DateCalculator(10, (int) 'a', (int) (short) 100);
    }
}

