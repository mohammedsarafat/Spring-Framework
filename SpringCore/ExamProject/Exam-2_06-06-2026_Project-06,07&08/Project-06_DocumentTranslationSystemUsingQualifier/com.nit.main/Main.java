
package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.entity.Document;
import com.nit.service.DocumentTranslationService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		DocumentTranslationService service = context.getBean(DocumentTranslationService.class);

		Document document = new Document(101, "ProjectReport", "English", "French", 6000);

		service.translateDocument(document);
	}
}
