package Pokemons;

import Moves.IceBeam;
import Moves.ShadowPunch;
import Moves.ThunderShock;
import ru.ifmo.se.pokemon.*;

import java.util.LinkedList;
import java.util.List;

    public class Tailow extends Pokemon {


        public Tailow(String var1, int var2) {
            super(var1, var2);

            setType(Type.NORMAL, Type.FLYING);
            setMove(new IceBeam(), new ShadowPunch(),new ThunderShock());
            setStats(45, 55, 30, 30, 30, 85);

        }
    }

