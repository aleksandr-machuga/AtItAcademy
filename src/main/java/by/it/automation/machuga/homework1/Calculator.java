package by.it.automation.machuga.homework1;

public class Calculator {

    public static void interactWithUser() {
        double leftOperand = CalculatorInputService.getNumber();
        String operation = CalculatorInputService.getOperation();
        double rightOperand = CalculatorInputService.getNumber();
        count(leftOperand, rightOperand, operation);
    }

    private static void count(double leftOperand, double rightOperand, String operation) {
        switch (operation) {
            case Constants.ADD:
                System.out.println(CalculatorOperation.add(leftOperand, rightOperand));
                break;
            case Constants.SUBTRACT:
                System.out.println(CalculatorOperation.subtract(leftOperand, rightOperand));
                break;
            case Constants.MULTIPLY:
                System.out.println(CalculatorOperation.multiply(leftOperand, rightOperand));
                break;
            case Constants.DIVIDE:
                if (rightOperand == 0) {
                    System.out.println(Constants.CANT_DIVIDE_MESSAGE);
                } else {
                    System.out.println(CalculatorOperation.divide(leftOperand, rightOperand));
                }
                break;
            default:
                System.out.println(Constants.IMPOSSIBLE_OPERATION_MESSAGE);
        }
    }
}
