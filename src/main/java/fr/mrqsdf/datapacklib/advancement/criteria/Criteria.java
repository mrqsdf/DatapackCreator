package fr.mrqsdf.datapacklib.advancement.criteria;

import java.util.HashMap;
import java.util.Map;

public abstract class Criteria {

    public String name;
    public String trigger;
    public Map<String, Object> conditions = new HashMap<>();

    public Map<String, Object> getConditions() {
        return conditions;
    }

}
