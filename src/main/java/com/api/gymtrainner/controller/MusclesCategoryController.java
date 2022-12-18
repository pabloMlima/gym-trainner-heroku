package com.api.gymtrainner.controller;

import com.api.gymtrainner.dto.category.MusclesCategoryDto;
import com.api.gymtrainner.dto.muscles.MusclesDto;
import com.api.gymtrainner.models.Muscles;
import com.api.gymtrainner.models.MusclesCategory;
import com.api.gymtrainner.response.ResponseHandler;
import com.api.gymtrainner.services.musclesCategory.MusclesCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/muscles-category")
public class MusclesCategoryController {

    @Autowired
    MusclesCategoryService musclesCategoryService;


    @GetMapping("/list")
    public ResponseEntity<?> listMuscles(){
        try{
            List<MusclesCategory> musclesCategories = musclesCategoryService.list();

            return ResponseHandler.generateResponse("List muscles generate with success", HttpStatus.OK, musclesCategories);
        }catch (Exception e){
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

    @PostMapping("/store")
    public ResponseEntity<?> store(@RequestBody MusclesCategoryDto musclesCategoryDto){
        try{
            MusclesCategory musclesCategory = musclesCategoryService.store(musclesCategoryDto);

            return ResponseHandler.generateResponse("Muscle store with success", HttpStatus.OK, musclesCategory);
        }catch (Exception e){
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }
}
