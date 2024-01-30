package fr.mrqsdf.datapacklib.structure;

import java.io.InputStream;
import java.nio.file.Files;

public class StructureNBTFiles {

    public String name;
    public String path;
    public String ressourcePath;
    public InputStream inputStream;

    public StructureNBTFiles(String name, String path, InputStream inputStream) {
        this.name = name;
        this.path = path;
        this.inputStream = inputStream;
    }

    public StructureNBTFiles(String name, String path, String ressourcePath, InputStream inputStream) {
        this.name = name;
        this.path = path;
        this.ressourcePath = ressourcePath;
    }

}
