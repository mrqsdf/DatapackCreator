package fr.mrqsdf.datapacklib.advancement.conditions;

import org.bukkit.enchantments.Enchantment;

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
