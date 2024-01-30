package fr.mrqsdf.datapacklib.advancement.criteria;

import org.bukkit.potion.PotionType;

public class BrewedPotion extends Criteria{

    public BrewedPotion(PotionType potion) {
        this.trigger = "minecraft:brewed_potion";
        this.conditions.put("potion","minecraft:" + potion.getKey().getKey().toLowerCase());
    }

}
