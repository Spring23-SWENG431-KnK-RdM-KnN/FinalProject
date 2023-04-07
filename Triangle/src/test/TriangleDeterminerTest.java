import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TriangleDeterminerTest {
    TriangleDeterminer triDet = Instancio.create(TriangleDeterminer.class);

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

    private static Stream<Arguments> getTriangleValue() {
        return Stream.of(
                arguments(""),
                arguments()
        );
    }
}