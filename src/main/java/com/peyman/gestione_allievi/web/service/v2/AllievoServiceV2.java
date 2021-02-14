package com.peyman.gestione_allievi.web.service.v2;

import com.peyman.gestione_allievi.web.model.v2.AllievoDtoV2;

import java.util.UUID;

public interface AllievoServiceV2 {
    AllievoDtoV2 getAllievoById(UUID allievoId);

    AllievoDtoV2 saveNewAllievo(AllievoDtoV2 allievoDto);

    void updateAllievo(UUID allievoId, AllievoDtoV2 allievoDto);

    void deledById(UUID allievoId);
}
