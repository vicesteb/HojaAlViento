package com.hojaalviento.store.web.controllers;

import com.hojaalviento.store.data.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController
{
    @Autowired
    private MealRepository mealRepository;

    @GetMapping("/home")
    public String getHomePage(final Model model)
    {
        return "index";
    }
}
