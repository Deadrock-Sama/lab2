package Moves;

import ru.ifmo.se.pokemon.*;

public class ShadowPunch extends PhysicalMove {
    public ShadowPunch() { super(Type.GHOST, 60, Double.POSITIVE_INFINITY); }
    @Override
    protected String describe() { return "использует Shadow punch"; }
}
