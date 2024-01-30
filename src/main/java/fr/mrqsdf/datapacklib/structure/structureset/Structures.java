package fr.mrqsdf.datapacklib.structure.structureset;

public class Structures {

    public int weight;
    public String structure;

    public Structures(int weight, String structure) {
        this.weight = Math.max(weight, 1);
        this.structure = structure;
    }
}
