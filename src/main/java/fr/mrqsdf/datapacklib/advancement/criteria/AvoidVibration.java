package fr.mrqsdf.datapacklib.advancement.criteria;

import fr.mrqsdf.datapacklib.advancement.conditions.LegacyConditions;

import java.util.HashMap;

public class AvoidVibration extends Criteria{

    public AvoidVibration(LegacyConditions playerLegacy) {
        this.trigger = "minecraft:avoid_vibration";
        this.conditions = new HashMap<>(){{
            put("player",playerLegacy);
        }};
    }

}
