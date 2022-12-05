package com.sandro.HeatingService.controller;

        import com.sandro.HeatingService.service.JokeRestService;
        import org.springframework.boot.web.client.RestTemplateBuilder;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    private RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
    private JokeRestService jokeRestService = new JokeRestService(restTemplateBuilder);

    String Jokeuri             = "https://official-joke-api.appspot.com/random_joke";


    @RequestMapping("/joke")
    public String returnJoke() {
        return jokeRestService.getResponseString(Jokeuri);
    }
}

