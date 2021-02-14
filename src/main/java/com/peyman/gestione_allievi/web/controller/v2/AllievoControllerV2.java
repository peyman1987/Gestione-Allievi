package com.peyman.gestione_allievi.web.controller.v2;

import com.peyman.gestione_allievi.web.model.v2.AllievoDtoV2 ;
import com.peyman.gestione_allievi.web.service.AllievoService;
import com.peyman.gestione_allievi.web.service.v2.AllievoServiceV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v2/allievo")
@RestController
public class AllievoControllerV2 {

    private final AllievoServiceV2 allievoService;

    public AllievoControllerV2 (AllievoServiceV2  allievoService) {
        this.allievoService = allievoService;
    }

    @GetMapping({"/{allievoId}"})
    public ResponseEntity<AllievoDtoV2 > getAllievo(@PathVariable("allievoId") UUID allievoId){

        return new ResponseEntity<>(allievoService.getAllievoById(allievoId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AllievoDtoV2 > handlePost(@PathVariable AllievoDtoV2  allievoDto){
        AllievoDtoV2  savedDto = allievoService.saveNewAllievo(allievoDto);

        HttpHeaders headers = new HttpHeaders();
        // http://localhost:8081/
        headers.add("Location","/api/v1/allievo/" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{allievoId}"})
    public ResponseEntity handleUpdate(@PathVariable("allievoId") UUID allievoId, AllievoDtoV2  allievoDto){

        allievoService.updateAllievo(allievoId, allievoDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{allievoId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletAllievo(@PathVariable("allievoId") UUID allievoId){
        allievoService.deledById(allievoId);

    }
}
