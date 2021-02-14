package com.peyman.gestione_allievi.web.service;

import com.peyman.gestione_allievi.web.model.CoursDto;

import java.util.UUID;

public interface CoursService {


    CoursDto getCoursById(UUID coursId);

    CoursDto saveNameCours(CoursDto coursDto);

    void updateCoursById(UUID coursId, CoursDto coursDto);

    void deleteById(UUID coursId);
}
