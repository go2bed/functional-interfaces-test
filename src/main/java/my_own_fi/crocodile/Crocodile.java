package my_own_fi.crocodile;

/**
 * This our own Functional Interface with
 * default methods
 */
@FunctionalInterface
public interface Crocodile {

    void eatMeat(int amount);

    default String swim() {
      return "Crocodile is swimming!";
    }

    default String lie(int time) {
        return "The crocodile is lying on a coast for " + time + " hours" ;
    }
}
