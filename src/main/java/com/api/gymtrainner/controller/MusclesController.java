package com.api.gymtrainner.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/muscles")
public class MusclesController {


    @GetMapping
    public String teste(){
        return "aaaaaa";
    }

}
