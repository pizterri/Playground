package com.sandro.HeatingService.controller;

import com.sandro.HeatingService.service.HeatingRestService;
import com.sandro.HeatingService.service.JokeRestService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeatingController {

    private RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
    private HeatingRestService heatingRestService = new HeatingRestService(restTemplateBuilder);

    String heatUrl             = "http://dv.webremote.ch/login.php";


    @RequestMapping("/heating")
    public String doLogin() {
        return heatingRestService.getResponseString(heatUrl);
    }

    @RequestMapping("/data")
    public String getData() {
        return heatingRestService.getData(heatUrl);
    }
}

