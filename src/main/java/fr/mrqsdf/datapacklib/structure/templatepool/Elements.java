package fr.mrqsdf.datapacklib.structure.templatepool;

import fr.mrqsdf.datapacklib.structure.templatepool.element.Element;

public class Elements {

    public int weight;
    public Element element;

    public Elements(int weight, Element element){
        this.weight = Math.max(weight, 1);
        this.element = element;
    }


}
