package com.api.gymtrainner.dto.muscles;

import com.api.gymtrainner.models.MusclesCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@Setter
@Getter
public class MusclesDto {

    private UUID id;
    private String name;
    private UUID musclesCategory;

}
