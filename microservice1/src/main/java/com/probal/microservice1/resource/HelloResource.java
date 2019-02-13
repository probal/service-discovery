package com.probal.microservice1.resource;

import com.probal.microservice1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by probal on 13/2/19.
 */
@RestController
public class HelloResource {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/replyHello")
    public String replyHello() {
        return "Hello from app1";
    }

    @GetMapping("/askHello")
    public String askHello() {

        String url = "http://microservice2:8002/replyHello";
        return restTemplate.getForObject(url, String.class);
    }
}
