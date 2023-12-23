package fr.mrqsdf.advancement.criteria;

import fr.mrqsdf.advancement.conditions.Conditions;
import org.bukkit.potion.PotionType;

public class BrewedPotion extends Criteria{

    public BrewedPotion(PotionType potion) {
        this.trigger = "minecraft:brewed_potion";
        this.conditions.put("potion","minecraft:" + potion.getKey().getKey().toLowerCase());
    }

}
