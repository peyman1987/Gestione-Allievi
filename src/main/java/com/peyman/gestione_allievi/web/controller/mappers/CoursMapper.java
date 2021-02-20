package com.peyman.gestione_allievi.web.controller.mappers;

import com.peyman.gestione_allievi.domain.Cours;
import com.peyman.gestione_allievi.web.model.CoursDto;
import org.mapstruct.Mapper;

@Mapper
public interface CoursMapper {

    Cours coursDtoToCours(CoursDto coursDto);

    CoursDto courseToCoursDto(Cours cours);
}
