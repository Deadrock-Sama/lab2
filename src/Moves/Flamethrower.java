package Moves;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower() {
        super(Type.FIRE, 90, 100);
    }
    @Override
    protected String describe() {
        return "использует Flamethrower";
    }

    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = (new Effect()).condition(Status.BURN).chance(0.5).turns(1);
        pokemon.addEffect(effect);
    }
}

