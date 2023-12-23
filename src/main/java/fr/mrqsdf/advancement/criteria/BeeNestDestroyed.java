package fr.mrqsdf.advancement.criteria;

import fr.mrqsdf.advancement.conditions.Conditions;
import fr.mrqsdf.advancement.conditions.ItemConditions;
import fr.mrqsdf.advancement.conditions.LegacyConditions;
import org.bukkit.Material;

public class BeeNestDestroyed extends Criteria{

    public BeeNestDestroyed(LegacyConditions playerLegacy, Material blockDestroyed, int numBeesInside, ItemConditions itemConditions) {
        trigger = "minecraft:bee_nest_destroyed";
        conditions.put("player",playerLegacy);
        conditions.put("block",blockDestroyed.getKey().getNamespace().toLowerCase()  +":" + blockDestroyed.getKey().getKey().toLowerCase());
        conditions.put("num_bees_inside",numBeesInside);
        conditions.put("item",itemConditions);
    }





}
