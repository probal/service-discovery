package com.probal.microservice1.resource;

import com.probal.microservice1.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by probal on 13/2/19.
 */
@RestController
@RequestMapping("/user")
public class UserResource {

    Map<String, User> userMap = new HashMap() {{
        put("1", new User("1", "Probal", 100));
        put("2", new User("2", "Kabir", 200));
        put("3", new User("3", "Raj", 230));
        put("4", new User("4", "Rony", 400));
        put("5", new User("5", "Joy", 500));
    }};

    @GetMapping("/find/{id}")
    public User findById(@PathVariable String id) {
        return userMap.get(id);
    }
}
