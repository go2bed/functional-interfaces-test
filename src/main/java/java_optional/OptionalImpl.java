package java_optional;

import java.util.Optional;

/**
 * java.util.Optional<T> class to deal with
 * NullPointerException gracefully.
 * An Optional is a wrapper for a non-null value
 * that may or may not contain a non-null value.
 */
public class OptionalImpl {

    public static void main(String[] args) {

        /**
         * Optional<T> empty()
         * Returns an empty Optional.
         * The Optional<T> returned from this method does not contain a non-null value.
         */
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        /**Optional<T> of(T value)
         * Returns an Optional containing the specified value as the non-null value.
         * If the specified value is null, it throws a NullPointerException.
         */
        Optional<String> str = Optional.of("It's a bad time for nullPointer");
        System.out.println(str);

        /**
         * Optional<T> ofNullable(T value)
         * Returns an Optional containing the specified value if the value is non-null.
         * If the specified value is null, it returns an empty Optional.
         */
        String nullableString = "";
        Optional<String> str2 = Optional.of(nullableString);
        System.out.println(str2);
    }
}

