package fr.mrqsdf.datapacklib.structure.structure.startheight;

import fr.mrqsdf.datapacklib.structure.structure.StartHeight;
import fr.mrqsdf.datapacklib.structure.structure.startheight.value.Value;

import java.util.HashMap;

public class BiasedToBottomStartHeight extends StartHeight {


    public BiasedToBottomStartHeight(Value minInclusive, Value maxInclusive, int inner, boolean veryBiased) {
        this.min_inclusive = new HashMap<>(){
            {
                put(minInclusive.name, minInclusive.value);
            }
        };
        this.max_inclusive = new HashMap<>(){
            {
                put(maxInclusive.name, maxInclusive.value);
            }
        };
        this.inner = inner;
        this.type = veryBiased ? "minecraft:very_biased_to_bottom" : "minecraft:biased_to_bottom";
    }
}
