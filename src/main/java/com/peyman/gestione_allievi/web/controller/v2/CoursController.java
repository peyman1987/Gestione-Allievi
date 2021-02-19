package com.peyman.gestione_allievi.web.controller.v2;

import com.peyman.gestione_allievi.web.model.CoursDto;
import com.peyman.gestione_allievi.web.service.CoursService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v2/cours")
@RestController
public class CoursController {

    private final CoursService courseService;

    public CoursController(CoursService courseService) {
        this.courseService = courseService;
    }

    @GetMapping({"/{coursId}"})
    public ResponseEntity<CoursDto> getCours(@PathVariable("coursId") UUID coursId){
        return new ResponseEntity<>(courseService.getCoursById(coursId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePst(@Valid @RequestBody CoursDto coursDto){
        CoursDto savedDto = courseService.saveNameCours(coursDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/v1/cours/" + savedDto.getId().toString() );
        return new ResponseEntity(headers, HttpStatus.NO_CONTENT);
    }
    @PutMapping({"/{coursId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable("coursId") UUID coursId, @RequestBody @Valid CoursDto coursDto){
        courseService.updateCoursById(coursId, coursDto);
    }

    @DeleteMapping({"/{coursId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("coursId") UUID coursId){
        courseService.deleteById(coursId);
    }



}
