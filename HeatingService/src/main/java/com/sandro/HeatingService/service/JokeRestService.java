package com.sandro.HeatingService.service;

import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.model.InlineResponse200;
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
        String jokeString = new String();
        InlineResponse200 inlineResponse200 = new InlineResponse200();
        DefaultApi jokeApi = new DefaultApi();
        inlineResponse200= jokeApi.randomJokeGet();
        jokeString = "Joke #"
        +inlineResponse200.getId().toString()
        + "<br>"
        + inlineResponse200.getSetup()
        + "<br> -------- <br>"
        +inlineResponse200.getPunchline();
        //jokeString.concat(inlineResponse200.toString());
        return jokeString;
        //return this.restTemplate.getForEntity(uri, String.class).getBody();

               // getForEntity(uri, String.class).getBody();;
    }

}