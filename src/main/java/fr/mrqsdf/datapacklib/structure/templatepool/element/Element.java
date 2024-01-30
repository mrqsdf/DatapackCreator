package fr.mrqsdf.datapacklib.structure.templatepool.element;

import fr.mrqsdf.datapacklib.structure.templatepool.Elements;

import java.util.List;

public abstract class Element {

    public String element_type;
    public String projection;
    public String feature;
    public String location;
    public String processors;
    public List<Elements> elements;



    public enum Projection {
        RIGID("rigid"),
        TERRAIN_MATCHING("terrain_matching");

        Projection(String name) {
            this.name = name;
        }
        private String name;
        public String getName() {
            return name;
        }

    }

}
