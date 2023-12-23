package fr.mrqsdf;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.mrqsdf.advancement.*;
import fr.mrqsdf.advancement.conditions.ItemConditions;
import fr.mrqsdf.advancement.conditions.LegacyConditions;
import fr.mrqsdf.advancement.criteria.AllayDropItemOnBlock;
import fr.mrqsdf.advancement.criteria.BeeNestDestroyed;
import fr.mrqsdf.advancement.criteria.Criteria;
import org.bukkit.Material;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Advancement.class, new AdvancementSerialisation())
                .create();
        Map<String, Criteria> criteriaMap = new HashMap<>();
        criteriaMap.put("test", new BeeNestDestroyed(new LegacyConditions(), Material.BEE_NEST, 1, new ItemConditions()));
        Advancement advancementTest = new Advancement("test",new Display("title", "description", "test", new Icon(), BackGround.BEDROCK, Frame.TASK, true, true, false),"minecraft:story/root", criteriaMap, null,null,false);
        System.out.println(gson.toJson(advancementTest));
    }

}
