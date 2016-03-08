package nested_fi;

import java.util.function.Predicate;

/**
 * Functional Interface Predicate<T>
 *     Represents a predicate (boolean-valued function) of one argument.

 */
public class PredicateImpl {

    public static void main(String[] args) {

        Predicate<String> length = new Predicate<String>() {
            //This method will test is String argument more 5?
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        };

        //In lambda expression method will looks like this:
        Predicate<String> length1 = s -> s.length() > 5;

        System.out.println(length.test("Some string"));

    }
}
