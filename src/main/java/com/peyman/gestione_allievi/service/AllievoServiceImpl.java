package com.peyman.gestione_allievi.service;

import com.peyman.gestione_allievi.web.model.AllievoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class AllievoServiceImpl implements AllievoService {
    @Override
    public AllievoDto getAllievoById(UUID allievoId) {
        return AllievoDto.builder().id(UUID.randomUUID())
                .firstName("Mario")
                .lastName("Rossi")
                .email("r.rosssi@mail.com")
                .age(33)
                .build();
    }

    @Override
    public AllievoDto saveNewAllievo(AllievoDto allievoDto) {
        return AllievoDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateAllievo(UUID allievoId, AllievoDto allievoDto) {

    }

    @Override
    public void deledById(UUID allievoId) {
        log.debug("Deleting an Allievo");
    }
}
