package ru.aleksandr.recipewebsite.model;

public class Ingredient {
    private String name;
    private int number;
    private String measure;

    public Ingredient(String name, int number, String measure) {
        this.name = name;
        this.number = number;
        this.measure = measure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }
}
