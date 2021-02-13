package com.peyman.gestione_allievi.web.service;

import com.peyman.gestione_allievi.web.model.AllievoDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

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
}
