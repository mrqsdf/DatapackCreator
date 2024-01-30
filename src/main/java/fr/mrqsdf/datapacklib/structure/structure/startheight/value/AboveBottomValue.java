package fr.mrqsdf.datapacklib.structure.structure.startheight.value;

public class AboveBottomValue extends Value {
    public AboveBottomValue(int value) {
        this.value = value < -2048 ? -2048 : Math.min(value, 2047);
        this.name = "above_bottom";
    }
}
