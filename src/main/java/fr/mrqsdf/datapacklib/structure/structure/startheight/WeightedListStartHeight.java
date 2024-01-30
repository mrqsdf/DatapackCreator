package fr.mrqsdf.datapacklib.structure.structure.startheight;

import fr.mrqsdf.datapacklib.structure.structure.StartHeight;

import java.util.List;

public class WeightedListStartHeight extends StartHeight {

    public WeightedListStartHeight(List<Distribution> list) {
        this.distribution = list;
        this.type = "minecraft:weighted_list";
    }
}
