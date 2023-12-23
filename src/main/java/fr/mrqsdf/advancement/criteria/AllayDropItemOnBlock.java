package fr.mrqsdf.advancement.criteria;

import fr.mrqsdf.advancement.conditions.Conditions;
import fr.mrqsdf.advancement.conditions.LegacyConditions;

import java.util.HashMap;
import java.util.Map;

public class AllayDropItemOnBlock extends Criteria{

    public AllayDropItemOnBlock(Conditions playerLegacy, Conditions LocationLegacy) {
        this.trigger = "minecraft:allay_drop_item_on_block";
        this.conditions = new HashMap<>(){{
            put("player",playerLegacy);
            put("location",LocationLegacy);
        }};
    }


}
