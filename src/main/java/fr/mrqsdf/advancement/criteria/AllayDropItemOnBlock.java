package fr.mrqsdf.advancement.criteria;

import fr.mrqsdf.advancement.conditions.LegacyConditions;

import java.util.HashMap;
import java.util.Map;

public class AllayDropItemOnBlock extends Criteria{

    public AllayDropItemOnBlock(LegacyConditions playerLegacy) {
        this.trigger = "minecraft:allay_drop_item_on_block";
        this.conditions = new HashMap<>(){{
            put("player",playerLegacy);
        }};
    }
    public Map<String, LegacyConditions> conditions;

    public Map<String, LegacyConditions> getConditions() {
        return conditions;
    }

}
