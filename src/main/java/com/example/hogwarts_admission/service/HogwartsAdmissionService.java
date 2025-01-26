package com.example.hogwarts_admission.service;

import com.example.hogwarts_admission.model.HarryPotterCharacter;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface HogwartsAdmissionService {

    public HarryPotterCharacter admitStudentToHogwarts(HarryPotterCharacter character) throws JsonProcessingException;
}
