package ru.aleksandr.recipewebsite.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstContoller {

    @GetMapping("/")
    public String helloWord() {
        return "Приложение запущенно";
    }
    @GetMapping("/info")
    public String infoProject() {
        return "Разрабочтик Александр\n" + "Вебсайт рецептов \n" + "Дата создание 16.04.2023 \n " +
                "Веб-сайт, лучших рецептов";
    }

}
