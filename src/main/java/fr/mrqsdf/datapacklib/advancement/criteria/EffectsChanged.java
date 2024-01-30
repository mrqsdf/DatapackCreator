package fr.mrqsdf.datapacklib.advancement.criteria;

import fr.mrqsdf.datapacklib.advancement.conditions.LegacyConditions;

import java.util.Map;

public class EffectsChanged extends Criteria{

    public EffectsChanged(LegacyConditions playerLegacy, Map<String, Map<String, Object>> effects, LegacyConditions sourceLegacy) {
        this.trigger = "minecraft:effects_changed";
        this.conditions.put("player",playerLegacy);
        this.conditions.put("effects",effects);
        this.conditions.put("source",sourceLegacy);
    }

}
