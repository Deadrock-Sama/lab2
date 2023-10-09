package Pokemons;

import Moves.IceBeam;
import Moves.ShadowPunch;
import Moves.TakeDown;
import Moves.ThunderShock;
import ru.ifmo.se.pokemon.*;

import java.util.LinkedList;
import java.util.List;

public class Wingull extends Pokemon {
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

    public Wingull(String var1, int var2) {
        super(var1, var2);
        this.types = new LinkedList();
        this.moves = new LinkedList();
        this.stage = new Effect();
        this.condition = new Effect();
        this.effects = new LinkedList();
        this.level = 1;
        this.base = new double[Stat.values().length];
        this.types.add(Type.WATER);
        this.types.add(Type.FLYING);
        this.moves.add(new IceBeam());
        this.moves.add(new ShadowPunch());
        this.moves.add(new ThunderShock());
        this.moves.add(new TakeDown());

        setStats(40,30,30,55, 30, 85);

    }
}
