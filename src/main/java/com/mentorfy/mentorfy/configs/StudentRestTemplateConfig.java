package com.mentorfy.mentorfy.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class StudentRestTemplateConfig {

    @Bean
    public RestTemplate getStudentRestTemplate(){
        return new RestTemplate();
    }
}
