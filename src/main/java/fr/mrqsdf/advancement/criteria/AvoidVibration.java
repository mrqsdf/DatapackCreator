package fr.mrqsdf.advancement.criteria;

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

    public Map<String, LegacyConditions> conditions;

    public Map<String, LegacyConditions> getConditions() {
        return conditions;
    }

}
