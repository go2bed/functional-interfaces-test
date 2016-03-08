package my_own_fi.calculator;

/**
 * This our own Functional Interface with
 * one abstract method of math operation
 */
@FunctionalInterface
public interface Calculator {
    int operation(int a, int b);
}
