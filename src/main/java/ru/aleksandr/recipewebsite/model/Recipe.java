package ru.aleksandr.recipewebsite.model;

import java.util.List;

public class Recipe {
    private String name;
    private int cookingTime;
    private List<Ingredient> ingredient;
    private List<String> steps;

    public Recipe(String name, int cookingTime, List<Ingredient> ingredient, List<String> steps) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredient = ingredient;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public List<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }
}
