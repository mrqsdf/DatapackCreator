package fr.mrqsdf.advancement.criteria;

import fr.mrqsdf.advancement.conditions.Conditions;

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
