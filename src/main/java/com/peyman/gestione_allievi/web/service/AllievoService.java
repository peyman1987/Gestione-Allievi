package com.peyman.gestione_allievi.web.service;

import com.peyman.gestione_allievi.web.model.AllievoDto;

import java.util.UUID;

public interface AllievoService {
    AllievoDto getAllievoById(UUID allievoId);
}
