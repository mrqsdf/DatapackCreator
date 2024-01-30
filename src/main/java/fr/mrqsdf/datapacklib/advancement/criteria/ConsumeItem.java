package fr.mrqsdf.datapacklib.advancement.criteria;

import fr.mrqsdf.datapacklib.advancement.conditions.ItemConditions;
import fr.mrqsdf.datapacklib.advancement.conditions.LegacyConditions;

public class ConsumeItem extends Criteria{

    public ConsumeItem(LegacyConditions playerLegacy, ItemConditions itemConditions) {
        this.trigger = "minecraft:consume_item";
        this.conditions.put("player",playerLegacy);
        this.conditions.put("item",itemConditions);
    }

}
