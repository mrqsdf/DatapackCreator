package fr.mrqsdf.datapacklib.advancement.criteria;

import fr.mrqsdf.datapacklib.advancement.conditions.LegacyConditions;

public class BredAnimals extends Criteria{

    public BredAnimals(LegacyConditions playerLegacy,LegacyConditions parentLegacy, LegacyConditions partnerLegacy, LegacyConditions childLegacy) {
        this.trigger = "minecraft:bred_animals";
        this.conditions.put("player",playerLegacy);
        this.conditions.put("parent",parentLegacy);
        this.conditions.put("partner",partnerLegacy);
        this.conditions.put("child",childLegacy);
    }

}
