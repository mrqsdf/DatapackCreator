package fr.mrqsdf.datapacklib.structure.structure.startheight;

import fr.mrqsdf.datapacklib.structure.structure.StartHeight;
import fr.mrqsdf.datapacklib.structure.structure.startheight.value.Value;

import java.util.HashMap;

public class ConstantStartHeight extends StartHeight {

    public ConstantStartHeight(Value value) {
        this.value = new HashMap<>(){
            {
                put(value.name, value.value);
            }
        };
    }


}
