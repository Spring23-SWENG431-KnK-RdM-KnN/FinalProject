import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TriangleDeterminerTest {
    TriangleDeterminer triDet = new TriangleDeterminer();
    private static final String nonTri = "NotATriangle";
    private static final String scalene = "Scalene";
    private static final String equilat = "Equilateral";
    private static final String isosc = "Isosceles";

    @ParameterizedTest
    @MethodSource
    void getMatchValue(int exp, int a, int b, int c) {
        int res = triDet.getMatchValue(a, b, c);
        assertEquals(exp, res);
    }

    private static Stream<Arguments> getMatchValue() {
        return Stream.of(
                arguments(0, 1, 2, 3),
                arguments(1, 1, 1, 2),
                arguments(2, 1, 2, 1),
                arguments(3, 2, 1, 1),
                arguments(6, 1, 1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource
    void getTriangleType(String expType, int match, int a, int b, int c) {
        String type = triDet.getTriangleType(match, a, b, c);
        assertEquals(expType, type);
    }

    private static Stream<Arguments> getTriangleType() {
        return Stream.of(
                arguments(nonTri, 0, 1, 2, 5),
                arguments(nonTri, 0, 5, 1, 2),
                arguments(nonTri, 0, 1, 5, 2),
                arguments(scalene, 0, 4, 5, 3),
                arguments(nonTri, 1, 1, 1, 0),
                arguments(nonTri, 2, 1, 2, 1),
                arguments(nonTri, 3, 2, 1, 1),
                arguments(isosc, 1, 1, 1, 2),
                arguments(isosc, 2, 3, 2, 3),
                arguments(isosc, 3, 1, 2, 2),
                arguments(equilat, 6, 1, 1, 1)
        );
    }
}