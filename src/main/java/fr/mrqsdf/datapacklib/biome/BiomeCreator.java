package fr.mrqsdf.datapacklib.biome;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.mrqsdf.datapacklib.DatapackCreatorLib;
import fr.mrqsdf.datapacklib.advancement.Advancement;
import fr.mrqsdf.datapacklib.advancement.AdvancementSerialisation;
import fr.mrqsdf.datapacklib.biome.effect.BiomeEffects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BiomeCreator {

    public static void setupFile(){
        File biomeFolder = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/biome") : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER+ "/worldgen/biome");
        if (!biomeFolder.exists()){
            biomeFolder.mkdirs();
        }
    }
    public static void main(String[] strings){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Advancement.class, new AdvancementSerialisation())
                .create();
        BiomeFile biomeFile = new BiomeFile();
        biomeFile.setTemperature(0.5);
        biomeFile.setDownfall(0.5);
        biomeFile.setPrecipitation(true);
        biomeFile.setTemperatureModifier(BiomeFile.TemperatureModifier.NONE);
        biomeFile.setCreatureSpawnProbability(0.5);
        BiomeEffects biomeEffects = new BiomeEffects();
        biomeEffects.setSkyColor(255,63,255);
        biomeEffects.setFogColor(255,63,255);
        biomeEffects.setWaterColor(255,63,255);
        biomeEffects.setWaterFogColor(255,63,255);
        biomeEffects.setGrassColor(255,63,255);
        biomeEffects.setFoliageColor(255,63,255);
        biomeEffects.setGrassColorModifier(BiomeEffects.GrassColorModifier.UNSET);
        biomeFile.setEffects(biomeEffects);
        System.out.println(gson.toJson(biomeFile));


    }
    public void createBiome(BiomeFile biomeFile, String nameFile){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(Advancement.class, new AdvancementSerialisation())
                .create();
        try {
            FileWriter writer;
            if (DatapackCreatorLib.isBukkit){
                writer = new FileWriter(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/biome/"+ nameFile+".json");
            } else {
                writer = new FileWriter(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/worldgen/biome/"+ nameFile+".json");
            }
            writer.write(gson.toJson(biomeFile));
            writer.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
