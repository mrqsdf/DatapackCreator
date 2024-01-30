package fr.mrqsdf.datapacklib;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.mrqsdf.datapacklib.advancement.*;
import fr.mrqsdf.datapacklib.advancement.conditions.ItemConditions;
import fr.mrqsdf.datapacklib.advancement.conditions.LegacyConditions;
import fr.mrqsdf.datapacklib.advancement.criteria.BeeNestDestroyed;
import fr.mrqsdf.datapacklib.advancement.criteria.Criteria;
import fr.mrqsdf.datapacklib.structure.StructureFile;
import fr.mrqsdf.datapacklib.structure.StructureNBTFiles;
import fr.mrqsdf.datapacklib.structure.structure.Structure;
import fr.mrqsdf.datapacklib.structure.structure.startheight.ConstantStartHeight;
import fr.mrqsdf.datapacklib.structure.structure.startheight.value.AbsoluteValue;
import fr.mrqsdf.datapacklib.structure.structureset.Placement;
import fr.mrqsdf.datapacklib.structure.structureset.StructureSet;
import fr.mrqsdf.datapacklib.structure.structureset.Structures;
import fr.mrqsdf.datapacklib.structure.templatepool.Elements;
import fr.mrqsdf.datapacklib.structure.templatepool.TemplatePool;
import fr.mrqsdf.datapacklib.structure.templatepool.element.Element;
import fr.mrqsdf.datapacklib.structure.templatepool.element.SingleElement;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main extends JavaPlugin {

    public static void main(String[] args) {
        /*Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Advancement.class, new AdvancementSerialisation())
                .create();
        Map<String, Criteria> criteriaMap = new HashMap<>();
        criteriaMap.put("test", new BeeNestDestroyed(new LegacyConditions(), Material.BEE_NEST, 1, new ItemConditions()));
        Advancement advancementTest = new Advancement("test",new Display("title", "description", "test", new Icon(), BackGround.BEDROCK, Frame.TASK, true, true, false),"minecraft:story/root", criteriaMap, null,null,false);
        System.out.println(gson.toJson(advancementTest));*/

        StructureNBTFiles files = new StructureNBTFiles("gate", null, StructureFile.getStructureFile("gate"));
        System.out.println(files.inputStream);
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }
    @Override
    public void onEnable() {

        DatapackCreatorLib.initLib(this, this.getName(), 15, false);
        Map<String, Criteria> criteriaMap = new HashMap<>();
        criteriaMap.put("test", new BeeNestDestroyed(new LegacyConditions(), Material.BEE_NEST, 1, new ItemConditions()));
        Advancement advancementTest = new Advancement("test",new Display("title", "description", "test", new Icon(), BackGround.BEDROCK, Frame.TASK, true, true, false),"minecraft:story/root", criteriaMap, null,null,false);
        DatapackCreatorLib.ADVANCEMENTS.add(advancementTest);
        for (Advancement advancement : DatapackCreatorLib.ADVANCEMENTS) {
            advancement.createAdvancement(advancement);
        }
        StructureFile.createDatapackFile();
        StructureNBTFiles structureNBTFiles = new StructureNBTFiles("gate", "test/test", StructureFile.getStructureFile("gate"));
        StructureFile.addStructureFileNBT(structureNBTFiles);
        TemplatePool templatePool = new TemplatePool(null, "gate", DatapackCreatorLib.DATAPACK_NAME +":test/test","minecraft:empty", new ArrayList<Elements>(){{
            add(new Elements(1, new SingleElement(Element.Projection.RIGID, DatapackCreatorLib.DATAPACK_NAME +":test/test/gate", "minecraft:empty")));
        }});
        DatapackCreatorLib.templatePools.add(templatePool);
        StructureSet structureSet = new StructureSet(null,"gate" ,new Placement(null, Placement.PlacementType.RANDOM_SPREAD, 19011220, Placement.FrequencyReductionMethod.UNSET, null,null, Placement.SpreadType.TRIANGULAR, 34,8), new ArrayList<Structures>(){{
            add(new Structures(1,DatapackCreatorLib.DATAPACK_NAME + ":gate"));
        }});
        DatapackCreatorLib.structureSets.add(structureSet);
        Structure structure = new Structure(null, "gate", Structure.StructureType.JIGSAW, new ArrayList<>(){{add("minecraft:plains");}}, false,null, new ConstantStartHeight(new AbsoluteValue(1)),DatapackCreatorLib.DATAPACK_NAME + ":gate", Structure.GenerationStep.SURFACE_STRUCTURES, Structure.TerrainAdaptation.BEARD_THIN, 7, Structure.ProjectStartToHeightmap.WORLD_SURFACE_WG, 116,false, null);
        DatapackCreatorLib.structures.add(structure);
        StructureFile.createTemplatePoolFile();
        StructureFile.createStructureSetFile();
        StructureFile.createStructureFile();

    }
    @Override
    public void onDisable() {
        super.onDisable();
    }
}
