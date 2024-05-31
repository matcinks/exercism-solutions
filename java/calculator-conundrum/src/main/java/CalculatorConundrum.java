
class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        validation(operation);

        int result = switch (operation) {
            case "+" -> addition(operand1, operand2);
            case "*" -> multiplication(operand1, operand2);
            case "/" -> division(operand1, operand2);
            default -> -1;
        };

        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }

    private static void validation(String operation) {
        String[] validOperations = {"+", "*", "/"};
        if (operation == null) throw new IllegalArgumentException("Operation cannot be null");
        if (operation.isEmpty()) throw new IllegalArgumentException("Operation cannot be empty");
        if (!isValidOperand(operation, validOperations)) throw new IllegalOperationException("Operation '" + operation + "' does not exist");
    }

    private static boolean isValidOperand(String operation, String[] operations) {
        boolean result = false;
        for (String o : operations) {
            if (o.equals(operation)) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static int addition (int operand1, int operand2) {
        return operand1 + operand2;
    }

    private static int multiplication (int operand1, int operand2) {
        return operand1 * operand2;
    }

    private static int division (int operand1, int operand2) {
        try {
            return operand1 / operand2;
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
