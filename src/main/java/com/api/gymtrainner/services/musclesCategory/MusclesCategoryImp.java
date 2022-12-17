package com.api.gymtrainner.services.musclesCategory;

import com.api.gymtrainner.dto.category.MusclesCategoryDto;
import com.api.gymtrainner.exception.ExceptionBasic;
import com.api.gymtrainner.models.Muscles;
import com.api.gymtrainner.models.MusclesCategory;
import com.api.gymtrainner.repository.MusclesCategoryRepository;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusclesCategoryImp implements MusclesCategoryService{

    @Autowired
    MusclesCategoryRepository musclesCategoryRepository;

    public List<MusclesCategory> list(){
        List<MusclesCategory> musclesCategories = musclesCategoryRepository.findAll();
        return musclesCategories;
    }

    public MusclesCategory store(MusclesCategoryDto musclesCategoryDto) throws ConstraintViolationException, ExceptionBasic {
        Optional<MusclesCategory> searchMuscle = musclesCategoryRepository.findByMuscleCategory(musclesCategoryDto.getName());
        if(searchMuscle.isPresent()){
            throw new ExceptionBasic(ExceptionBasic.AlreadyExists());
        }
        MusclesCategory musclesCategory = new MusclesCategory();
        musclesCategory.setName(musclesCategoryDto.getName());
        musclesCategory.setBigCategoryMuscle(musclesCategoryDto.getBigCategoryMuscle());

        return musclesCategoryRepository.save(musclesCategory);
    }
}
