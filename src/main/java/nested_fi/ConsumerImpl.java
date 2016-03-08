package nested_fi;

import java.util.function.Consumer;

/**
 * Implementation of Consumer
 * Functional Interface work
 * This is a functional interface and can therefore
 * be used as the assignment target for a lambda expression
 * or method reference.
 */
public class ConsumerImpl {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        //Inner class presentation of Consumer FI
        consumerInterfase(new Consumer<ConsumerImpl>() {
            @Override
            public void accept(ConsumerImpl consumer) {
                consumer.setName("Was eaten");
                System.out.println(consumer);
            }
        });


        //And lambda presentation of Consumer FI
        consumerInterfase(consumer -> {
            consumer.setName("Was eaten");
            System.out.println(consumer);
        });

    }


    public static void consumerInterfase(Consumer<ConsumerImpl> consumerInterface) {
        ConsumerImpl consumer = new ConsumerImpl();
        consumerInterface.accept(consumer);
    }

    @Override
    public String toString() {
        return "ConsumerImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
