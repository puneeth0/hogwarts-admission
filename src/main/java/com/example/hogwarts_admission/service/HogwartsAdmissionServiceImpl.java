package com.example.hogwarts_admission.service;

import com.example.hogwarts_admission.model.HarryPotterCharacter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HogwartsAdmissionServiceImpl implements HogwartsAdmissionService {
    @Override
    public HarryPotterCharacter admitStudentToHogwarts(HarryPotterCharacter character) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8082/potter/characters";
        ResponseEntity<String> response = restTemplate.postForEntity(url, character, String.class);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.getBody(), HarryPotterCharacter.class);
    }
}