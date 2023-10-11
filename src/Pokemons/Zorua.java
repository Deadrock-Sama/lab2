package Pokemons;

import Moves.Confusion;
import Moves.ShadowPunch;
import ru.ifmo.se.pokemon.*;

import java.util.LinkedList;
import java.util.List;

public class Zorua extends Pokemon {

    public Zorua(String var1, int var2) {

        super(var1, var2);
        setType(Type.DARK);
        setMove(new ShadowPunch(), new Confusion());
        setStats(40,65,40,80,40,65);

    }
}
