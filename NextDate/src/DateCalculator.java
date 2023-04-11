/**
 * Code adapted with little change from pseudocode in book "Software Testing" Chapter 2
 */
public class DateCalculator {
    private int tomorrowDay, tomorrowMonth, tomorrowYear;
    private final int day, month ,year;
    private boolean isInvalidInput = false;

    public DateCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        tomorrowMonth = month;
        tomorrowYear = year;
    }
    public String getTomorrowDate() {
        calculate();
        if (isInvalidInput) {
            return "";
        }
        return String.format("Tomorrow's date is %02d %02d %d\n", tomorrowMonth, tomorrowDay, tomorrowYear);
    }
    private void calculate() {
        switch (month) {
            case 1, 3, 5, 7, 8, 10 -> {
                if (day < 31) {
                    tomorrowDay = day + 1;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth = month + 1;
                }
            }
            case 4, 6, 9, 11 -> {
                if (day < 30) {
                    tomorrowDay = day + 1;
                } else if (day == 30) {
                    tomorrowDay = 1;
                    tomorrowMonth = month + 1;
                } else {
                    System.out.println("Invalid Input Date");
                    isInvalidInput = true;
                }
            }
            case 12 -> {
                if (day < 31) {
                    tomorrowDay = day + 1;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth = 1;
                    if (year == 2012) {
                        System.out.println("Invalid Input Date");
                        isInvalidInput = true;
                    } else {
                        tomorrowYear = year + 1;
                    }
                }
            }
            case 2 -> {
                if (day < 28) {
                    tomorrowDay = day + 1;
                } else if (day == 28) {
                    if (year % 4 == 0) {
                        tomorrowDay = 29;
                    } else {
                        tomorrowDay = 1;
                        tomorrowMonth = 3;
                    }
                } else if (day == 29) {
                    if (year % 4 == 0) {
                        tomorrowDay = 1;
                        tomorrowMonth = 3;
                    } else {
                        System.out.println("Invalid Input Date");
                        isInvalidInput = true;
                    }
                } else {
                    System.out.println("Invalid Input Date");
                    isInvalidInput = true;
                }
            }
        }
    }
}
