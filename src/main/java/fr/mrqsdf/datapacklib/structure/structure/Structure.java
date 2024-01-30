package fr.mrqsdf.datapacklib.structure.structure;

import java.util.List;
import java.util.Map;

public class Structure {

    public transient String  path;
    public transient String nameFile;
    public String type;
    public List<String> biomes;
    public boolean adapt_noise;
    public Map<String, String > spawn_overrides;
    public StartHeight start_height;
    public String start_pool;
    public String step;
    public String terrain_adaptation;
    public int size;
    public String project_start_to_heightmap;
    public int max_distance_from_center;
    public boolean use_expansion_hack;
    public String start_jigsaw_name;

    public enum StructureType{
        BURIED_TREASURE("minecraft:buried_treasure"),
        DESERT_PYRAMID("minecraft:desert_pyramid"),
        END_CITY("minecraft:end_city"),
        FORTRESS("minecraft:fortress"),
        IGLOO("minecraft:igloo"),
        JIGSAW("minecraft:jigsaw"),
        JUNGLE_TEMPLE("minecraft:jungle_temple"),
        MINESHAFT("minecraft:mineshaft"),
        NETHER_FOSSIL("minecraft:nether_fossil"),
        OCEAN_RUIN("minecraft:ocean_ruin"),
        OCEAN_MONUMENT("minecraft:ocean_monument"),
        RUINED_PORTAL("minecraft:ruined_portal"),
        SHIPWRECK("minecraft:shipwreck"),
        STRONGHOLD("minecraft:stronghold"),
        SWAMP_HUT("minecraft:swamp_hut"),
        WOODLAND_MANSION("minecraft:woodland_mansion");

        private String name;

        StructureType(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }

    public enum GenerationStep{
        RAW_GENERATION("raw_generation"),
        LAKES("lakes"),
        LOCAL_MODIFICATIONS("local_modifications"),
        UNDERGROUND_STRUCTURES("underground_structures"),
        SURFACE_STRUCTURES("surface_structures"),
        STRONGHOLDS("strongholds"),
        UNDERGROUND_ORES("underground_ores"),
        UNDERGROUND_DECORATION("underground_decoration"),
        VEGETAL_DECORATION("vegetal_decoration"),
        TOP_LAYER_MODIFICATION("top_layer_modification");

        private String name;

        GenerationStep(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }

    public enum TerrainAdaptation {
        UNSET(null),
        NONE("none"),
        BEARD_THIN("beard_thin"),
        BEARD_BOX("beard_box"),
        BURY_ALL("bury_all");

        private String name;

        TerrainAdaptation(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }

    public enum ProjectStartToHeightmap {
        UNSET(null),
        MOTION_BLOCKING("motion_blocking"),
        MOTION_BLOCKING_NO_LEAVES("motion_blocking_no_leaves"),
        OCEAN_FLOOR("ocean_floor"),
        OCEAN_FLOOR_WG("ocean_floor_wg"),
        WORLD_SURFACE("world_surface"),
        WORLD_SURFACE_WG("world_surface_wg");

        private String name;

        ProjectStartToHeightmap(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }

    public Structure(String path, String nameFile, StructureType type, List<String> biomes, boolean adapt_noise, Map<String, String> spawn_overrides, StartHeight start_height, String start_pool, GenerationStep step, TerrainAdaptation terrain_adaptation, int size, ProjectStartToHeightmap project_start_to_heightmap, int max_distance_from_center, boolean use_expansion_hack, String start_jigsaw_name) {
        this.path = path;
        this.nameFile = nameFile;
        this.type = type.name;
        this.biomes = biomes;
        this.adapt_noise = adapt_noise;
        this.spawn_overrides = spawn_overrides;
        this.start_height = start_height;
        this.start_pool = start_pool;
        this.step = step.name;
        this.terrain_adaptation = terrain_adaptation.name;
        this.size = size;
        this.project_start_to_heightmap = project_start_to_heightmap.name;
        this.max_distance_from_center = max_distance_from_center;
        this.use_expansion_hack = use_expansion_hack;
        this.start_jigsaw_name = start_jigsaw_name;
    }
}
