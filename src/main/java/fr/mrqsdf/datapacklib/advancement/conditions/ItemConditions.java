package fr.mrqsdf.datapacklib.advancement.conditions;

import org.bukkit.Material;
import org.bukkit.potion.PotionType;

import java.util.List;

public class ItemConditions extends Conditions{

    public List<String > items;
    public String tag;
    public int count;
    public int durability;
    public String nbt;
    public String potion;
    public List<EnchantmentsConditions> enchantments;


    public void setItems(List<String> items) {
        this.items = items;
    }
    public void addItem(Material item) {
        this.items.add("minecraft:" + item.toString().toLowerCase());
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setNbt(String nbt) {
        this.nbt = nbt;
    }

    public void setPotion(PotionType potion) {
        this.potion = "minecraft:" + potion.getKey().getKey().toLowerCase();
    }

    public void setEnchantments(List<EnchantmentsConditions> enchantments) {
        this.enchantments = enchantments;
    }
    public void addEnchantment(EnchantmentsConditions enchantment) {
        this.enchantments.add(enchantment);
    }
}
