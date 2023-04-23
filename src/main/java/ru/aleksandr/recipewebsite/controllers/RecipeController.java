package ru.aleksandr.recipewebsite.controllers;

import org.springframework.web.bind.annotation.*;
import ru.aleksandr.recipewebsite.dto.RecipeDTO;
import ru.aleksandr.recipewebsite.model.Recipe;
import ru.aleksandr.recipewebsite.service.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/{id}")
    public RecipeDTO getRecipe(@PathVariable("id") int id) {
        return recipeService.getRecipe(id);
    }

    @PostMapping
    public RecipeDTO addRecipe(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

}
