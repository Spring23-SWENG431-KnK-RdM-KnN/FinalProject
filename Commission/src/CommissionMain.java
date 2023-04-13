import java.util.Scanner;

public class CommissionMain {

    public static void main(String[] args) {
        Scanner inputGetter = new Scanner(System.in);
        MonthSales gerod = new MonthSales();
        int locks, stocks, barrels;
        do {
            System.out.print("Enter number of locks or -1 to stop: ");
            locks = inputGetter.nextInt();

            if (locks == -1)
            {
                System.out.println();
                break;
            }

            System.out.print("Enter stocks: ");
            stocks = inputGetter.nextInt();
            System.out.print("Enter barrels: ");
            barrels = inputGetter.nextInt();

            gerod.sumLocks(locks);
            gerod.sumStocks(stocks);
            gerod.sumBarrels(barrels);
            System.out.println("Next input...\n");
        } while (locks != -1);

        System.out.print("Locks sold: " + gerod.getLocksSold() + "\t");
        System.out.print("Stocks sold: " + gerod.getStocksSold() + "\t");
        System.out.println("Barrels sold: " + gerod.getBarrelsSold() + "\n");

        gerod.calcSales();
        System.out.println("Total Sales: " + gerod.getSales());

        gerod.calcCommission();
        System.out.println("Commission is $" + gerod.getCommission());
    }
}