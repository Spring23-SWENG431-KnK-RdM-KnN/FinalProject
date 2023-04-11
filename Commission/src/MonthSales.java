import java.text.DecimalFormat;

import static java.lang.Math.round;

public class MonthSales {
    private final double lockPrice = 45.0;
    private final double stockPrice = 30.0;
    private final double barrelPrice = 25.0;
    private int totalLocks = 0, totalStocks = 0, totalBarrels = 0;
    private double sales = 0, commission;

    public void sumLocks(int locks) {
        totalLocks += locks;
    }

    public void sumBarrels(int barrels) {
        totalBarrels += barrels;
    }

    public void sumStocks(int stocks) {
        totalStocks += stocks;
    }

    public int getLocksSold() {
        return totalLocks;
    }

    public int getStocksSold() {
        return totalStocks;
    }

    public int getBarrelsSold() {
        return totalBarrels;
    }

    public void calcSales() {
        double lockSales = lockPrice * totalLocks;
        double stockSales = stockPrice * totalStocks;
        double barrelSales = barrelPrice * totalBarrels;

        sales = lockSales + stockSales + barrelSales;
    }

    public double getSales() {
        return sales;
    }

    public void calcCommission() {
        if (sales > 1800.0) {
            commission = 0.1 * 1000.0;
            commission += 0.15 * 800.0;
            commission +=  0.2 * (sales - 1800.0);
        } else if (sales > 1000.0) {
            commission = 0.1 * 1000.0;
            commission += 0.15 * (sales - 1000.0);
        } else {
            commission = 0.1 * sales;
        }
    }

    public double getCommission()
    {


        return commission;
    }

    public void reset()
    {
        totalBarrels = 0;
        totalLocks = 0;
        totalStocks = 0;
    }

    public void setSales(double sal)
    {
        sales = sal;
        commission = 0;
    }
}
