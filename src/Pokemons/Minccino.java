package Pokemons;

import Moves.Confusion;
import Moves.DragonRage;
import Moves.Flamethrower;
import Moves.ShadowPunch;
import ru.ifmo.se.pokemon.*;

import java.util.LinkedList;
import java.util.List;

public class Minccino extends Pokemon {

    public Minccino(String var1, int var2) {

        super(var1, var2);
        setType(Type.NORMAL);
        setMove(new ShadowPunch(), new Confusion(),new DragonRage(),new Flamethrower());

        setStats(55, 50, 40,40,40,75);

    }
}
