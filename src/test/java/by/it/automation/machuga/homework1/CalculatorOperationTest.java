package by.it.automation.machuga.homework1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class CalculatorOperationTest {

    private static final String DIVISION_BY_ZERO = "Division by zero";

    @Test
    void divideByZeroTest() {
        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> CalculatorOperation.divide(2, 0))
                .withMessage(DIVISION_BY_ZERO);
    }

    @ParameterizedTest
    @CsvSource(value = {"8,2,4", "-5,2.5,-2", "6,0.25,24"})
    void divideTest(double leftOperand, double rightOperand, double expectedResult) {
        double actualResult = CalculatorOperation.divide(leftOperand, rightOperand);
        assertThat(actualResult)
                .as("Calculation result doesn't match expected result")
                .isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"2.0,2,4", "-2.5,2,-5", "2147483647,2,4294967294", "2,0,0", "-4,.5,-2"})
    void multiplyTest(double leftOperand, double rightOperand, double expectedResult) {
        double actualResult = CalculatorOperation.multiply(leftOperand, rightOperand);
        assertThat(actualResult)
                .as("Calculation result doesn't match expected result")
                .isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,-2,3", "-2.5,-2,-0.5", "-2147483648,1,-2147483649", "2,0,2", "0.5,.5,0"})
    void subtractTest(double leftOperand, double rightOperand, double expectedResult) {
        double actualResult = CalculatorOperation.subtract(leftOperand, rightOperand);
        assertThat(actualResult)
                .as("Calculation result doesn't match expected result")
                .isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,-2,-1", "-1.5,-2,-3.5", "-2147483648,1,-2147483647", "1,0,1", "0.5,.5,1"})
    void addTest(double leftOperand, double rightOperand, double expectedResult) {
        double actualResult = CalculatorOperation.add(leftOperand, rightOperand);
        assertThat(actualResult)
                .as("Calculation result doesn't match expected result")
                .isEqualTo(expectedResult);
    }
}