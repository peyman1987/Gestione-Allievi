package com.peyman.gestione_allievi.web.controller.v2;

import com.peyman.gestione_allievi.web.model.v2.AllievoDtoV2 ;
import com.peyman.gestione_allievi.service.v2.AllievoServiceV2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Validated
@RequestMapping("/api/v2/allievo")
@RestController
public class AllievoControllerV2 {

    private final AllievoServiceV2 allievoService;

//    public AllievoControllerV2 (AllievoServiceV2  allievoService) {
//        this.allievoService = allievoService;
//    }

    @GetMapping({"/{allievoId}"})
    public ResponseEntity<AllievoDtoV2 > getAllievo(@NotNull @PathVariable("allievoId") UUID allievoId){

        return new ResponseEntity<>(allievoService.getAllievoById(allievoId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AllievoDtoV2 > handlePost(@Valid @NotNull @RequestBody  AllievoDtoV2  allievoDto){

        log.debug("in handle post ...");
//        AllievoDtoV2  savedDto = allievoService.saveNewAllievo(allievoDto);
        val savedDto = allievoService.saveNewAllievo(allievoDto);

//        HttpHeaders headers = new HttpHeaders();
        val headers = new HttpHeaders();
        // http://localhost:8081/
        headers.add("Location","/api/v1/allievo/" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{allievoId}"})
    public ResponseEntity handleUpdate(@NotNull@PathVariable("allievoId") UUID allievoId, @Valid @RequestBody AllievoDtoV2  allievoDto){

        allievoService.updateAllievo(allievoId, allievoDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{allievoId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletAllievo(@PathVariable("allievoId") UUID allievoId){
        allievoService.deledById(allievoId);

    }


}
