package ru.aleksandr.recipewebsite.dto;

import ru.aleksandr.recipewebsite.model.Ingredient;
import ru.aleksandr.recipewebsite.model.Recipe;

import java.util.List;

public class RecipeDTO {
    private final int id;
    private final String name;
    private final int cookingTime;
    private final List<Ingredient> ingredient;
    private final List<String> steps;

    public RecipeDTO(int id, String name, int cookingTime, List<Ingredient> ingredient, List<String> steps) {
        this.id = id;
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredient = ingredient;
        this.steps = steps;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<Ingredient> getIngredient() {
        return ingredient;
    }

    public List<String> getSteps() {
        return steps;
    }

    public static RecipeDTO from(int id, Recipe recipe) {
        return new RecipeDTO(id, recipe.getName(), recipe.getCookingTime(), recipe.getIngredient(), recipe.getSteps());

    }
}
