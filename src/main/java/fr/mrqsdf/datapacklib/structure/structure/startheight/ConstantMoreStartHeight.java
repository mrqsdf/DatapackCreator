package fr.mrqsdf.datapacklib.structure.structure.startheight;

import fr.mrqsdf.datapacklib.structure.structure.StartHeight;
import fr.mrqsdf.datapacklib.structure.structure.startheight.value.Value;

import java.util.HashMap;

public class ConstantMoreStartHeight extends StartHeight {

    public ConstantMoreStartHeight(Value value) {
        this.value = new HashMap<>(){
            {
                put(value.name, value.value);
            }
        };
        this.type = "minecraft:constant";
    }

}
