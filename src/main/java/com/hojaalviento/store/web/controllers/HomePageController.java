package com.hojaalviento.store.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController
{
    @GetMapping("/home")
    public String getHomePage(final Model model)
    {
        return "index";
    }
}
