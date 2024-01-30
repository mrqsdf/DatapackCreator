package fr.mrqsdf.datapacklib.advancement.criteria;

import fr.mrqsdf.datapacklib.advancement.conditions.Conditions;

import java.util.HashMap;

public class AllayDropItemOnBlock extends Criteria{

    public AllayDropItemOnBlock(Conditions playerLegacy, Conditions LocationLegacy) {
        this.trigger = "minecraft:allay_drop_item_on_block";
        this.conditions = new HashMap<>(){{
            put("player",playerLegacy);
            put("location",LocationLegacy);
        }};
    }


}
