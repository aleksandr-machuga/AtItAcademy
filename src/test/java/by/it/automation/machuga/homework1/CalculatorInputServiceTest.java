package by.it.automation.machuga.homework1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorInputServiceTest {
    private MockedStatic<UserInputUtil> userInputUtil;

    @Test
    void getNumberFromShortDoubleTest() {
        userInputUtil = Mockito.mockStatic(UserInputUtil.class);
        userInputUtil.when(UserInputUtil::readUserInput).thenReturn(".5");
        double number = CalculatorInputService.getNumber();
        assertThat(number).as("Returned number doesn't match expected").isEqualTo(0.5);
    }

    @Test
    void getNumberFromValidInputTest() {
        userInputUtil = Mockito.mockStatic(UserInputUtil.class);
        userInputUtil.when(UserInputUtil::readUserInput).thenReturn("5");
        double number = CalculatorInputService.getNumber();
        assertThat(number).as("Returned number doesn't match expected").isEqualTo(5.0);
    }

    @Test
    void getNumberAfterIncorrectInputTest() {
        userInputUtil = Mockito.mockStatic(UserInputUtil.class);
        userInputUtil.when(UserInputUtil::readUserInput).thenReturn("d\n")
                .thenReturn("5");
        double number = CalculatorInputService.getNumber();
        assertThat(number).as("Returned number doesn't match expected").isEqualTo(5.0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"/", "*", "-", "+"})
    void getOperationFromValidInputTest(String operation) {
        userInputUtil = Mockito.mockStatic(UserInputUtil.class);
        userInputUtil.when(UserInputUtil::readUserInput).thenReturn(operation);
        String actualOperation = CalculatorInputService.getOperation();
        assertThat(actualOperation).as("Returned operation doesn't match expected").isEqualTo(operation);
    }

    @Test
    void getOperationAfterIncorrectInputTest() {
        userInputUtil = Mockito.mockStatic(UserInputUtil.class);
        userInputUtil.when(UserInputUtil::readUserInput).thenReturn("w")
                .thenReturn("+");
        String actualOperation = CalculatorInputService.getOperation();
        assertThat(actualOperation).as("Returned operation doesn't match expected").isEqualTo("+");
    }

    @AfterEach
    public void tearDown() {
        userInputUtil.close();
    }
}