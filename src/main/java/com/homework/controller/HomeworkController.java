package com.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeworkController {

    @GetMapping(path = "/m1")
    public void m1() {
    }

    @GetMapping(path = "/m2")
    public void m2() {
    }

    @GetMapping(path = "/m3")
    public void m3() {
    }
}
