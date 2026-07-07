package com.nit.project05;

import java.util.Properties;

public class EmailConfig {

    private Properties config;

    public EmailConfig() {
    }

    public EmailConfig(Properties config) {
        this.config = config;
    }

    public Properties getConfig() {
        return config;
    }

    public void setConfig(Properties config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "EmailConfig [config=" + config + "]";
    }
}