package fr.mrqsdf.datapacklib.biome;

import fr.mrqsdf.datapacklib.biome.effect.BiomeEffects;

import java.util.Map;

public class BiomeFile {

    private double temperature;
    private double downfall;
    private boolean has_precipitation = false;
    private String temperature_modifier = TemperatureModifier.UNSET.getName();
    private double creature_spawn_probability = 0;
    private BiomeEffects effects = new BiomeEffects();
    private Spawners spawners = new Spawners();
    private Map<String, Map<String, Double>> spawn_costs;
    //todo ajouté carvers et place feature dans le future

    public BiomeFile(){

    }

    public BiomeFile(int temperature, int downfall, boolean precipitation, String temperatureModifier, double creatureSpawnProbability, BiomeEffects effects, Spawners spawners, Map<String, Map<String, Double>> spawn_costs) {
        this.temperature = temperature;
        this.downfall = downfall;
        this.has_precipitation = precipitation;
        this.temperature_modifier = temperatureModifier;
        this.creature_spawn_probability = creatureSpawnProbability;
        this.effects = effects;
        this.spawners = spawners;
        this.spawn_costs = spawn_costs;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getDownfall() {
        return downfall;
    }

    public void setDownfall(double downfall) {
        this.downfall = downfall;
    }

    public boolean isPrecipitation() {
        return has_precipitation;
    }

    public void setPrecipitation(boolean precipitation) {
        this.has_precipitation = precipitation;
    }

    public TemperatureModifier getTemperatureModifier() {
        return TemperatureModifier.valueOf(temperature_modifier);
    }

    public void setTemperatureModifier(TemperatureModifier temperatureModifier) {
        this.temperature_modifier = temperatureModifier.getName();
    }

    public double getCreatureSpawnProbability() {
        return creature_spawn_probability;
    }

    public void setCreatureSpawnProbability(double creatureSpawnProbability) {
        if (creatureSpawnProbability > 1 || creatureSpawnProbability < 0){
            throw new IllegalArgumentException("creatureSpawnProbability must be between 0 and 1");
        }
        this.creature_spawn_probability = creatureSpawnProbability;
    }

    public BiomeEffects getEffects() {
        return effects;
    }

    public void setEffects(BiomeEffects effects) {
        this.effects = effects;
    }

    public Spawners getSpawners() {
        return spawners;
    }

    public void setSpawners(Spawners spawners) {
        this.spawners = spawners;
    }

    public Map<String, Map<String, Double>> getSpawn_costs() {
        return spawn_costs;
    }

    public void setSpawn_costs(Map<String, Map<String, Double>> spawn_costs) {
        this.spawn_costs = spawn_costs;
    }

    public static enum TemperatureModifier {
        UNSET(null),
        NONE("none"),
        FROZEN("frozen");

        private final String name;

        private TemperatureModifier(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }


}
