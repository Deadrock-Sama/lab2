package Pokemons;

import Moves.IceBeam;
import Moves.ShadowPunch;
import Moves.TakeDown;
import Moves.ThunderShock;
import ru.ifmo.se.pokemon.*;

import java.util.LinkedList;
import java.util.List;

public class Wingull extends Pokemon {

    public Wingull(String var1, int var2) {

        super(var1, var2);
        setType(Type.WATER, Type.FLYING);
        setMove(new IceBeam(), new ShadowPunch(), new ThunderShock(),new TakeDown());
        setStats(40,30,30,55, 30, 85);

    }
}
