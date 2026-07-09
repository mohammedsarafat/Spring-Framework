package com.nit.task14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryService {

    private List<Library> libraries;

   
    public void setLibraries(List<Library> libraries) {
        System.out.println("Setter Injection Performed : libraries");
        this.libraries = libraries;
    }


    public List<Library> getLibraries() {
        return libraries;
    }

    public Map<String, Integer> getLibraryMap() {

        Map<String, Integer> map = new HashMap<>();

        for (Library library : libraries) {

            map.put(library.getLibraryName(),
                    library.getLibraryCode());

        }

        return map;
    }


    public Library searchLibrary(int libraryCode) {

        for (Library library : libraries) {

            if (library.getLibraryCode() == libraryCode) {

                return library;

            }

        }

        return null;

    }

    @Override
    public String toString() {

        return "LibraryService [libraries=" + libraries + "]";

    }

}
