package com.zeger.demospringboot.controller;

import com.zeger.customstarter.annotation.FrontendController;
import com.zeger.demospringboot.model.Person;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Pavel Zeger
 * @implNote demo-springboot
 * @since 03/04/2021
 */
@FrontendController
public class SystemController {

    @GetMapping("/status")
    public Person status() {
        return Person.builder().firstName("Pavel").age("25").build();
    }
}
