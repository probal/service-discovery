package com.probal.microservice2.resource;

import com.probal.microservice2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by probal on 13/2/19.
 */
@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("{id}")
    public User fetchUserFromRemote(@PathVariable String id) {
        String url = "http://user-service:8001/user/find/" + id;
        return restTemplate.getForObject(url, User.class);
    }

}
