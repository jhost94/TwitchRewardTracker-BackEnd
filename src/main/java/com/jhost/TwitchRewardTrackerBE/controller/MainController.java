package com.jhost.TwitchRewardTrackerBE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

    @GetMapping("hello")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name){
        return "Hello, " + name + "!";
    }

    @GetMapping()
    public String test(){
        return "ITS WORKING";
    }
}
