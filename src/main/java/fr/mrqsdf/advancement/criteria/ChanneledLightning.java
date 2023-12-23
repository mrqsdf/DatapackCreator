package fr.mrqsdf.advancement.criteria;

import fr.mrqsdf.advancement.conditions.LegacyConditions;

import java.util.List;

public class ChanneledLightning extends Criteria{

    public ChanneledLightning(LegacyConditions playerLegacy, List<LegacyConditions> victimLegacy) {
        this.trigger = "minecraft:channeled_lightning";
        this.conditions.put("player",playerLegacy);
        this.conditions.put("victim",victimLegacy);
    }

}
