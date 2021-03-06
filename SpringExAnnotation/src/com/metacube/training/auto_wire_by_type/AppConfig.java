package com.metacube.training.auto_wire_by_type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public TextEditor textEditor() {
        
        return new TextEditor();
    }
    
    
    @Bean
    public SpellChecker spellChecker()
    {
        
        SpellChecker spellChecker = new SpellChecker();
        spellChecker.setStatus(true);
        return spellChecker;
    }
}
