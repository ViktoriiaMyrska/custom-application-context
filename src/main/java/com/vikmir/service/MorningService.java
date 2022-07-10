package com.vikmir.service;

import com.vikmir.Bean;

//@Bean
public class MorningService implements GreetingService{
    @Override
    public void ola() {
        System.out.println("Ola! Bom dia!");
    }
}
