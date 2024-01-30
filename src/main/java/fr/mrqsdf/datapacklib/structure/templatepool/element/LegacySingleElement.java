package fr.mrqsdf.datapacklib.structure.templatepool.element;

public class LegacySingleElement extends Element{

    public LegacySingleElement(Projection projection, String location, String processors) {
        this.element_type = "minecraft:legacy_single_pool_element";
        this.projection = projection.getName();
        this.location = location;
        this.processors = processors;
    }
}
