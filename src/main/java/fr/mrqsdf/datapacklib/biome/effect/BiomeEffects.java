package fr.mrqsdf.datapacklib.biome.effect;

import java.util.HexFormat;

public class BiomeEffects {

    private int sky_color;
    private int fog_color;
    private int water_color;
    private int water_fog_color;
    private int grass_color;
    private int foliage_color;
    private String grass_color_modifier = GrassColorModifier.UNSET.getName();
    private String ambient_sound;
    private MoodSound mood_sound;
    private AdditionsSound additions_sound;
    private Music music;
    private Particle particle;

    public BiomeEffects(){

    }

    public BiomeEffects(int sky_color, int fog_color, int water_color, int water_fog_color, int grass_color,
            int foliage_color, String grass_color_modifier, String ambient_sound, MoodSound mood_sound,
            AdditionsSound additions_sound, Music music, Particle particle) {
        this.sky_color = sky_color;
        this.fog_color = fog_color;
        this.water_color = water_color;
        this.water_fog_color = water_fog_color;
        this.grass_color = grass_color;
        this.foliage_color = foliage_color;
        this.grass_color_modifier = grass_color_modifier;
        this.ambient_sound = ambient_sound;
        this.mood_sound = mood_sound;
        this.additions_sound = additions_sound;
        this.music = music;
        this.particle = particle;
    }

    public int getSkyColor() {
        return sky_color;
    }

    public void setSkyColor(int sky_color) {
        this.sky_color = sky_color;
    }
    public void setSkyColor(int r, int g, int b) {
        this.sky_color = (r << 16) + (g << 8) + b;
    }

    public int getFogColor() {
        return fog_color;
    }

    public void setFogColor(int fog_color) {
        this.fog_color = fog_color;
    }
    public void setFogColor(int r, int g, int b) {
        this.fog_color = (r << 16) + (g << 8) + b;
    }

    public int getWaterColor() {
        return water_color;
    }

    public void setWaterColor(int water_color) {
        this.water_color = water_color;
    }
    public void setWaterColor(int r, int g, int b) {
        this.water_color = (r << 16) + (g << 8) + b;
    }

    public int getWaterFogColor() {
        return water_fog_color;
    }

    public void setWaterFogColor(int water_fog_color) {
        this.water_fog_color = water_fog_color;
    }
    public void setWaterFogColor(int r, int g, int b) {
        this.water_fog_color = (r << 16) + (g << 8) + b;
    }

    public int getGrassColor() {
        return grass_color;
    }

    public void setGrassColor(int grass_color) {
        this.grass_color = grass_color;
    }
    public void setGrassColor(int r, int g, int b) {
        this.grass_color = (r << 16) + (g << 8) + b;
    }

    public int getFoliageColor() {
        return foliage_color;
    }

    public void setFoliageColor(int r, int g, int b) {
        this.foliage_color = (r << 16) + (g << 8) + b;
    }

    public void setFoliageColor(int foliage_color) {
        this.foliage_color = foliage_color;
    }

    public GrassColorModifier getGrassColorModifier() {
        return GrassColorModifier.valueOf(grass_color_modifier);
    }

    public void setGrassColorModifier(GrassColorModifier grassColorModifier) {
        this.grass_color_modifier = grassColorModifier.getName();
    }

    public String getAmbientSound() {
        return ambient_sound;
    }

    public void setAmbientSound(String ambient_sound) {
        this.ambient_sound = ambient_sound;
    }

    public MoodSound getMoodSound() {
        return mood_sound;
    }

    public void setMoodSound(MoodSound mood_sound) {
        this.mood_sound = mood_sound;
    }

    public AdditionsSound getAdditionsSound() {
        return additions_sound;
    }

    public void setAdditionsSound(AdditionsSound additions_sound) {
        this.additions_sound = additions_sound;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Particle getParticle() {
        return particle;
    }

    public void setParticle(Particle particle) {
        this.particle = particle;
    }

    public static enum GrassColorModifier {
        UNSET(null),
        NONE("none"),
        DARK_FOREST("dark_forest"),
        SWAMP("swamp");

        private final String name;

        private GrassColorModifier(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
