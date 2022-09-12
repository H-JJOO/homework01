package com.sparta.homework01.controller;

import com.sparta.homework01.Fruit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FruitController {

    @GetMapping(value = "/fruit")
    public Fruit getFruits() {
        Fruit fruit = new Fruit();
        fruit.setKind("사과");
        fruit.setColor("빨강");
        return fruit;


    }

}

