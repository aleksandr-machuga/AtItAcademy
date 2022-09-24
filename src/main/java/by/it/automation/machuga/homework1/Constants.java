package by.it.automation.machuga.homework1;

public interface Constants {

    String CONTINUATION = "y";
    String CONTINUATION_REQUEST_MESSAGE =
            String.format("Yes - enter [%s] or enter any key to exit.", CONTINUATION);
    String NEXT_MESSAGE = "Continue working?";
    String EXIT_MESSAGE = "The work is completed.";
    String ENTER_NUMBER_MESSAGE = "Enter a number:";
    String ENTERED_VALUE_NOT_NUMBER_MESSAGE = "The entered value is not a number. Enter a number:";
    String ENTER_OPERATION_SIGN_MESSAGE = "Enter the operation sign:";
    String THIS_OPERATION_NOT_SUPPORTED_MESSAGE =
                    "This operation is not supported. " + ENTER_OPERATION_SIGN_MESSAGE;
    String CANT_DIVIDE_MESSAGE = "It cannot be divided by 0.";
    String IMPOSSIBLE_OPERATION_MESSAGE = "Operation can't be performed.";
    String OPERATION_SIGNS = "+-*/";
    String ADD = "+";
    String SUBTRACT = "-";
    String MULTIPLY = "*";
    String DIVIDE = "/";
}
