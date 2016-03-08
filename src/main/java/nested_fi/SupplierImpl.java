package nested_fi;

import java.util.function.Supplier;

/**
 * Functional Interface
 * Represents a supplier of results.
 */
public class SupplierImpl {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "It will be a long day";
            }
        };

        //In lambda expression method will looks like this:
        Supplier<String> stringSupplier1 = () -> "It will be a long day";

        System.out.println(stringSupplier.get());
    }
}
