package fr.mrqsdf.advancement;

import com.google.gson.*;

import java.lang.reflect.Type;

public class AdvancementSerialisation implements JsonSerializer<Advancement> {

    @Override
    public JsonElement serialize(Advancement src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject result = new JsonObject();
        result.add("display", context.serialize(src.getDisplay()));
        result.add("parent", context.serialize(src.getParent()));
        /*JsonObject conditions = new JsonObject();
        for (String key : src.getCriteria().keySet()){
            conditions.add(key, context.serialize(src.getCriteria().get(key)));
        }
        result.add("criteria", conditions);*/
        result.add("criteria", context.serialize(src.getCriteria()));
        result.add("requirements", context.serialize(src.getRequirements()));
        result.add("rewards", context.serialize(src.getRewards()));
        result.add("telemetry", context.serialize(src.isTelemetry()));
        return result;
    }
}
