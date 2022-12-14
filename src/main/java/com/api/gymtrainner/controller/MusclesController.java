package com.api.gymtrainner.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/api/v1/muscles")
@RequestMapping("teste/v1")
@RestController
public class MusclesController {


    @GetMapping("/get")
    public String teste(){
        return "aaaaaa";
    }

}
