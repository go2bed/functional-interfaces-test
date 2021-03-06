package my_own_fi.calculator;

/**
 * Testing class for functional Interfaces
 * of math operations
 */
public class CalculatorImpl {

    //Method, that takes an interface arguments
    //and it's instance with arguments for the function description
    public int operateBinary(int a, int b, Calculator op) {
        return op.operation(a, b);
    }

    public static void main(String[] args) {

        CalculatorImpl calculatorImpl = new CalculatorImpl();

        // We pass the values of function sign
        // to the new exemplar of FunctionalInterface
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;



        System.out.println("40 + 5 = " +
                calculatorImpl.operateBinary(40, 5, addition));
        System.out.println("20 - 10 = " +
                calculatorImpl.operateBinary(20, 10, subtraction));
        System.out.println("5 * 5 = " +
                calculatorImpl.operateBinary(5, 5, multiplication));
    }
}