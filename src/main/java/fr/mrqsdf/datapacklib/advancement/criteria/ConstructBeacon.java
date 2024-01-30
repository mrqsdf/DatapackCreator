package fr.mrqsdf.datapacklib.advancement.criteria;

import fr.mrqsdf.datapacklib.advancement.conditions.LegacyConditions;

public class ConstructBeacon extends Criteria{

    public ConstructBeacon(LegacyConditions playerLegacy, int level) {
        this.trigger = "minecraft:construct_beacon";
        this.conditions.put("player",playerLegacy);
        this.conditions.put("level",level);
    }

}
