package by.it.automation.machuga.homework1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static by.it.automation.machuga.homework1.Calculator.*;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"2,+,2,4.0", "5,-,3,2.0", "-2,*,2,-4.0", "5,/,2,2.5", "2,^,2,Operation can't be performed."})
    void countTest(double leftOperand, String operation, double rightOperand, Object expectedResult) {
        Object actualResult = String.valueOf(count(leftOperand, rightOperand, operation));
        assertThat(actualResult)
                .as("Calculation result doesn't match expected result")
                .isEqualTo(expectedResult);
    }

}