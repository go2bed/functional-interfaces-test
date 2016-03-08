package nested_fi;

import java.util.function.Function;

/**
 * Function FI
 * Represents a function that accepts one argument and produces a result.
 */
public class FunctionImpl {

    public static void main(String[] args) {

        //This method will convert Integer to String
        Function<Integer, String> converter = new Function<Integer, String>() {
            @Override
            public String apply(Integer i) {
                return Integer.toString(i);
            }
        };

        //In lambda expression method will looks like this:
        Function<Integer, String> converter1 = i -> Integer.toString(i);

        //Result will be depending from length of obtained string
        System.out.println(converter.apply(3).length());
        System.out.println(converter.apply(30).length());
    }
}
