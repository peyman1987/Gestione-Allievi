package com.peyman.gestione_allievi.web.controller.mappers;

import com.peyman.gestione_allievi.domain.Allievo;
import com.peyman.gestione_allievi.web.model.AllievoDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface AllievoMapper {

    AllievoDto allievoToAllievoDto(Allievo allievo);

    Allievo allievoDtoToAllievo(AllievoDto allievoDto);
}
