package fr.mrqsdf;

import java.io.File;
import java.io.FileWriter;

public class PackMcMeta {

    private static String getPackMcMeta() {
        return "{\n" +
                "  \"pack\": {\n" +
                "    \"pack_format\": " + DatapackCreatorLib.DATAPACK_VERSION + ",\n" +
                "    \"description\": \"" + DatapackCreatorLib.DATAPACK_NAME + "\"\n" +
                "  }\n" +
                "}";
    }

    public static void createPackMcMeta() {
        File packMcMeta = new File("world/datapacks/" + DatapackCreatorLib.DATAPACK_NAME + "/pack.mcmeta");
        if (packMcMeta.exists()) return;
        else {
            File datapackFolder = new File("world/datapacks/" + DatapackCreatorLib.DATAPACK_NAME);
            datapackFolder.mkdirs();
        }
        try {
            packMcMeta.createNewFile();
            DatapackCreatorLib.PLUGIN.getLogger().info("pack.mcmeta created");
            packMcMeta.setWritable(true);
            FileWriter fileWriter = new FileWriter(packMcMeta);
            fileWriter.write(getPackMcMeta());
            fileWriter.close();
            DatapackCreatorLib.PLUGIN.getLogger().info("pack.mcmeta writed");
        } catch (Exception e) {
            DatapackCreatorLib.PLUGIN.getLogger().warning("pack.mcmeta already exist");
        }
    }

}
