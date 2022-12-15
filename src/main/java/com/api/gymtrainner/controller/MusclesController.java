package com.api.gymtrainner.controller;
import com.api.gymtrainner.services.muscles.MusclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/muscles")
public class MusclesController {

    @Autowired
    MusclesService musclesService;

    @GetMapping("/list")
    public ResponseEntity<?> listMuscles(){
        
    }

}
