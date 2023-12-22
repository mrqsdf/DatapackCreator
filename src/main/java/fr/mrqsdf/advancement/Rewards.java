package fr.mrqsdf.advancement;

import java.util.ArrayList;
import java.util.List;

public class Rewards {

    public int experience = 0;
    public List<String> lootTable = new ArrayList<>();
    public List<String> recipes = new ArrayList<>();
    public String function = "";

    public Rewards(int experience, List<String> lootTable, List<String> recipes, String function) {
        this.experience = experience;
        this.lootTable = lootTable;
        this.recipes = recipes;
        this.function = function;
    }
    public Rewards(){

    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLootTable(List<String> lootTable) {
        this.lootTable = lootTable;
    }

    public void setRecipes(List<String> recipes) {
        this.recipes = recipes;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
