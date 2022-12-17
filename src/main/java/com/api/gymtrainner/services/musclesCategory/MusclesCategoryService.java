package com.api.gymtrainner.services.musclesCategory;

import com.api.gymtrainner.dto.category.MusclesCategoryDto;
import com.api.gymtrainner.exception.ExceptionBasic;
import com.api.gymtrainner.models.MusclesCategory;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public interface MusclesCategoryService {

    public List<MusclesCategory> list();

    public MusclesCategory store(MusclesCategoryDto musclesCategoryDto) throws ConstraintViolationException, ExceptionBasic;
}
