package com.vikmir.service;

import com.vikmir.Bean;

@Bean
public class EveningService implements GreetingService{
    @Override
    public void ola() {
        System.out.println("Ola! Boa noite");
    }
}
