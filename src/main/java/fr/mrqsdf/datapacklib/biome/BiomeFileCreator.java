package fr.mrqsdf.datapacklib.biome;

import fr.mrqsdf.datapacklib.biome.effect.AdditionsSound;
import fr.mrqsdf.datapacklib.biome.effect.MoodSound;
import fr.mrqsdf.datapacklib.biome.effect.Music;
import fr.mrqsdf.datapacklib.biome.effect.Particle;

import java.util.List;

public class BiomeFileCreator {

    private String files = "";
    private String name;
    private BiomeFile biomeFile;



    public BiomeFileCreator(String name, BiomeFile biomeFile) {
        this.name = name;
        this.biomeFile = biomeFile;
        files += "{\n";
        files += "temperature: " + biomeFile.getTemperature() + ",\n";
        files += "downfall: " + biomeFile.getDownfall() + ",\n";
        files += "precipitation: " + biomeFile.isPrecipitation() + ",\n";
        files += "temperature_modifier: \"" + biomeFile.getTemperatureModifier().getName() + ",\"\n";
        files += "creature_spawn_probability: " + biomeFile.getCreatureSpawnProbability() + ",\n";
        addEffect();
        addSpawners();

        files += "}\n";
    }

    private void addEffect() {
        String music = "";
        String ambientSound = "";
        Music Music = biomeFile.getEffects().getMusic();
        music += "\tmusic: {\n";
        music += "\t\tsound: " + Music.getSound() + ",\n";
        music += "\t\tmin_delay: " + Music.getMin_delay() + ",\n";
        music += "\t\tmax_delay: " + Music.getMax_delay() + ",\n";
        music += "\t\treplace_current_music: " + Music.isReplace_current_music() + "\n";
        music += "\t},\n";
        String AmbientSound = biomeFile.getEffects().getAmbientSound();
        ambientSound += "\tambient_sound: \"" + AmbientSound + "\"\n";
        int skyColor = biomeFile.getEffects().getSkyColor();
        int fogColor = biomeFile.getEffects().getFogColor();
        int waterColor = biomeFile.getEffects().getWaterColor();
        int waterFogColor = biomeFile.getEffects().getWaterFogColor();
        int grassColor = biomeFile.getEffects().getGrassColor();
        int foliageColor = biomeFile.getEffects().getFoliageColor();
        String grassColorModifier = biomeFile.getEffects().getGrassColorModifier().getName();
        Particle Particle = biomeFile.getEffects().getParticle();
        String particle = "";
        particle += "\tparticle: {\n";
        particle += "\t\toptions: {\n";
        particle += "\t\t\ttype: " + Particle.getType() + "\n";
        particle += "\t\t},\n";
        particle += "\t\tprobability: " + Particle.getProbability() + "\n";
        particle += "\t},\n";
        MoodSound MoodSound = biomeFile.getEffects().getMoodSound();
        String moodSound = "";
        moodSound += "\tmood_sound: {\n";
        moodSound += "\t\tsound: " + MoodSound.getSound() + ",\n";
        moodSound += "\t\ttick_delay: " + MoodSound.getTick_delay() + ",\n";
        moodSound += "\t\tblock_search_extent: " + MoodSound.getBlock_search_extent() + ",\n";
        moodSound += "\t\toffset: " + MoodSound.getOffset() + "\n";
        moodSound += "\t},\n";
        AdditionsSound AdditionsSound = biomeFile.getEffects().getAdditionsSound();
        String additionsSound = "";
        additionsSound += "\tadditions_sound: {\n";
        additionsSound += "\t\tsound: " + AdditionsSound.getSound() + ",\n";
        additionsSound += "\t\ttick_chance: " + AdditionsSound.getTick_chance() + "\n";
        additionsSound += "\t}\n";
        String effects = "";
        effects += "effects: {\n";
        effects += "\tsky_color: " + skyColor + ",\n";
        effects += "\tfog_color: " + fogColor + ",\n";
        effects += "\twater_color: " + waterColor + ",\n";
        effects += "\twater_fog_color: " + waterFogColor + ",\n";
        effects += "\tgrass_color: " + grassColor + ",\n";
        effects += "\tfoliage_color: " + foliageColor + ",\n";
        effects += "\tgrass_color_modifier: \"" + grassColorModifier + ",\"\n";
        effects += ambientSound;
        effects += music;
        effects += particle;
        effects += moodSound;
        effects += additionsSound;
        effects += "},\n";
        files += effects;
    }
    private void addSpawners() {
        Spawners Spawners = biomeFile.getSpawners();
        String spawners = "";
        spawners += "spawners: {\n";
        for (String string : Spawners.getSpawners().keySet()) {
            List<fr.mrqsdf.datapacklib.biome.Spawners.Spawn> spawns = Spawners.getSpawners().get(string);
            spawners += "\t" + string + ": [\n";
            for (fr.mrqsdf.datapacklib.biome.Spawners.Spawn spawn : spawns) {
                spawners += "\t\t{\n";
                spawners += "\t\t\ttype: \"" + spawn.getType() + ",\n";
                spawners += "\t\t\tweight: " + spawn.getWeight() + ",\n";
                spawners += "\t\t\tmin_count: " + spawn.getMinCount() + ",\n";
                spawners += "\t\t\tmax_count: " + spawn.getMaxCount() + "\n";
                spawners += "\t\t},\n";
            }
            spawners += "\t],\n";

        }
    }

}
