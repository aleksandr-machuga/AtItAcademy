package by.it.automation.machuga.homework1;

public class CalculatorInputService {
    public static double getNumber() {
        System.out.println(Constants.ENTER_NUMBER_MESSAGE);
        String input = UserInputUtil.readUserInput();
        input = correctDecimal(input);
        while (!Validator.checkInputIsDouble(input)) {
            System.out.println(Constants.ENTERED_VALUE_NOT_NUMBER_MESSAGE);
            input = UserInputUtil.readUserInput();
        }
        return Double.parseDouble(input);
    }

    public static String correctDecimal(String input) {
        if (input.startsWith(".")) {
            input = 0 + input;
        }
        return input;
    }

    public static String getOperation() {
        System.out.println(Constants.ENTER_OPERATION_SIGN_MESSAGE);
        String operation = UserInputUtil.readUserInput();
        while (!Validator.checkOperationIsValid(operation)) {
            System.out.println(Constants.THIS_OPERATION_NOT_SUPPORTED_MESSAGE);
            operation = UserInputUtil.readUserInput();
        }
        return operation;
    }
}
