package fr.mrqsdf.datapacklib.structure.structure.startheight.value;

public class AbsoluteValue extends Value {
    public AbsoluteValue(int value) {
        this.value = value < -2048 ? -2048 : Math.min(value, 2047);
        this.name = "absolute";
    }
}
