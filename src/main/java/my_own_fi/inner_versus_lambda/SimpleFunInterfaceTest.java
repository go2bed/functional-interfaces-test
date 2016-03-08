package my_own_fi.inner_versus_lambda;


/**
 * Implementation the interface by creating an
 * anonymous inner class versus using
 * lambda expression.
 */
public class SimpleFunInterfaceTest {
    public static void main(String[] args) {
        carryOutWork(new SimpleFuncInterface() {
            @Override
            public void doWork() {
                System.out.println("Do work in SimpleFun impl...");
            }
        });
        carryOutWork(() -> System.out.println("Do work in lambda exp impl..."));
    }

    public static void carryOutWork(SimpleFuncInterface sfi) {
        sfi.doWork();
    }
}
