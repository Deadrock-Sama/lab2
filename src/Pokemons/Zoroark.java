package Pokemons;

import Moves.Confusion;
import Moves.DragonRage;
import Moves.ShadowPunch;
import ru.ifmo.se.pokemon.*;

import java.util.LinkedList;
import java.util.List;

public class Zoroark extends Pokemon {

    public Zoroark(String var1, int var2) {

        super(var1, var2);

        if (var2 < minZoroarkLevel) {
            setLevel(minZoroarkLevel);
        }

        setType(Type.DARK);
        setMove(new ShadowPunch(), new Confusion(), new DragonRage());
        setStats(60,105,60,120,60,105);

    }

    public Zoroark(String var1, int var2, Zorua zorua) {

       super(var1, var2);
       previousForm = zorua;

    }
    private int minZoroarkLevel = 30;
    private Zorua previousForm;
}
