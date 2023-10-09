package Pokemons;

import Moves.Confusion;
import Moves.DragonRage;
import Moves.ShadowPunch;
import ru.ifmo.se.pokemon.*;

import java.util.LinkedList;
import java.util.List;

public class Zoroark extends Pokemon {

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

    public Zoroark(String var1, int var2) {
        super(var1, var2);
        int minZoroarkLevel = 30;

        this.types = new LinkedList();
        this.moves = new LinkedList();
        this.stage = new Effect();
        this.condition = new Effect();
        this.effects = new LinkedList();
        this.level = minZoroarkLevel;
        this.base = new double[Stat.values().length];
        this.types.add(Type.DARK);
        this.moves.add(new ShadowPunch());
        this.moves.add(new Confusion());
        this.moves.add(new DragonRage());

        setStats(60,105,60,120,60,105);
    }
}
