package nested_fi;

import java.util.function.Consumer;

/**
 * Functional Interface Consumer
 * Represents an operation that accepts a single input argument
 * and returns no result.Unlike most other functional interfaces,
 * Consumer is expected to operate via side-effects.
 */
public class ConsumerImpl {

    public static void main(String[] args) {

        //This method will accept String argument and make in lower case
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String x) {
                System.out.println(x.toLowerCase());
            }
        };
        stringConsumer.accept("SoME ExPreSSioN");


        //In lambda expression method will looks like this:
        Consumer<String> stringConsumer1 = x -> System.out.println(x.toLowerCase());
        stringConsumer1.accept("SoME OthER WoRD");
    }
}

