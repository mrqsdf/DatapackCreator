package fr.mrqsdf.datapacklib;

import fr.mrqsdf.datapacklib.advancement.*;
import fr.mrqsdf.datapacklib.advancement.conditions.LegacyConditions;
import fr.mrqsdf.datapacklib.advancement.criteria.AllayDropItemOnBlock;
import fr.mrqsdf.datapacklib.advancement.criteria.Criteria;
import fr.mrqsdf.datapacklib.structure.StructureFile;
import fr.mrqsdf.datapacklib.structure.structure.Structure;
import fr.mrqsdf.datapacklib.structure.structureset.StructureSet;
import fr.mrqsdf.datapacklib.structure.templatepool.TemplatePool;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatapackCreatorLib {

    public static int DATAPACK_VERSION = 26;
    public static String DATAPACK_NAME;
    public static JavaPlugin PLUGIN;
    public static List<Advancement> ADVANCEMENTS = new ArrayList<>();
    public static String PLUGIN_DATAPACK_FOLDER;
    public static String BUKKIT_DATAPACK_FOLDER;
    public static boolean isBukkit = false;
    public static List<TemplatePool> templatePools = new ArrayList<>();
    public static List<StructureSet> structureSets = new ArrayList<>();
    public static List<Structure> structures = new ArrayList<>();

    public static void initLib(JavaPlugin plugin, String datapackName, int datapackVersion, boolean isBukkit) {
        PLUGIN = plugin;
        DATAPACK_NAME = datapackName.toLowerCase();
        DATAPACK_VERSION = datapackVersion;
        DatapackCreatorLib.isBukkit = isBukkit;
        PLUGIN_DATAPACK_FOLDER = "world/datapacks/" + DATAPACK_NAME + "/data/" + DATAPACK_NAME;
        BUKKIT_DATAPACK_FOLDER = "world/datapacks/bukkit/data/"+DATAPACK_NAME;
        StructureFile.createDatapackFile();
        Map<String, Criteria> criteriaMap = new HashMap<>();
        criteriaMap.put("test", new AllayDropItemOnBlock(new LegacyConditions(), new LegacyConditions()));
        Advancement advancementTest = new Advancement("test",new Display("title", "description", "test", new Icon(), BackGround.BEDROCK, Frame.TASK, true, true, false),"minecraft:story/root", criteriaMap, null,null,false);
        //ADVANCEMENTS.add(advancementTest);
        File file = isBukkit ? new File(BUKKIT_DATAPACK_FOLDER + "/advancements") : new File(PLUGIN_DATAPACK_FOLDER + "/advancements");
        if (!file.exists()){
            file.mkdirs();
        }
        if (!isBukkit){
            PackMcMeta.createPackMcMeta();
        }



        Bukkit.reloadData();
    }

    public static void setAdvancements(List<Advancement> advancement) {
        ADVANCEMENTS = advancement;
    }
    public static void setTemplatePools(List<TemplatePool> templatePools) {
        DatapackCreatorLib.templatePools = templatePools;
    }
    public static void setStructureSets(List<StructureSet> structureSets) {
        DatapackCreatorLib.structureSets = structureSets;
    }
    public static void setStructures(List<Structure> structures) {
        DatapackCreatorLib.structures = structures;
    }

}
