package fr.mrqsdf.datapacklib.advancement.conditions;

import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LegacyConditions extends Conditions{

    public String type;
    public Map<String,String> type_specific;
    public String nbt, team;
    public Location location;
    public Location stepping_on;
    public Distance distance;
    public Flags flags = new Flags();
    public LegacyConditions vehicle;
    public LegacyConditions passenger;
    public LegacyConditions targeted_entity;
    public Map<String, Map<String, Object>> effects = new HashMap<>();

    public LegacyConditions() {
        setType(EntityType.PLAYER);
        setTypeSpecific(new HashMap<>(){
            {
                put("type",EntityType.PLAYER);
            }
        },Variant.GOLD);
        setNbt("testnbt");
        setTeam("testteam");
        flags.is_baby = true;
    }

    public void setType(EntityType type) {
        this.type = "minecraft:" + type.toString().toLowerCase();
    }
    public void setTypeSpecificALL() {
        this.type_specific = new HashMap<>(){{
            put("type","all");
        }};
    }
    public void setTypeSpecific(Map<String,EntityType> type_specific, Variant variant) {
        this.type_specific = new HashMap<>(){{
            for (Map.Entry<String,EntityType> entry : type_specific.entrySet()) {
                put(entry.getKey(),entry.getValue().toString().toLowerCase());
            }
            if (variant != Variant.UNSET){
                put("variant",variant.toString().toLowerCase());
            }
        }};
    }
    public void setNbt(String nbt) {
        this.nbt = nbt;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    public void setLocation(Location location){
        this.location = location;
    }
    public void setSteppingOn(Location stepping_on){
        this.stepping_on = stepping_on;
    }
    public void setDistance(Distance distance){
        this.distance = distance;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public void setVehicle(LegacyConditions vehicle) {
        this.vehicle = vehicle;
    }

    public void setPassenger(LegacyConditions passenger) {
        this.passenger = passenger;
    }

    public void setTargeted_entity(LegacyConditions targeted_entity) {
        this.targeted_entity = targeted_entity;
    }

    public void addEffects(PotionEffectType type, int amplifier, int duration, boolean ambient, boolean visible) {
        effects.put(type.toString().toLowerCase(), new HashMap<>(){{
            put("amplifier",amplifier);
            put("duration",duration);
            put("ambient",ambient);
            put("visible",visible);
        }});
    }



    public static class Flags {

        public boolean is_on_fire, is_sneaking, is_sprinting, is_swimming, is_baby;

        public void setIs_on_fire(boolean is_on_fire) {
            this.is_on_fire = is_on_fire;
        }

        public void setIs_sneaking(boolean is_sneaking) {
            this.is_sneaking = is_sneaking;
        }

        public void setIs_sprinting(boolean is_sprinting) {
            this.is_sprinting = is_sprinting;
        }

        public void setIs_swimming(boolean is_swimming) {
            this.is_swimming = is_swimming;
        }

        public void setIs_baby(boolean is_baby) {
            this.is_baby = is_baby;
        }
    }

    public enum Variant {

        UNSET,
        LUCY,
        WILD,
        GOLD,
        CYAN,
        BLUE

    }

    public static class Location {

        public Map<String, Integer> position;
        public String dimension;
        public String biome;
        public String structure;
        public Light light;
        public boolean smokey;
        public Block block;
        public Fluid fluid;

        public void setPosition(Map<String, Integer> position) {
            this.position = position;
        }

        public void setDimension(String dimension) {
            this.dimension = dimension;
        }

        public void setBiome(String biome) {
            this.biome = biome;
        }

        public void setStructure(String structure) {
            this.structure = structure;
        }

        public void setLight(Light light) {
            this.light = light;
        }

        public void setSmokey(boolean smokey) {
            this.smokey = smokey;
        }

        public void setBlock(Block block) {
            this.block = block;
        }

        public void setFluid(Fluid fluid) {
            this.fluid = fluid;
        }

        public static class Light {

            public Object light;

            public Light(int light) {
                this.light = light;
            }
            public Light(int min, int max) {
                this.light = new HashMap<>(){{
                    put("min",min);
                    put("max",max);
                }};
            }
        }


        public static class Block {

            public List<String > blocks;
            public String tag;
            public String nbt;
            public Map<String, Object> state;

            public void setBlocks(List<Material> blocks) {
                this.blocks = new ArrayList<>(){{
                    for (Material block : blocks) {
                        add("minecraft:" + block.toString().toLowerCase());
                    }
                }};
            }

            public void setTag(Tag tag) {
                this.tag = "minecraft:" + tag.toString().toLowerCase();
            }

            public void setNbt(String nbt) {
                this.nbt = nbt;
            }

            public void setState(Map<String, Object> state) {
//        for (Object value : state.values()) {
//            if (!(value instanceof String || value instanceof Number || value instanceof Boolean)) {
//                if (value instanceof Map<?,?>){
//                    Map<String, Object> map = (Map<String, Object>) value ;
//                    for (Object value1 : map.values()) {
//                        if (!(value1 instanceof Number)) {
//                            throw new IllegalArgumentException("State value must be a String, Number or Boolean");
//                        }
//                    }
//                } else {
//                    throw new IllegalArgumentException("State value must be a String, Number or Boolean");
//                }
//                return;
//            }
//        }
                this.state = state;

            }
        }


        public static class Fluid {

            public String fluid;
            public String tag;
            public Map<String, Object> state;


            public void setFluid(FluidType fluid) {
                this.fluid = fluid.name().toLowerCase();
            }

            public void setTag(Material tag) {
                if (!(tag == Material.WATER || tag == Material.LAVA)) {
                    throw new IllegalArgumentException("Tag must be WATER or LAVA");
                }
                this.tag = "minecraft:" + tag.toString().toLowerCase();
            }

            public void setState(Map<String, Object> state) {
                this.state = state;
            }

            public enum FluidType {

                EMPTY,
                WATER,
                LAVA,
                FLOWING_WATER,
                FLOWING_LAVA

            }
        }


    }

}


