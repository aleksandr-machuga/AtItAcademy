package by.it.automation.machuga.homework1;

public class CalculatorRunner {

    public static void main(String[] args) {
        String userChoice;
        do {
            double leftOperand = CalculatorInputService.getNumber();
            String operation = CalculatorInputService.getOperation();
            double rightOperand = CalculatorInputService.getNumber();
            System.out.println(Calculator.count(leftOperand, rightOperand, operation));
            System.out.println(Constants.NEXT_MESSAGE);
            System.out.println(Constants.CONTINUATION_REQUEST_MESSAGE);
            userChoice = UserInputUtil.readUserInput();
        } while (userChoice.equalsIgnoreCase(Constants.CONTINUATION));
        System.out.println(Constants.EXIT_MESSAGE);
    }
}
