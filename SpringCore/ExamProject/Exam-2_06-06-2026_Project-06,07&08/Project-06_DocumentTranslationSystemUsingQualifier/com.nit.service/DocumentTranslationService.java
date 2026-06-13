package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nit.entity.Document;

@Service
public class DocumentTranslationService {

	private TranslationService translationService;

	@Autowired
	public DocumentTranslationService(@Qualifier("google") TranslationService translationService) {

		this.translationService = translationService;
	}

	public void translateDocument(Document document) {

		if (document.getDocumentName() == null || document.getDocumentName().trim().isEmpty()) {

			throw new IllegalArgumentException("Document name cannot be empty");
		}

		if (document.getSourceLanguage().equalsIgnoreCase(document.getTargetLanguage())) {

			throw new IllegalArgumentException("Source and target languages cannot be same");
		}

		if (document.getWordCount() <= 0) {

			throw new IllegalArgumentException("Word count must be greater than 0");
		}

		double translationCost = document.getWordCount() * translationService.getCostPerWord();

		double discount = 0;

		if (document.getWordCount() > 5000) {
			discount = translationCost * 0.10;
		}

		double finalCost = translationCost - discount;

		IO.println("Document Name: " + document.getDocumentName());

		IO.println("Word Count: " + document.getWordCount());

		IO.println("Translator: " + translationService.getTranslatorName());

		IO.println();

		IO.println("Translation Cost: " + translationCost);

		IO.println("Discount: " + discount);

		IO.println("Final Cost: " + finalCost);

		IO.println("Translation Completed Successfully");
	}
}
