package fr.mrqsdf.datapacklib.structure.structureset;

import java.util.List;

public class StructureSet {

    public transient String path;
    public transient String nameFile;
    public Placement placement;
    public List<Structures> structures;

    public StructureSet(String path,String nameFile, Placement placement, List<Structures> structures) {
        this.path = path;
        this.nameFile = nameFile;
        this.placement = placement;
        this.structures = structures;
    }

    public void addStructure(Structures structure){
        this.structures.add(structure);
    }

}
