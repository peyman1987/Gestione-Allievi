package com.peyman.gestione_allievi.web.controller;

import com.peyman.gestione_allievi.web.model.AllievoDto;
import com.peyman.gestione_allievi.web.service.AllievoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/allievo")
@RestController
public class AllievoController {

    private AllievoService allievoService;

    public AllievoController(AllievoService allievoService) {
        this.allievoService = allievoService;
    }

    @GetMapping({"/{allievoId}"})
    public ResponseEntity<AllievoDto> getAllievo(@PathVariable("allievoId") UUID allievoId){

        return new ResponseEntity<>(allievoService.getAllievoById(allievoId), HttpStatus.OK);
    }
}
