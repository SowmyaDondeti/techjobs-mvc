package org.launchcode.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController
{
    static HashMap<String, String> actionChoices = new HashMap<>();

    public TechJobsController(){
        actionChoices.put("core competency", "Skill");
        actionChoices.put("employer", "Employer");
        actionChoices.put("location", "Location");
        actionChoices.put("position type", "Position Type");
    }
    @ModelAttribute("actions")
    public HashMap getActionChoices(Model model){
//        model.addAttribute("actions",actionChoices);
        return actionChoices;
    }

}
