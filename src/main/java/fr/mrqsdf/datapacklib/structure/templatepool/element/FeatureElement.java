package fr.mrqsdf.datapacklib.structure.templatepool.element;

public class FeatureElement extends Element{

    public FeatureElement(Projection projection, String feature) {
        this.element_type = "minecraft:feature_pool_element";
        this.projection = projection.getName();
        this.feature = feature;
    }

}
