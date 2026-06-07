package com.nit.beans;

public class Person {

    private String p_name;
    private int p_age;
    private String adress;
    private long mob_num;

    private Passport p;

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_age() {
        return p_age;
    }

    public void setP_age(int p_age) {
        this.p_age = p_age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getMob_num() {
        return mob_num;
    }

    public void setMob_num(long mob_num) {
        this.mob_num = mob_num;
    }

    public Passport getP() {
        return p;
    }

    public void setP(Passport p) {
        this.p = p;
    }

    public void display() {

    	System.out.println("Parson Details");
    	
        System.out.println("Person Name : " + p_name);
        System.out.println("Person Age  : " + p_age);
        System.out.println("Address     : " + adress);
        System.out.println("Mobile No   : " + mob_num);

        System.out.println("\nPassport Details");

        System.out.println("Passport Name    : " + p.getName());
        System.out.println("Passport Number  : " + p.getNumber());
        System.out.println("Country          : " + p.getCountry());
    }
}
