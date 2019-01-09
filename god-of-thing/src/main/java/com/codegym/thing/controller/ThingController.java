package com.codegym.thing.controller;

import com.codegym.thing.model.Thing;
import com.codegym.thing.service.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThingController {
    @Autowired
    private ThingService thingService;

    @GetMapping("/things")
    public ModelAndView listThing(){
        Iterable<Thing> things = thingService.findAll();
        ModelAndView modelAndView = new ModelAndView("/thing/list");
        modelAndView.addObject("things", things);
        return modelAndView;
    }

    @GetMapping("/create-thing")
    public ModelAndView createThing(){
        ModelAndView modelAndView = new ModelAndView("/thing/create");
        modelAndView.addObject("thing", new Thing());
        return modelAndView;
    }

    @PostMapping("/create-thing")
    public ModelAndView saveThing(@ModelAttribute("thing") Thing thing){
        thingService.save(thing);
        ModelAndView modelAndView = new ModelAndView("/thing/create");
        modelAndView.addObject("thing",new Thing());
        modelAndView.addObject("message","Thank God");
        return modelAndView;
    }


}
