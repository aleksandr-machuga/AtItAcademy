package by.it.automation.machuga.homework1;

public class CalculatorInputService {
    public static double getNumber() {
        System.out.println(Constants.ENTER_NUMBER_MESSAGE);
        String input = CalculatorRunner.scanner.next();
        input = correctDecimal(input);
        while (!Validator.checkInputIsDouble(input)) {
            System.out.println(Constants.ENTERED_VALUE_NOT_NUMBER_MESSAGE);
            input = CalculatorRunner.scanner.next();
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
        String operation = CalculatorRunner.scanner.next();
        while (Validator.checkOperationIsValid(operation)) {
            System.out.println(Constants.THIS_OPERATION_NOT_SUPPORTED_MESSAGE);
            operation = CalculatorRunner.scanner.next();
        }
        return operation;
    }
}
