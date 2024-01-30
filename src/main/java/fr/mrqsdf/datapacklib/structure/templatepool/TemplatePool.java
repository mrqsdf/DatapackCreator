package fr.mrqsdf.datapacklib.structure.templatepool;

import java.util.List;

public class TemplatePool {
    public transient String path;
    public transient String nameFile;

    public String name;
    public String fallback;
    public List<Elements> elements;

    public TemplatePool(String path,String nameFile, String namePathFile, String fallback, List<Elements> elements) {
        this.path = path;
        this.nameFile = nameFile;
        this.name = namePathFile;
        this.fallback = fallback;
        this.elements = elements;
    }

}
