package fr.mrqsdf.datapacklib.structure.structure.startheight.value;

public class BelowTopValue extends Value{

    public BelowTopValue(int value) {
        this.value = value < -2048 ? -2048 : Math.min(value, 2047);
        this.name = "below_top";
    }

}
