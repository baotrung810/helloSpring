/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jv29_spring_mvc_hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author AnhLe
 */
@Controller
public class HelloController {

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("name", "Anh");
        model.addAttribute("country", "Viet Nam");
        return "home";
    }

    @RequestMapping("/data")
    public ModelAndView viewData(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "country", required = false) String country) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("country", country);
        mv.setViewName("view");
        return mv;
    }

    @RequestMapping("/data-path-variable/{name}/{country}/{countryId}")
    public String viewDataPathVariable(Model model,
            @PathVariable("name") String name,
            @PathVariable("country") String country,
            @PathVariable("countryId") int countryId) {
        model.addAttribute("name", name);
        model.addAttribute("country", country);
        model.addAttribute("countryId", countryId);
        return "view";
    }

}
