//import org.junit.jupiter.api.*;
import org.example.DateCalculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
//import org.junit.jupiter.params.provider.ValueSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DateCalculatorTest {
    DateCalculator dc;

    // .csv file may be needed to be set to LF if running on Intellij
    @ParameterizedTest
    @CsvFileSource(files = "getTomorrowDateData.csv")
    void getTomorrowDate(int day, int month, int year, String expected) {
        dc = new DateCalculator(day, month, year);
        String str = dc.getTomorrowDate();
        assertEquals(str, expected);
    }

    private static Stream<Arguments> getTomorrowDate() {
        return Stream.of(
                arguments(1, 1, 1812, "Tomorrow's date is 01 02 1812\n"),
                arguments(31, 1, 1813, "Tomorrow's date is 02 01 1813\n"),
                arguments(3, 3, 1850, "Tomorrow's date is 03 04 1850\n"),
                arguments(31, 3, 1899, "Tomorrow's date is 04 01 1899\n"),
                arguments(5, 5, 1900, "Tomorrow's date is 05 06 1900\n"),
                arguments(31, 5, 1901, "Tomorrow's date is 06 01 1901\n"),
                arguments(7, 7, 1950, "Tomorrow's date is 07 08 1950\n"),
                arguments(31, 7, 1999, "Tomorrow's date is 08 01 1999\n"),
                arguments(8, 8, 2000, "Tomorrow's date is 08 09 2000\n"),
                arguments(31, 8, 2001, "Tomorrow's date is 09 01 2001\n"),
                arguments(10, 10, 2006, "Tomorrow's date is 10 11 2006\n"),
                arguments(31, 10, 2012, "Tomorrow's date is 11 01 2012\n"),
                arguments(4, 4, 1820, "Tomorrow's date is 04 05 1820\n"),
                arguments(30, 4, 1825, "Tomorrow's date is 05 01 1825\n"),
                arguments(31, 4, 1825, "Invalid Input Date\n"),
                arguments(6, 6, 1820, "Tomorrow's date is 06 07 1820\n"),
                arguments(30, 6, 1825, "Tomorrow's date is 07 01 1825\n"),
                arguments(31, 6, 1825, "Invalid Input Date\n"),
                arguments(9, 9, 1820, "Tomorrow's date is 09 10 1820\n"),
                arguments(30, 9, 1825, "Tomorrow's date is 10 01 1825\n"),
                arguments(31, 9, 1825, "Invalid Input Date\n"),
                arguments(11, 11, 1820, "Tomorrow's date is 11 12 1820\n"),
                arguments(30, 11, 1825, "Tomorrow's date is 12 01 1825\n"),
                arguments(31, 11, 1825, "Invalid Input Date\n"),
                arguments(12, 12, 1977, "Tomorrow's date is 12 13 1977\n"),
                arguments(31, 12, 2003, "Tomorrow's date is 01 01 2004\n"),
                arguments(31, 12, 2012, "Invalid Input Date\n"),
                arguments(2, 2, 2000, "Tomorrow's date is 02 03 2000\n"),
                arguments(28, 2, 2000, "Tomorrow's date is 02 29 2000\n"),
                arguments(28, 2, 2001, "Tomorrow's date is 03 01 2001\n"),
                arguments(29, 2, 2000, "Tomorrow's date is 03 01 2000\n"),
                arguments(29, 2, 2001, "Invalid Input Date\n"),
                arguments(31, 2, 2001, "Invalid Input Date\n")
        );
    }
}