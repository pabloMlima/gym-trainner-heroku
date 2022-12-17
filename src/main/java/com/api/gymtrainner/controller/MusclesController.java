package com.api.gymtrainner.controller;
import com.api.gymtrainner.dto.muscles.MusclesDto;
import com.api.gymtrainner.models.Muscles;
import com.api.gymtrainner.response.ResponseHandler;
import com.api.gymtrainner.services.muscles.MusclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/muscles")
public class MusclesController {

    @Autowired
    MusclesService musclesService;

    @GetMapping("/list")
    public ResponseEntity<?> listMuscles(){
        try{
            List<Muscles> muscles = musclesService.listMuscles();

            return ResponseHandler.generateResponse("List muscles generate with success", HttpStatus.OK, muscles);
        }catch (Exception e){
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

    @PostMapping("/store")
    public ResponseEntity<?> store(@RequestBody MusclesDto musclesDto){
        try{
            Muscles muscles = musclesService.store(musclesDto);

            return ResponseHandler.generateResponse("Muscle store with success", HttpStatus.OK, muscles);
        }catch (Exception e){
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

}
