package fr.mrqsdf.datapacklib.biome.effect;

public class Music {

    private String sound;
    private int min_delay;
    private int max_delay;
    private boolean replace_current_music = false;

    public Music(){

    }
    public Music(String sound, int min_delay, int max_delay, boolean replace_current_music) {
        this.sound = sound;
        this.min_delay = min_delay;
        this.max_delay = max_delay;
        this.replace_current_music = replace_current_music;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getMin_delay() {
        return min_delay;
    }

    public void setMin_delay(int min_delay) {
        if (min_delay < 0){
            throw new IllegalArgumentException("min_delay must be positive");
        }
        this.min_delay = min_delay;
    }

    public int getMax_delay() {
        return max_delay;
    }

    public void setMax_delay(int max_delay) {
        if (max_delay < 0){
            throw new IllegalArgumentException("max_delay must be positive");
        }
        this.max_delay = max_delay;
    }

    public boolean isReplace_current_music() {
        return replace_current_music;
    }

    public void setReplace_current_music(boolean replace_current_music) {
        this.replace_current_music = replace_current_music;
    }
}
