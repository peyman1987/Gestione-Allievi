package com.peyman.gestione_allievi.web.controller;

import com.peyman.gestione_allievi.web.model.AllievoDto;
import com.peyman.gestione_allievi.web.service.AllievoService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<AllievoDto> handlePost(@PathVariable AllievoDto allievoDto){
        AllievoDto savedDto = allievoService.saveNewAllievo(allievoDto);

        HttpHeaders headers = new HttpHeaders();
        // http://localhost:8081/
        headers.add("Location","/api/v1/allievo/" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{allievoId}"})
    public ResponseEntity handleUpdate(@PathVariable("allievoId") UUID allievoId, AllievoDto allievoDto){

        allievoService.updateAllievo(allievoId, allievoDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{allievoId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletAllievo(@PathVariable("allievoId") UUID allievoId){
        allievoService.deledById(allievoId);

    }
}
