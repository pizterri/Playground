package com.sandro.joke.api;

import com.sandro.joke.model.InlineResponse200;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-09T20:41:00.421911600+01:00[Europe/Zurich]")
@Controller
@RequestMapping("${openapi.sampleJokes.base-path:}")
public class RandomJokeApiController implements RandomJokeApi {

    private final NativeWebRequest request;

    @Autowired
    public RandomJokeApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<InlineResponse200> randomJokeGet() {
        InlineResponse200 inlineResponse200 = new InlineResponse200();
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    inlineResponse200.setPunchline("This is my Joke");
                    inlineResponse200.setId((long) 1);
                    inlineResponse200.setType("DadJoke");
                    inlineResponse200.setSetup("This is my setup");
                    //String exampleString = "{ \"punchline\" : \"A Stick.\", \"setup\" : \"What do you call a boomerang that won't come back?\", \"id\" : 1, \"type\" : \"general\" }";
                    //ApiUtil.setExampleResponse(request, "application/json", exampleString);

                    break;
                }
            }
        });
        //return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return ResponseEntity.ok(inlineResponse200);
    };
}
