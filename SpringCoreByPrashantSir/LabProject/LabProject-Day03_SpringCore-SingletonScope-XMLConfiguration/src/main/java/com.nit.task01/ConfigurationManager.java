package com.nit.task01;

public class ConfigurationManager {

    private String applicationName;
    private String environment;

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    // Getters
    public String getApplicationName() {
        return applicationName;
    }

    public String getEnvironment() {
        return environment;
    }

    public void displayConfiguration() {
        System.out.println("Application Name : " + applicationName);
        System.out.println("Environment      : " + environment);
    }
}
