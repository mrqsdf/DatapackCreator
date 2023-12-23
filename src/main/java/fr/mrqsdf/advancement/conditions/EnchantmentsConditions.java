package fr.mrqsdf.advancement.conditions;

import org.bukkit.enchantments.Enchantment;

import java.util.Map;

public class EnchantmentsConditions extends Conditions{

    protected String enchantment;
    protected int levels;

    public void setEnchantment(Enchantment enchantment) {
        this.enchantment = "minecraft:" + enchantment.getKey().getKey().toLowerCase();
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }


}
