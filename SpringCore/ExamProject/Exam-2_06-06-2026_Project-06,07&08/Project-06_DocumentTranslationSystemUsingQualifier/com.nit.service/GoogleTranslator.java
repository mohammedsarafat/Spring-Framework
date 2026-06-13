package com.nit.service;

import org.springframework.stereotype.Component;

@Component("google")
public class GoogleTranslator implements TranslationService {

    @Override
    public double getCostPerWord() {
        return 0.50;
    }

    @Override
    public String getTranslatorName() {
        return "Google";
    }
}
