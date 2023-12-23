package fr.mrqsdf.advancement.criteria;

import fr.mrqsdf.advancement.conditions.Conditions;
import fr.mrqsdf.advancement.conditions.LegacyConditions;

import java.util.HashMap;
import java.util.Map;

public class AvoidVibration extends Criteria{

    public AvoidVibration(LegacyConditions playerLegacy) {
        this.trigger = "minecraft:avoid_vibration";
        this.conditions = new HashMap<>(){{
            put("player",playerLegacy);
        }};
    }

}
