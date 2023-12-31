package Moves;

import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove {

    public Confusion() {
        super(Type.PSYCHIC, 50, 100);
    }
    @Override
    protected String describe() {
        return "использует Confusion";
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.confuse();
        System.out.println("Покемон впадает в замешательство");
    }
}
