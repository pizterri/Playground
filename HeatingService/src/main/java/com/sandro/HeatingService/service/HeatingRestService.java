package com.sandro.HeatingService.service;

import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.model.InlineResponse200;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;


@Service
public class HeatingRestService {

    private final RestTemplate restTemplate;

    public HeatingRestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getResponseString(String uri) {

    //    RestTemplate restTemplate = new RestTemplate();


  //      HttpHeaders headers = new HttpHeaders();
  //      headers.
  //      headers.set("Cookie", "PHPSESSID=vj7c1co8reb71tug3jgdvvahbl");

        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("username", "Au4417");
        formData.add("password", "xxxx");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(formData);

                //HttpEntity<>(formData, headers);



        String response = restTemplate.postForObject(
                "http://dv.webremote.ch/login.php",
                request,
                String.class
        );


        return response;

    }

    public String getData(String heatUrl) {
        return "Test";
    //    HttpHeaders dataHeader = new HttpHeaders();
    }
}