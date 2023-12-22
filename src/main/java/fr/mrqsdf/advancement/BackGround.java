package fr.mrqsdf.advancement;

public enum BackGround {

    STONE("minecraft:textures/block/stone.png"),
    GRANITE("minecraft:textures/block/granite.png"),
    POLISHED_GRANITE("minecraft:textures/block/polished_granite.png"),
    DIORITE("minecraft:textures/block/diorite.png"),
    POLISHED_DIORITE("minecraft:textures/block/polished_diorite.png"),
    ANDESITE("minecraft:textures/block/andesite.png"),
    POLISHED_ANDESITE("minecraft:textures/block/polished_andesite.png"),
    DEEPSLATE("minecraft:textures/block/deepslate.png"),
    COBBLED_DEEPSLATE("minecraft:textures/block/cobbled_deepslate.png"),
    POLISHED_DEEPSLATE("minecraft:textures/block/polished_deepslate.png"),
    CALCITE("minecraft:textures/block/calcite.png"),
    TUFF("minecraft:textures/block/tuff.png"),
    DRIPSTONE_BLOCK("minecraft:textures/block/dripstone_block.png"),
    GRASS_BLOCK_SIDE("minecraft:textures/block/grass_block_side.png"),
    PODZOL("minecraft:textures/block/podzol.png"),
    MYCELIUM("minecraft:textures/block/mycelium_top.png"),
    TUFF_BRICK("minecraft:textures/block/tuff_brick.png"),
    GRASS_BLOCK("minecraft:textures/block/grass.png"),
    DIRT("minecraft:textures/block/dirt.png"),
    COBBLESTONE("minecraft:textures/block/cobblestone.png"),
    OAK_PLANK("minecraft:textures/block/oak_planks.png"),
    SPRUCE_PLANK("minecraft:textures/block/spruce_planks.png"),
    BIRCH_PLANK("minecraft:textures/block/birch_planks.png"),
    JUNGLE_PLANK("minecraft:textures/block/jungle_planks.png"),
    ACACIA_PLANK("minecraft:textures/block/acacia_planks.png"),
    DARK_OAK_PLANK("minecraft:textures/block/dark_oak_planks.png"),
    CHERRY_PLANK("minecraft:textures/block/cherry_planks.png"),
    CRIMSON_PLANK("minecraft:textures/block/crimson_planks.png"),
    WARPED_PLANK("minecraft:textures/block/warped_planks.png"),
    SAPLING("minecraft:textures/block/oak_sapling.png"),
    BEDROCK("minecraft:textures/block/bedrock.png"),
    WATER("minecraft:textures/block/water_still.png"),
    LAVA("minecraft:textures/block/lava_still.png"),
    SAND("minecraft:textures/block/sand.png"),
    GRAVEL("minecraft:textures/block/gravel.png"),
    GOLD_ORE("minecraft:textures/block/gold_ore.png"),
    IRON_ORE("minecraft:textures/block/iron_ore.png"),
    COAL_ORE("minecraft:textures/block/coal_ore.png"),
    WOOD("minecraft:textures/block/oak_log.png"),
    LEAVES("minecraft:textures/block/oak_leaves.png");


    BackGround(String background) {
        this.background = background;
    }

    private final String background;

    public String getBackground() {
        return background;
    }


}
