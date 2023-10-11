package Moves;

import ru.ifmo.se.pokemon.*;

public class ThunderShock extends SpecialMove {

    public ThunderShock() {
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    protected String describe() {
        return "использует Thunder shock";
    }

    protected void applyOppEffects(Pokemon var1) {
        Effect effect = new Effect().chance(0.1).turns(1).condition(Status.PARALYZE);
        var1.addEffect(effect);
    }

}
