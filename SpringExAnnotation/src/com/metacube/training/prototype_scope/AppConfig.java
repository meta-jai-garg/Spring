package com.metacube.training.prototype_scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Person person() {
        
        Person person = new Person();
        person.setName("Jai");        
        return person;
    }

}
