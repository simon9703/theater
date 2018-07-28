package com.apache.zsm.flavor.web;

import com.apache.zsm.flavor.domain.People;
import com.apache.zsm.flavor.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleApi {
    @Autowired
    PeopleService peopleService;

    @GetMapping("/people")
    public List<People> manyPeople() {
        return peopleService.findAll();
    }
}
