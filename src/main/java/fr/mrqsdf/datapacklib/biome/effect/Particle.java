package fr.mrqsdf.datapacklib.biome.effect;

import java.util.HashMap;
import java.util.Map;

public class Particle {

    private Map<String, String > options = new HashMap<>(){{put("type", null);}};
    private double probability = 0;

    public Particle(){

    }

    public Particle(String type, double probability){
        this.options.put("type", type);
        this.probability = probability;
    }

    public String getType() {
        return options.get("type");
    }
    public void setType(String type) {
        this.options.put("type", type);
    }
    public double getProbability() {
        return probability;
    }
    public void setProbability(double probability) {
        if (probability > 1 || probability < 0){
            throw new IllegalArgumentException("probability must be between 0 and 1");
        }
        this.probability = probability;
    }

}
