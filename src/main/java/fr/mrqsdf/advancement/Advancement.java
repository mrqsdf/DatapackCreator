package fr.mrqsdf.advancement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.mrqsdf.DatapackCreatorLib;
import fr.mrqsdf.advancement.criteria.Criteria;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Advancement {

    public transient String nameFile;
    public Display display = null;
    public String parent = null;
    public Map<String ,Criteria> criteria = new HashMap<>();
    public List<List<String>> requirements = null;
    public Rewards rewards = null;
    public boolean telemetry = false;


    public Advancement(String nameFile,Display display, String parent,Map<String, Criteria> criteria, List<List<String>> requirements, Rewards rewards,  boolean telemetry) {
        this.nameFile = nameFile;
        this.display = display;
        this.parent = parent;
        this.criteria = criteria;
        this.requirements = requirements;
        this.rewards = rewards;
        this.telemetry = telemetry;
    }
    public Advancement(){

    }

    public Display getDisplay() {
        return display;
    }

    public String getParent() {
        return parent;
    }

    public Map<String,Criteria> getCriteria() {
        return criteria;
    }
    public List<List<String>> getRequirements() {
        return requirements;
    }

    public Rewards getRewards() {
        return rewards;
    }

    public boolean isTelemetry() {
        return telemetry;
    }

    public void createAdvancement(Advancement advancement){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Advancement.class, new AdvancementSerialisation())
                .create();
        try {
            FileWriter writer = null;
            if (DatapackCreatorLib.isBukkit){
                writer = new FileWriter(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/advancements/"+ nameFile+".json");
            }
            writer.write(gson.toJson(advancement));
            writer.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
