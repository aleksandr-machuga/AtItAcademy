package by.it.automation.machuga.homework1;

public class CalculatorOperation {

    public static double divide(double leftOperand, double rightOperand) {
        if (rightOperand == 0) {
            throw new ArithmeticException(Constants.DIVISION_BY_ZERO);
        }
        return leftOperand / rightOperand;
    }

    public static double multiply(double leftOperand, double rightOperand) {
        return leftOperand * rightOperand;
    }

    public static double subtract(double leftOperand, double rightOperand) {
        return leftOperand - rightOperand;
    }

    public static double add(double leftOperand, double rightOperand) {
        return leftOperand + rightOperand;
    }
}
