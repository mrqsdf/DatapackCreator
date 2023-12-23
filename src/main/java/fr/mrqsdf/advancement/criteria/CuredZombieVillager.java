package fr.mrqsdf.advancement.criteria;

import fr.mrqsdf.advancement.conditions.LegacyConditions;

public class CuredZombieVillager extends Criteria{

    public CuredZombieVillager(LegacyConditions playerLegacy, LegacyConditions villagerLegacy, LegacyConditions zombieLegacy){
        this.trigger = "minecraft:cured_zombie_villager";
        this.conditions.put("player",playerLegacy);
        this.conditions.put("villager",villagerLegacy);
        this.conditions.put("zombie",zombieLegacy);
    }

}
