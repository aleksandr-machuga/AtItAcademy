package by.it.automation.machuga.homework1;

public class Calculator {
    public static Object count(double leftOperand, double rightOperand, String operation) {
        Object result;
        switch (operation) {
            case Constants.ADD:
                result = CalculatorOperation.add(leftOperand, rightOperand);
                break;
            case Constants.SUBTRACT:
                result = CalculatorOperation.subtract(leftOperand, rightOperand);
                break;
            case Constants.MULTIPLY:
                result = CalculatorOperation.multiply(leftOperand, rightOperand);
                break;
            case Constants.DIVIDE:
                try {
                    result = CalculatorOperation.divide(leftOperand, rightOperand);
                } catch (ArithmeticException e) {
                    result = Constants.CANT_DIVIDE_MESSAGE;
                }
                break;
            default:
                result = Constants.IMPOSSIBLE_OPERATION_MESSAGE;
        }
        return result;
    }
}
