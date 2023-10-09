package Pokemons;

import Moves.IceBeam;
import Moves.ShadowPunch;
import Moves.ThunderShock;
import ru.ifmo.se.pokemon.*;

import java.util.LinkedList;
import java.util.List;

    public class Tailow extends Pokemon {

        private String name;
        private List<Type> types;
        private List<Move> moves;
        private Move preparedMove;
        private Effect stage;
        private Effect condition;
        private List<Effect> effects;
        private int confusion;
        private int level;
        private double[] base;

        public Tailow(String var1, int var2) {
            super(var1, var2);
            types = new LinkedList();
            moves = new LinkedList();
            stage = new Effect();
            condition = new Effect();
            effects = new LinkedList();
            level = 1;
            base = new double[Stat.values().length];
            types.add(Type.NORMAL);
            types.add(Type.FLYING);
            moves.add(new IceBeam());
            moves.add(new ShadowPunch());
            moves.add(new ThunderShock());

            setStats(45, 55, 30, 30, 30, 85);
        }
    }

