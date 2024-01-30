package fr.mrqsdf.datapacklib.structure.structureset;

import java.util.List;

public class Placement {

    public transient String path;
    public String type;
    public int salt;
    public String frequency_reduction_method;
    public double frequency;
    public ExclusionZone exclusion_zone;
    public List<Integer> locate_offset;
    public int distance;
    public int spread;
    public int count;
    public String spread_type;
    public int spacing;
    public int separation;
    public List<String > preferred_biomes;

    public Placement(String path, PlacementType type, int salt, FrequencyReductionMethod frequency_reduction_method, double frequency, ExclusionZone exclusion_zone, List<Integer> locate_offset, int distance, int spread, int count, List<String> preferred_biomes) {
        this.path = path;
        this.type = type.name;
        this.salt = salt;
        this.frequency_reduction_method = frequency_reduction_method.name;
        this.frequency = frequency;
        this.exclusion_zone = exclusion_zone;
        this.locate_offset = locate_offset.size() >= 3 ? locate_offset : locate_offset.subList(0, 3);
        this.distance = distance > 1023 ? 1023 : Math.max(distance, 0);
        this.spread = spread > 1023 ? 1023 : Math.max(spread, 0);
        this.count = count > 4095 ? 4095 : Math.max(count, 1);
        this.preferred_biomes = preferred_biomes;
    }

    public Placement(String path, PlacementType type, int salt, FrequencyReductionMethod frequency_reduction_method, double frequency, ExclusionZone exclusion_zone, List<Integer> locate_offset, SpreadType spread_type, int spacing, int separation) {
        this.path = path;
        this.type = type.name;
        this.salt = salt;
        this.frequency_reduction_method = frequency_reduction_method.name;
        this.frequency = frequency < 0 ? 0 : Math.min(frequency, 1);
        this.exclusion_zone = exclusion_zone;
        this.locate_offset = locate_offset.size() >= 3 ? locate_offset : locate_offset.subList(0, 3);
        this.spread_type = spread_type.name;
        this.spacing = spacing < 0 ? 0 : Math.min(spacing, 4096);
        this.separation = separation < 0 ? 0 : Math.min(separation, spacing) == spacing ? spacing-1 : Math.min(separation, spacing);
    }
    public Placement(String path, PlacementType type, int salt, FrequencyReductionMethod frequency_reduction_method, ExclusionZone exclusion_zone, List<Integer> locate_offset, SpreadType spread_type, int spacing, int separation) {
        this.path = path;
        this.type = type.name;
        this.salt = salt;
        this.frequency_reduction_method = frequency_reduction_method.name;
        this.frequency = frequency < 0 ? 0 : Math.min(frequency, 1);
        this.exclusion_zone = exclusion_zone;
        if (locate_offset !=null)this.locate_offset = locate_offset.size() >= 3 ? locate_offset : locate_offset.subList(0, 3);
        this.spread_type = spread_type.name;
        this.spacing = spacing < 0 ? 0 : Math.min(spacing, 4096);
        this.separation = separation < 0 ? 0 : Math.min(separation, spacing) == spacing ? spacing-1 : Math.min(separation, spacing);
    }


    public enum PlacementType {
        RANDOM_SPREAD("minecraft:random_spread"),
        CONCENTRIC_RINGS("minecraft:concentric_rings");

        private String name;

        PlacementType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public enum SpreadType {
        UNSET(null),
        LINEAR("linear"),
        TRIANGULAR("triangular");

        private String name;

        SpreadType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public enum FrequencyReductionMethod {
        UNSET(null),
        DEFAULT("default"),
        LEGACY_1("legacy_1"),
        LEGACY_2("legacy_2"),
        LEGACY_3("legacy_3");

        private String name;

        FrequencyReductionMethod(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
