package com.apache.zsm.flavor.web;

import com.apache.zsm.flavor.domain.People;
import com.apache.zsm.flavor.service.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EntranceController {

    private static final Logger Log = LoggerFactory.getLogger("zsm");

    @Autowired
    PeopleService peopleService;

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("welcome", "welcome!!");
        model.addAttribute("peopleList", peopleService.findAll());
        return "welcome";
    }

    @PostMapping("/add")
    @ResponseBody
    public String add(People people) {
        peopleService.addOne(people);
      //  return "redirect:/welcome";
        return "success";
    }

    @GetMapping("/edit")
    @ResponseBody
    public People edit(int id) {
        return peopleService.findOne(id);
    }

    @PostMapping("/update")
    public String updatePeople(People people) {
        peopleService.updateById(people);
        return "redirect:/welcome";
    }

    @GetMapping("/delete/{id}")
    public String deletePeople(@PathVariable int id) {
        peopleService.deleteById(id);
        return "redirect:/welcome";
    }
}
