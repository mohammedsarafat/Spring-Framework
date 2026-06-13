package com.nit.service;

import org.springframework.stereotype.Component;

@Component("deepl")
public class DeepLTranslator implements TranslationService {

    @Override
    public double getCostPerWord() {
        return 0.55;
    }

    @Override
    public String getTranslatorName() {
        return "DeepL";
    }
}
