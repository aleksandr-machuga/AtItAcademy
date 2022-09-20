package by.it.automation.machuga.homework1;

import java.util.Scanner;

public class Calculator {

    private static final String CONTINUATION = "y";
    private static final String CONTINUATION_REQUEST_MESSAGE =
            String.format("Yes - enter [%s] or enter any key to exit.", CONTINUATION);
    private static final String NEXT_MESSAGE = "Continue working?";
    private static final String EXIT_MESSAGE = "The work is completed.";
    private static final String ENTER_NUMBER_MESSAGE = "Enter a number:";
    private static final String ENTERED_VALUE_NOT_NUMBER_MESSAGE = "The entered value is not a number. Enter a number:";
    private static final String ENTER_OPERATION_SIGN_MESSAGE = "Enter the operation sign:";
    private static final String THIS_OPERATION_NOT_SUPPORTED_MESSAGE = "This operation is not supported.";
    private static final String CANT_DIVIDE_MESSAGE = "It cannot be divided by 0.";
    private static final String IMPOSSIBLE_OPERATION_MESSAGE = "Operation can't be performed.";
    private static final String OPERATION_SIGNS = "+-*/";
    private static final String ADD = "+";
    private static final String SUBTRACT = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userChoice;
        do {
            double leftOperand = getNumber();
            String operation = getOperation();
            double rightOperand = getNumber();
            count(leftOperand, rightOperand, operation);
            System.out.println(NEXT_MESSAGE);
            System.out.println(CONTINUATION_REQUEST_MESSAGE);
            userChoice = scanner.next();
        } while (userChoice.equalsIgnoreCase(CONTINUATION));
        System.out.println(EXIT_MESSAGE);
    }

    private static double getNumber() {
        System.out.println(ENTER_NUMBER_MESSAGE);
        double number = 0;
        try {
            number = Double.parseDouble(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println(ENTERED_VALUE_NOT_NUMBER_MESSAGE);
            getNumber();
        }
        return number;
    }

    private static String getOperation() {
        System.out.println(ENTER_OPERATION_SIGN_MESSAGE);
        String operation = scanner.next();
        if (!OPERATION_SIGNS.contains(operation)) {
            System.out.println(THIS_OPERATION_NOT_SUPPORTED_MESSAGE);
            getOperation();
        }
        return operation;
    }

    private static void count(double leftOperand, double rightOperand, String operation) {
        switch (operation) {
            case ADD:
                System.out.println(leftOperand + rightOperand);
                break;
            case SUBTRACT:
                System.out.println(leftOperand - rightOperand);
                break;
            case MULTIPLY:
                System.out.println(leftOperand * rightOperand);
                break;
            case DIVIDE:
                if (rightOperand == 0) {
                    System.out.println(CANT_DIVIDE_MESSAGE);
                } else {
                    System.out.println(leftOperand / rightOperand);
                }
                break;
            default:
                System.out.println(IMPOSSIBLE_OPERATION_MESSAGE);
        }
    }
}
