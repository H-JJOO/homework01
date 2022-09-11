package com.sparta.homework01.controller;

import com.sparta.homework01.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPersons() {
        Person person = new Person();
        person.setName("주현진");
        person.setJob("job seeker");
        person.setAge(30);
        person.setHight(173.5);
        return person;
    }
}
