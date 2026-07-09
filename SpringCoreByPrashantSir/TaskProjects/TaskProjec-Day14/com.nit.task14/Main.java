package com.nit.task14;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
    	

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/task14/application-context.xml");

        LibraryService service = context.getBean("libraryService", LibraryService.class);

        System.out.println("\n===== Name -> Code Map =====");
        System.out.println(service.getLibraryMap());

        Library lib = context.getBean("library1", Library.class);

        int code = lib.getLibraryCode();

        System.out.println("\nSearching Library with Code : " + code);

        Library result = service.searchLibrary(code);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Library Not Found...");
        }

        context.close();
    }

}
