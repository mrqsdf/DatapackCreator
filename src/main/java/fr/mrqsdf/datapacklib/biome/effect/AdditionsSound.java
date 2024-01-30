package fr.mrqsdf.datapacklib.biome.effect;

public class AdditionsSound {

    private String sound;
    private double tick_chance;

    public AdditionsSound(){

    }
    public AdditionsSound(String sound, double tick_chance) {
        this.sound = sound;
        this.tick_chance = tick_chance;
    }

    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public double getTick_chance() {
        return tick_chance;
    }
    public void setTick_chance(double tick_chance) {
        if (tick_chance > 1 || tick_chance < 0){
            throw new IllegalArgumentException("tick_chance must be between 0 and 1");
        }
        this.tick_chance = tick_chance;
    }

}
