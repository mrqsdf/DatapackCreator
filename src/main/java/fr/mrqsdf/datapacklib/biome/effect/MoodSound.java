package fr.mrqsdf.datapacklib.biome.effect;

public class MoodSound {

    private String sound;
    private int tick_delay;
    private int block_search_extent;
    private double offset;
    public MoodSound(){

    }
    public MoodSound(String sound, int tick_delay, int block_search_extent, double offset) {
        this.sound = sound;
        this.tick_delay = tick_delay;
        this.block_search_extent = block_search_extent;
        this.offset = offset;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getTick_delay() {
        return tick_delay;
    }

    public void setTick_delay(int tick_delay) {
        this.tick_delay = tick_delay;
    }

    public int getBlock_search_extent() {
        return block_search_extent;
    }

    public void setBlock_search_extent(int block_search_extent) {
        this.block_search_extent = block_search_extent;
    }

    public double getOffset() {
        return offset;
    }

    public void setOffset(double offset) {
        this.offset = offset;
    }
}
