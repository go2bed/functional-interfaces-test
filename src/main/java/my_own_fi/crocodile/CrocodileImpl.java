package my_own_fi.crocodile;

/**
 * Testing class for functional Interfaces
 */
public class CrocodileImpl {

    public static void main(String[] args) {

        Crocodile crocodile = new Crocodile() {  //This may be looked like expression above with lambda
            @Override
            public void eatMeat(int amount) {
                System.out.println("Crocodile eats meat within " + amount + " kgs every day");
            }
        };

        Crocodile crocodile1 = amount -> System.out.println
                ("Crocodile eats meat within " + amount +
                          " kgs every day"); //Replaced the same expression from interface by lambda

        crocodile.eatMeat(8); //Calling abstract method from interface


        System.out.println(crocodile.swim()); //Calling default method
        System.out.println(crocodile.lie(5)); //Calling default method
    }

}
