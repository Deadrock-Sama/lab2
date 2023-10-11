package Pokemons;

import Moves.SandAttack;
import Moves.ShadowPunch;
import Moves.Splash;
import Moves.Tackle;
import ru.ifmo.se.pokemon.*;

import java.util.LinkedList;
import java.util.List;

public class Duskull extends Pokemon {

    public Duskull(String var1, int var2) {

        super(var1, var2);
        setType(Type.GHOST);
        setMove(new Tackle(), new SandAttack(), new ShadowPunch(), new Splash());
        setStats(20, 40, 90, 30, 90, 25);

    }
}
