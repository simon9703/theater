package com.apache.zsm.flavor.web;

import com.apache.zsm.flavor.domain.People;
import com.apache.zsm.flavor.service.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class EntranceController {

    private static final Logger LOG = LoggerFactory.getLogger("zsm");

    @Autowired
    PeopleService peopleService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "zhangsimeng56789 welcome!";
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("welcome", "zhangsimeng37 welcome!");
        model.addAttribute("peopleList", peopleService.findAll());
        LOG.error("Find an error in loading mybatis!");
        return "index";
    }
}
