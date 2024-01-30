package fr.mrqsdf.datapacklib.structure.templatepool.element;

public class SingleElement extends Element{

    public SingleElement(Projection projection, String location, String processors) {
        this.element_type = "minecraft:single_pool_element";
        this.projection = projection.getName();
        this.location = location;
        this.processors = processors;
    }
}
