package com.vikmir.service;

import com.vikmir.Bean;

@Bean
public class AfternoonService implements GreetingService{
    @Override
    public void ola() {
        System.out.println("Ola! Boa tarde!");
    }
}
