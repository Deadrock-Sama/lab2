package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DragonRage extends SpecialMove {

    public DragonRage() {
        super(Type.DRAGON, 0, 100);
    }
    @Override
    protected String describe() {
        return "Dragon rage";
    }
    protected void applyOppDamage(Pokemon var1) {
        var1.setMod(Stat.HP, 40);
    }
}
