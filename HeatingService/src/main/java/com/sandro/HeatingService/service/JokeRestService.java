package com.sandro.HeatingService.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeRestService {

    private final RestTemplate restTemplate;

    public JokeRestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getResponseString(String uri) {
        return this.restTemplate.getForEntity(uri, String.class).getBody();

               // getForEntity(uri, String.class).getBody();;
    }

}