package com.example.hogwarts_admission.controller;

import com.example.hogwarts_admission.model.HarryPotterCharacter;
import com.example.hogwarts_admission.service.HogwartsAdmissionService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hogwarts/admission")
public class HogwartsAdmissionController {

    private final HogwartsAdmissionService service;

    public HogwartsAdmissionController(HogwartsAdmissionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String>  addStudentToUniversity(@RequestBody HarryPotterCharacter character) throws JsonProcessingException {
        character = service.admitStudentToHogwarts(character);
        return ResponseEntity.ok("Character created successfully with ID: " + character.getId());
    }

}
