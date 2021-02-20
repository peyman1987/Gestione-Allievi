package com.peyman.gestione_allievi.service;

import com.peyman.gestione_allievi.web.model.AllievoDto;

import java.util.UUID;

public interface AllievoService {
    AllievoDto getAllievoById(UUID allievoId);

    AllievoDto saveNewAllievo(AllievoDto allievoDto);

    void updateAllievo(UUID allievoId, AllievoDto allievoDto);

    void deledById(UUID allievoId);
}
