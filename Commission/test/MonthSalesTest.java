import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MonthSalesTest
{
    private final double lockPrice = 45.0;
    private final double stockPrice = 30.0;
    private final double barrelPrice = 25.0;
    MonthSales ms = Instancio.create(MonthSales.class);

    @ParameterizedTest
    @MethodSource
    void sumLocks(int exp, int a, int b, int c, int d)
    {
        ms.reset();
        ms.sumLocks(a);
        ms.sumLocks(b);
        ms.sumLocks(c);
        ms.sumLocks(d);
        assertEquals(exp, ms.getLocksSold());
    }

    private static Stream<Arguments> sumLocks() {
        return Stream.of(
                arguments(0, 0, 0, 0, 0),
                arguments(4, 1, 1, 1, 1),
                arguments(400, 100, 100, 100, 100),
                arguments(-20, -10, -5, -3, -2)
        );
    }


    @ParameterizedTest
    @MethodSource
    void sumBarrels(int exp, int a, int b, int c, int d)
    {
        ms.reset();
        ms.sumBarrels(a);
        ms.sumBarrels(b);
        ms.sumBarrels(c);
        ms.sumBarrels(d);
        assertEquals(exp, ms.getBarrelsSold());
    }

    private static Stream<Arguments> sumBarrels() {
        return Stream.of(
                arguments(0, 0, 0, 0, 0),
                arguments(4, 1, 1, 1, 1),
                arguments(400, 100, 100, 100, 100),
                arguments(-20, -10, -5, -3, -2)
        );
    }


    @ParameterizedTest
    @MethodSource
    void sumStocks(int exp, int a, int b, int c, int d)
    {
        ms.reset();
        ms.sumStocks(a);
        ms.sumStocks(b);
        ms.sumStocks(c);
        ms.sumStocks(d);
        assertEquals(exp, ms.getStocksSold());
    }

    private static Stream<Arguments> sumStocks() {
        return Stream.of(
                arguments(0, 0, 0, 0, 0),
                arguments(4, 1, 1, 1, 1),
                arguments(400, 100, 100, 100, 100),
                arguments(-20, -10, -5, -3, -2)
        );
    }


    @ParameterizedTest
    @MethodSource
    void calcSales(int a, int b, int c)
    {
        ms.reset();
        ms.sumLocks(a);
        ms.sumStocks(b);
        ms.sumBarrels(c);
        ms.calcSales();

        double exp = (a * lockPrice) +
                (b * stockPrice) +
                (c * barrelPrice);

        assertEquals(exp, ms.getSales());
    }

    private static Stream<Arguments> calcSales() {
        return Stream.of(
                arguments(0, 0, 0),
                arguments(1, 1, 1),
                arguments(100, 100, 100),
                arguments(-5, -3, -2)
        );


    }


    @ParameterizedTest
    @MethodSource
    void calcCommission(double sales)
    {
        ms.setSales(sales);
        ms.calcCommission();
        double exp;

        if (sales > 1800.0) {
            exp = 0.1 * 1000.0;
            exp += exp + 0.15 * 800.0;
            exp += exp + 0.2 * (sales - 1800.0);
        } else if (sales > 1000.0) {
            exp = 0.1 * 1000.0;
            exp += exp + 0.15 * (sales - 1000.0);
        } else {
            exp = 0.1 * sales;
        }

        assertEquals(exp, ms.getCommission());
    }

    private static Stream<Arguments> calcCommission() {
        return Stream.of(
                arguments(1000),
                arguments(-1000),
                arguments(0),
                arguments(10000),
                arguments(-1),
                arguments(1)
        );


    }
}