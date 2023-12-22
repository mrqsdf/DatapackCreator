package fr.mrqsdf;

import fr.mrqsdf.advancement.*;
import fr.mrqsdf.advancement.conditions.LegacyConditions;
import fr.mrqsdf.advancement.criteria.AllayDropItemOnBlock;
import fr.mrqsdf.advancement.criteria.Criteria;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatapackCreatorLib {

    public static int DATAPACK_VERSION = 26;
    public static String DATAPACK_NAME = null;
    public static JavaPlugin PLUGIN = null;
    public static final List<Advancement> ADVANCEMENTS = new ArrayList<>();
    public static final String PLUGIN_DATAPACK_FOLDER = "world/datapacks/" + DATAPACK_NAME + "/data/" + PLUGIN.getName();
    public static final String BUKKIT_DATAPACK_FOLDER = "world/datapacks/bukkit/data/"+PLUGIN.getName();
    public static boolean isBukkit = false;

    public static void initLib(JavaPlugin plugin, String datapackName, int datapackVersion, boolean isBukkit) {
        PLUGIN = plugin;
        DATAPACK_NAME = datapackName;
        DATAPACK_VERSION = datapackVersion;
        DatapackCreatorLib.isBukkit = isBukkit;
        Map<String, Criteria> criteriaMap = new HashMap<>();
        criteriaMap.put("test", new AllayDropItemOnBlock(new LegacyConditions()));
        Advancement advancementTest = new Advancement("test",new Display("title", "description", "test", new Icon(), BackGround.BEDROCK, Frame.TASK, true, true, false),"minecraft:story/root", criteriaMap, null,null,false);
        ADVANCEMENTS.add(advancementTest);
        if (!isBukkit){
            PackMcMeta.createPackMcMeta();
        }
        for (Advancement advancement : ADVANCEMENTS) {
            advancement.createAdvancement(advancement);
        }


        Bukkit.reloadData();
    }

    public static void addAdvancement(Advancement advancement) {
        ADVANCEMENTS.add(advancement);
    }

    public static void createAdvancements() {
        for (Advancement advancement : ADVANCEMENTS) {
            //advancement.createAdvancement();
        }
    }

}
