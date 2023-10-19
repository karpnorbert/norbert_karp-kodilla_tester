package com.kodilla.spring.basic.spring_configuration;

import org.springframework.context.annotation.Primary;

public class Dog implements Animal {

    @Override
    @Primary
    public String getVoice() {
        return "Bark bark";
    }
}