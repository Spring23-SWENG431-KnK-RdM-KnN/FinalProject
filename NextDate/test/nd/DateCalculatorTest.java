package nd;

import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DateCalculatorTest {
    DateCalculator dc = Instancio.create(DateCalculator.class);

    @ParameterizedTest
    @MethodSource
    void getTomorrowDate(String expected, int day, int month, int year) {
        dc = new DateCalculator(day, month, year);
        String str = dc.getTomorrowDate();
        assertEquals(expected, str);
    }

    private static Stream<Arguments> getTomorrowDate() {
        return Stream.of(
                arguments("Tomorrow's date is 01 02 1837\n", 1, 1, 1837),
                arguments("Tomorrow's date is 04 15 1961\n", 14, 4, 1961),
                arguments("Tomorrow's date is 01 01 2011\n", 31, 12, 2010),
                arguments("Tomorrow's date is 02 29 2000\n", 28, 2, 2000)
        );
    }
}