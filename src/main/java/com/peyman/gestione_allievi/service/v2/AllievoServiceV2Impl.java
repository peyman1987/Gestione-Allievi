package com.peyman.gestione_allievi.service.v2;

import com.peyman.gestione_allievi.web.model.v2.AllievoDtoV2;
import com.peyman.gestione_allievi.web.model.v2.LevelEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AllievoServiceV2Impl implements AllievoServiceV2 {
    @Override
    public AllievoDtoV2 getAllievoById(UUID allievoId) {
        return AllievoDtoV2.builder().id(UUID.randomUUID())
                .firstName("Mario")
                .lastName("Rossi")
                .email("r.rosssi@mail.com")
                .age(33)
                .level(LevelEnum.LOW)
                .build();
    }

    @Override
    public AllievoDtoV2 saveNewAllievo(AllievoDtoV2 allievoDto) {
        return null;
    }

    @Override
    public void updateAllievo(UUID allievoId, AllievoDtoV2 allievoDto) {

    }

    @Override
    public void deledById(UUID allievoId) {

    }
}
