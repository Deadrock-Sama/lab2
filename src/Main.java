import Pokemons.*;
import ru.ifmo.se.pokemon.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon duskull = new Duskull("Dusya", 1);
        Pokemon tailow = new Tailow("Taila", 1);
        Pokemon wingull = new Wingull("Wingya", 1);
        Pokemon zorua = new Zorua("Zorya", 1);
        Pokemon zoroark = new Zoroark("Zor", 1);
        Pokemon minccino = new Minccino("Dusya", 15);


        b.addAlly(duskull);
        b.addAlly(tailow);
        b.addAlly(wingull);
        b.addAlly(minccino);

        b.addFoe(zoroark);
        b.addFoe(zorua);
        b.go();
    }
}