package Moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {

    public IceBeam() {
        super(Type.ICE, 90, 100);
    }
    @Override
    protected String describe() {
        return "Ice beam";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = (new Effect()).condition(Status.FREEZE).chance(0.1).turns(1);
        pokemon.addEffect(effect);
    }
}
