package com.zeger.demospringboot.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Pavel Zeger
 * @implNote demo-springboot
 * @since 03/04/2021
 */
@Builder
@Data
public class Person {

    private String firstName;
    private String age;

}
