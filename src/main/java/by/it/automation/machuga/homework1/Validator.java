package by.it.automation.machuga.homework1;

public class Validator {
    public static boolean checkInputIsDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkOperationIsValid(String operation) {
        return !Constants.OPERATION_SIGNS.contains(operation);
    }
}
