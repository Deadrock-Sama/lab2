package Pokemons;

import Moves.SandAttack;
import Moves.ShadowPunch;
import Moves.Splash;
import Moves.Tackle;
import ru.ifmo.se.pokemon.*;

import java.util.LinkedList;
import java.util.List;

public class Duskull extends Pokemon {

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

    public Duskull(String var1, int var2) {

        super(var1, var2);
        types = new LinkedList();
        moves = new LinkedList();
        stage = new Effect();
        condition = new Effect();
        effects = new LinkedList();
        level = 1;
        base = new double[Stat.values().length];
        types.add(Type.GHOST);
        moves.add(new Tackle());
        moves.add(new SandAttack());
        moves.add(new ShadowPunch());
        moves.add(new Splash());

        setStats(20, 40, 90, 30, 90, 25);
    }
}
