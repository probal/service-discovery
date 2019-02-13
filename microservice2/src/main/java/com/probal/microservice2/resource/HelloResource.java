package com.probal.microservice2.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by probal on 13/2/19.
 */
@RestController
public class HelloResource {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/replyHello")
    public String replyHello() {
        return "Hello from app2";
    }

    @GetMapping("/askHello")
    public String askHello() {
        String url = "http://microservice1:8001/replyHello";
        return restTemplate.getForObject(url, String.class);
    }
}
