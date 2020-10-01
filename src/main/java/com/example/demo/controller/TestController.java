package com.example.demo.controller;

import com.example.demo.model.WorldTime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @GetMapping("/world-time")
    public WorldTime getWorldTime() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WorldTime> result = restTemplate.getForEntity("http://worldtimeapi.org/api/timezone/Europe/Bucharest.json", WorldTime.class);
        System.out.println(result.getBody());
        return result.getBody();
    }
}
