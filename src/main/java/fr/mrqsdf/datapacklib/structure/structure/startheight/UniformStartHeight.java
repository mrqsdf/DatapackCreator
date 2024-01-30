package fr.mrqsdf.datapacklib.structure.structure.startheight;

import fr.mrqsdf.datapacklib.structure.structure.StartHeight;
import fr.mrqsdf.datapacklib.structure.structure.startheight.value.Value;

import java.util.HashMap;

public class UniformStartHeight extends StartHeight {

    public UniformStartHeight(Value minInclusive, Value maxInclusive) {
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
        this.type = "minecraft:uniform";
    }

}
