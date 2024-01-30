package fr.mrqsdf.datapacklib.advancement.criteria;

import org.bukkit.World;

public class ChangedDimension extends Criteria {

    public ChangedDimension(World dimensionFrom, World dimensionTo) {
        this.trigger = "minecraft:changed_dimension";
        this.conditions.put("to", dimensionTo.getKey().getNamespace() + ":" + dimensionTo.getKey().getKey().toLowerCase());
        this.conditions.put("from", dimensionFrom.getKey().getNamespace() + ":" + dimensionFrom.getKey().getKey().toLowerCase());
    }

}
