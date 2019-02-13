package com.probal.microservice1.model;

import lombok.*;

/**
 * Created by probal on 13/2/19.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private int salary;
}
