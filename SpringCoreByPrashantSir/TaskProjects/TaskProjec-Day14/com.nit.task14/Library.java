package com.nit.task14;

import java.util.List;
import java.util.Random;

public class Library {

    private int libraryCode;
    private String libraryName;
    private String inChargePerson;
    private long contactNumber;
    private List<String> genres;

   
    public Library() {
        System.out.println("Library Object Created...");
    }

    public Library(String libraryName) {
        this.libraryName = libraryName;
        System.out.println("Library Parameterized Constructor Called...");
    }

    public void setLibraryName(String libraryName) {
        System.out.println("Setter Injection Performed : libraryName");
        this.libraryName = libraryName;
    }

    public void setInChargePerson(String inChargePerson) {
        System.out.println("Setter Injection Performed : inChargePerson");
        this.inChargePerson = inChargePerson;
    }

    public void setContactNumber(long contactNumber) {
        System.out.println("Setter Injection Performed : contactNumber");
        this.contactNumber = contactNumber;
    }

    public void setGenres(List<String> genres) {
        System.out.println("Setter Injection Performed : genres");
        this.genres = genres;
    }


    public int getLibraryCode() {
        return libraryCode;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getInChargePerson() {
        return inChargePerson;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void initialize() {

        Random random = new Random();

        this.libraryCode = 1000 + random.nextInt(9000);

        System.out.println("Library Initialized...");
        System.out.println("Generated Library Code : " + libraryCode);

    }

   
    public void destroy() {

        System.out.println("Destroy Method Called...");

        libraryCode = 0;
        libraryName = null;
        inChargePerson = null;
        contactNumber = 0L;

        if (genres != null) {
            genres.clear();
        }

        genres = null;

        System.out.println("Library Object Cleaned Successfully.");

    }

   
    @Override
    public String toString() {
        return "Library [libraryCode=" + libraryCode +
                ", libraryName=" + libraryName +
                ", inChargePerson=" + inChargePerson +
                ", contactNumber=" + contactNumber +
                ", genres=" + genres + "]";
    }

}
