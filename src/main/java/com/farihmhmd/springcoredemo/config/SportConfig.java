package com.farihmhmd.springcoredemo.config;

import com.farihmhmd.springcoredemo.common.Coach;
import com.farihmhmd.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
