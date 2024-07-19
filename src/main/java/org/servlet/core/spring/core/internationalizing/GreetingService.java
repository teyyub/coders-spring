package org.servlet.core.spring.core.internationalizing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

//@Service
public class GreetingService {

    @Autowired
    private MessageSource messageSource;

    public String getGreeting(Locale locale) {
        return messageSource.getMessage("greeting", null, locale);
    }
}