package fr.mrqsdf.datapacklib.biome;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import java.util.List;
import java.util.Map;

public class Spawners {


    private Map<String, List<Spawn>> spawners;

    public Spawners(){

    }

    public Map<String, List<Spawn>> getSpawners() {
        return spawners;
    }

    public void setSpawners(Map<String, List<Spawn>> spawners) {
        this.spawners = spawners;
    }
    public void setSpawners(List<Spawn> spawns, CreatureType creatureType) {
        this.spawners.put(creatureType.getName(), spawns);
    }
    public void addSpawner(List<Spawn> spawns, CreatureType creatureType) {
        if (this.spawners.get(creatureType.getName()) == null){
            this.spawners.put(creatureType.getName(), spawns);
            return;
        }else {
            this.spawners.replace(creatureType.getName(), spawns);
        }

    }

    public static enum CreatureType {
        MONSTER("monster"),
        CREATURE("creature"),
        AMBIENT("ambient"),
        AXOLTOLS("axolotls"),
        UNDERGROUND_WATER_CREATURE("underground_water_creature"),
        WATER_CREATURE("water_creature"),
        WATER_AMBIENT("water_ambient"),
        MISC("misc");

        private final String name;

        private CreatureType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Spawn {
        private String type;
        private int weight;
        private int minCount;
        private int maxCount;
        public Spawn(){

        }

        public Spawn(String type, int weight, int minCount, int maxCount) {
            this.type = type;
            this.weight = weight;
            this.minCount = minCount;
            this.maxCount = maxCount;
        }

        public String getType() {
            return type;
        }
        public void setType(EntityType entityType) {
            this.type = entityType.getKey().getNamespace() + ":" + entityType.name().toLowerCase();
        }
        public void setType(String type) {
            this.type = type;
        }
        public int getWeight() {
            return weight;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }
        public int getMinCount() {
            return minCount;
        }
        public void setMinCount(int minCount) {
            this.minCount = minCount;
        }
        public int getMaxCount() {
            return maxCount;
        }
        public void setMaxCount(int maxCount) {
            this.maxCount = maxCount;
        }
    }

}
