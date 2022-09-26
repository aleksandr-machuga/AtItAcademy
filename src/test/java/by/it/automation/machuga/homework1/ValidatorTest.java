package by.it.automation.machuga.homework1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {"5,true", "2.5,true", ".5,true", "5h,false", "fife,false"})
    void checkInputIsDouble(String value, boolean expectedResult) {
        boolean actualResult = Validator.checkInputIsDouble(value);
        assertThat(actualResult)
                .as("User input was recognized incorrectly")
                .isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"+,true", "-,true", "*,true", "/,true", "d,false", "5,false", "^,false"})
    void checkOperationIsValid(String value, boolean expectedResult) {
        boolean actualResult = Validator.checkOperationIsValid(value);
        assertThat(actualResult)
                .as("User input was recognized incorrectly")
                .isEqualTo(expectedResult);
    }
}