package com.api.gymtrainner.services.muscles;

import com.api.gymtrainner.dto.muscles.MusclesDto;
import com.api.gymtrainner.exception.ExceptionBasic;
import com.api.gymtrainner.models.Muscles;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface MusclesService {

    Muscles store(@RequestBody MusclesDto musclesDto) throws ExceptionBasic;
    List<Muscles> listMuscles() throws ExceptionBasic;
}
