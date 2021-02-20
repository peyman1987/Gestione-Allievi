package com.peyman.gestione_allievi.service;

import com.peyman.gestione_allievi.web.model.CoursDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CoursServiceImpl implements CoursService {
    @Override
    public CoursDto getCoursById(UUID coursId) {
        return CoursDto.builder()
                .id(UUID.randomUUID())
                .name("trx")
                .build();
    }

    @Override
    public CoursDto saveNameCours(CoursDto coursDto) {
        return coursDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCoursById(UUID coursId, CoursDto coursDto) {

    }

    @Override
    public void deleteById(UUID coursId) {
        log.debug("Deleting a cours");
    }
}
