package com.nit.service;

import org.springframework.stereotype.Component;

@Component("microsoft")
public class MicrosoftTranslator implements TranslationService {

    @Override
    public double getCostPerWord() {
        return 0.45;
    }

    @Override
    public String getTranslatorName() {
        return "Microsoft";
    }
}
