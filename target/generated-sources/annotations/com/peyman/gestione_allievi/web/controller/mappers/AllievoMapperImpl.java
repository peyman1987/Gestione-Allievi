package com.peyman.gestione_allievi.web.controller.mappers;

import com.peyman.gestione_allievi.domain.Allievo;
import com.peyman.gestione_allievi.web.model.AllievoDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-20T22:56:57+0100",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
@Component
public class AllievoMapperImpl implements AllievoMapper {

    @Override
    public AllievoDto allievoToAllievoDto(Allievo allievo) {
        if ( allievo == null ) {
            return null;
        }

        AllievoDto allievoDto = new AllievoDto();

        return allievoDto;
    }

    @Override
    public Allievo allievoDtoToAllievo(AllievoDto allievoDto) {
        if ( allievoDto == null ) {
            return null;
        }

        Allievo allievo = new Allievo();

        return allievo;
    }
}
