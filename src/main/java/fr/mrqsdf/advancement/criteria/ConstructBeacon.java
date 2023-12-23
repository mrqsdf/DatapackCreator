package fr.mrqsdf.advancement.criteria;

import fr.mrqsdf.advancement.conditions.LegacyConditions;

public class ConstructBeacon extends Criteria{

    public ConstructBeacon(LegacyConditions playerLegacy, int level) {
        this.trigger = "minecraft:construct_beacon";
        this.conditions.put("player",playerLegacy);
        this.conditions.put("level",level);
    }

}
