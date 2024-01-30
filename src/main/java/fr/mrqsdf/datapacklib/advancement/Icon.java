package fr.mrqsdf.datapacklib.advancement;

import org.bukkit.inventory.ItemStack;

public class Icon {

    public String item;
    public String nbt;

    public Icon(String item, String nbt) {
        this.item = item;
        this.nbt = nbt;
    }
    public Icon(String item) {
        this.item = item;
        this.nbt = "";
    }
    public Icon() {
        this.item = "minecraft:stone";
        this.nbt = "";
    }
    @Deprecated
    public Icon(ItemStack item) {
        this.item = "minecraft:" + item.getType().name().toLowerCase();
        this.nbt = "";
    }

}
