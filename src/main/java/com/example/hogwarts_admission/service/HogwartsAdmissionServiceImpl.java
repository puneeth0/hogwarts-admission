package com.example.hogwarts_admission.service;

import com.example.hogwarts_admission.model.HarryPotterCharacter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HogwartsAdmissionServiceImpl implements HogwartsAdmissionService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public HarryPotterCharacter admitStudentToHogwarts(HarryPotterCharacter character) throws JsonProcessingException {
        String serviceUrl = "http://SPRING-DEMO/potter/characters";
        String url = "http://localhost:8082/potter/characters";
        restTemplate.getInterceptors().add(
                new BasicAuthenticationInterceptor("admin", "admin123")
        );
        ResponseEntity<String> response = restTemplate.postForEntity(serviceUrl, character, String.class);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.getBody(), HarryPotterCharacter.class);
    }
}
