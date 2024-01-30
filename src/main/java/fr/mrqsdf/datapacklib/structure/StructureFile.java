package fr.mrqsdf.datapacklib.structure;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.mrqsdf.datapacklib.DatapackCreatorLib;
import fr.mrqsdf.datapacklib.structure.structure.Structure;
import fr.mrqsdf.datapacklib.structure.structureset.StructureSet;
import fr.mrqsdf.datapacklib.structure.templatepool.TemplatePool;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Map;

public class StructureFile {

    public static InputStream getStructureFile(String fileName){

        // Get the file from the resources folder
        InputStream source = StructureFile.class.getClassLoader().getResourceAsStream("datapack/structure/" + fileName + ".nbt");
        if (source == null) {
            throw new IllegalArgumentException("File not found! " + fileName);
        }
        // Copy the file to the destination
        //Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        return source;

    }
    public static InputStream getStructureFile(String fileName, String ressourcePath){

        // Get the file from the resources folder
        InputStream source = StructureFile.class.getResourceAsStream("datapack/structures/" + ressourcePath +"/"+ fileName + ".nbt");
        if (source == null) {
            throw new IllegalArgumentException("File not found! " + fileName);
        }
        // Copy the file to the destination
        return source;

    }

    public static void createDatapackFile(){
        File fileStructure = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/structures") : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER+ "/structure");
        if (!fileStructure.exists()){
            fileStructure.mkdirs();
        }
        File fileWorldGen = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen") : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER+ "/worldgen");
        if (!fileWorldGen.exists()){
            fileWorldGen.mkdirs();
        }
        File fileTemplatePool = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/template_pool") : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER+ "/worldgen/template_pool");
        if (!fileTemplatePool.exists()){
            fileTemplatePool.mkdirs();
        }
        File fileStructureSet = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/structure_set") : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER+ "/worldgen/structure_set");
        if (!fileStructureSet.exists()){
            fileStructureSet.mkdirs();
        }
        File filestructure2 = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/structure") : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER+ "/worldgen/structure");
        if (!filestructure2.exists()){
            filestructure2.mkdirs();
        }
    }
    public static void addStructureFileNBT(String nameFile, String path){
        File file = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/structures/" + path) : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/structure/" + path);
        if (!file.exists()){
            file.mkdirs();
        }
        Path destination = Path.of(file.getPath() + "/" + nameFile + ".nbt");
        try {
            Files.copy(getStructureFile(nameFile), destination, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void addStructureFileNBT(StructureNBTFiles structureNBTFiles){
        File file = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/structures/" + structureNBTFiles.path) : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/structure/" + structureNBTFiles.path);
        if (!file.exists()){
            file.mkdirs();
        }
        Path destination = Path.of(file.getPath() + "/" + structureNBTFiles.name + ".nbt");
        try {
            Files.copy(structureNBTFiles.inputStream, destination, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void addStructureFileNBT(String nameFile, String path, String ressourcePath){
        File file = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/structures/" + path) : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/structure/" + path);
        if (!file.exists()){
            file.mkdirs();
        }
        Path destination = Path.of(file.getPath() + "/" + nameFile + ".nbt");
        try {
            Files.copy(getStructureFile(nameFile, ressourcePath), destination, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void createStructureFile(String name, List<String> blocks, Map<String, String> blocksMap, int sizeX, int sizeY, int sizeZ) {
        createDatapackFile();
        File file = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/structures/" + name + ".nbt") : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/structure/" + name + ".nbt");

    }

    public static void createTemplatePoolFile(){
        for (TemplatePool templatePool : DatapackCreatorLib.templatePools){
            File file = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/template_pool/"+ templatePool.path) : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/worldgen/template_pool/" + templatePool.path);
            if (!file.exists()){
                file.mkdirs();
            }
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            try {
                FileWriter writer = templatePool.path == null ? (DatapackCreatorLib.isBukkit ? new FileWriter(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/template_pool/" + templatePool.nameFile + ".json") : new FileWriter(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/worldgen/template_pool/"+  templatePool.nameFile + ".json")) : (DatapackCreatorLib.isBukkit ? new FileWriter(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/template_pool/"+ templatePool.path +"/"+ templatePool.nameFile + ".json") : new FileWriter(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/worldgen/template_pool/" + templatePool.path+ templatePool.nameFile + ".json"));
                writer.write(gson.toJson(templatePool));
                writer.close();

            } catch(IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void createStructureSetFile(){
        for (StructureSet structureSet : DatapackCreatorLib.structureSets){
            File file = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/structure_set/"+ structureSet.path +"/") : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/worldgen/structure_set/" + structureSet.path +"/");
            if (!file.exists()){
                file.mkdirs();
            }
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            try {
                FileWriter writer = structureSet.path == null ? (DatapackCreatorLib.isBukkit ? new FileWriter(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/structure_set/"+ structureSet.nameFile + ".json") : new FileWriter(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/worldgen/structure_set/" + structureSet.nameFile + ".json")) : (DatapackCreatorLib.isBukkit ? new FileWriter(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/structure_set/"+ structureSet.path +"/"+ structureSet.nameFile + ".json") : new FileWriter(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/worldgen/structure_set/" + structureSet.path +"/"+ structureSet.nameFile + ".json"));
                writer.write(gson.toJson(structureSet));
                writer.close();

            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createStructureFile(){
        for (Structure structure : DatapackCreatorLib.structures){
            File file = DatapackCreatorLib.isBukkit ? new File(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/structure/"+ structure.path +"/") : new File(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/worldgen/structure/" + structure.path +"/");
            if (!file.exists()){
                file.mkdirs();
            }
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            try {
                FileWriter writer = structure.path == null ? (DatapackCreatorLib.isBukkit ? new FileWriter(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/structure/"+ structure.nameFile + ".json") : new FileWriter(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/worldgen/structure/" + structure.nameFile + ".json")) : (DatapackCreatorLib.isBukkit ? new FileWriter(DatapackCreatorLib.BUKKIT_DATAPACK_FOLDER + "/worldgen/structure/"+ structure.path +"/" + structure.nameFile + ".json") : new FileWriter(DatapackCreatorLib.PLUGIN_DATAPACK_FOLDER + "/worldgen/structure/" + structure.path +"/"+ structure.nameFile + ".json"));
                writer.write(gson.toJson(structure));
                writer.close();

            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
