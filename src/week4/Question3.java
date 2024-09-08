package week4;
//Implement a program that handles multiple
// exceptions
//(e.g., ArithmeticException, NullPointerException) and
//uses
//custom exceptions.

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Question3 {
    public static void main(String[] args) {
        try {
            // Example 1: ArithmeticException
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);

            // Example 2: NullPointerException
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException

            // Example 3: Custom Exception
            checkValue(-1); // This will throw CustomException
            // Here I Have use try with multiple catch
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } catch (CustomException e) {
            System.out.println("Caught a CustomException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general Exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed, whether an exception occurred or not.");
        }
    }

    // Method that throws a custom exception for negative values
    public static void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative!");
        }
    }
}
