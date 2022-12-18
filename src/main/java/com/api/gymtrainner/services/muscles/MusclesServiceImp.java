package com.api.gymtrainner.services.muscles;

import com.api.gymtrainner.dto.muscles.MusclesDto;
import com.api.gymtrainner.exception.ExceptionBasic;
import com.api.gymtrainner.models.Muscles;
import com.api.gymtrainner.models.MusclesCategory;
import com.api.gymtrainner.repository.MusclesRepository;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusclesServiceImp implements MusclesService{

    @Autowired
    MusclesRepository musclesRepository;

    @Override
    public Muscles store(MusclesDto musclesDto) throws ConstraintViolationException, ExceptionBasic {
        Optional<Muscles> searchMuscle = musclesRepository.findByMuscle(musclesDto.getName());
        if(searchMuscle.isPresent()){
            throw new ExceptionBasic(ExceptionBasic.AlreadyExists());
        }
        Muscles muscles = new Muscles();
        MusclesCategory musclesCategory = new MusclesCategory();
        musclesCategory.setId(musclesDto.getMusclesCategory());

        muscles.setName(musclesDto.getName());
        muscles.setMusclesCategory(musclesCategory);

        return musclesRepository.save(muscles);
    }

    @Override
    public List<Muscles> listMuscles() throws ExceptionBasic {
        List<Muscles> result = musclesRepository.findAll();
        return result;
    }
}
