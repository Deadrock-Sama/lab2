package Moves;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends SpecialMove {

    public SandAttack() {
        super(Type.GROUND, 0, 100);
    }
    @Override
    protected String describe() {
        return "использует Sand attack";
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ACCURACY, 1);
    }
}
