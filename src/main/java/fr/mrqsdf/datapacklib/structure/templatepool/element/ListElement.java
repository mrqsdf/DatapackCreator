package fr.mrqsdf.datapacklib.structure.templatepool.element;

import fr.mrqsdf.datapacklib.structure.templatepool.Elements;

import java.util.List;

public class ListElement extends Element{
    public ListElement(Projection projection, List<Elements> elements) {
        this.element_type = "minecraft:list_pool_element";
        this.projection = projection.getName();
        this.elements = elements;
    }
}
