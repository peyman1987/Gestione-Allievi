package com.peyman.gestione_allievi.web.controller.mappers;

import com.peyman.gestione_allievi.domain.Cours;
import com.peyman.gestione_allievi.web.model.CoursDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-20T22:56:57+0100",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
@Component
public class CoursMapperImpl implements CoursMapper {

    @Override
    public Cours coursDtoToCours(CoursDto coursDto) {
        if ( coursDto == null ) {
            return null;
        }

        Cours cours = new Cours();

        return cours;
    }

    @Override
    public CoursDto courseToCoursDto(Cours cours) {
        if ( cours == null ) {
            return null;
        }

        CoursDto coursDto = new CoursDto();

        return coursDto;
    }
}
