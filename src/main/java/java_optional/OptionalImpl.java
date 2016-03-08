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


        Optional<String> optional = Optional.of("bam");

        // Return {@code true} if there is a value present, otherwise {@code false}
        System.out.println(optional.isPresent());           // true

        //  If a value is present in this {@code Optional}, returns the value,
        // otherwise throws {@code NoSuchElementException}.
        System.out.println(optional.get());                 // "bam"

        //Return the value if present, otherwise return {@code other}.
        System.out.println(optional.orElse("fallback"));    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }
}

