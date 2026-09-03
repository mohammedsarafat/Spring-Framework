package com.nit.onlinefooddeliverysystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DatabaseConnection {

    private String databaseName;

    public void connectDatabase() {

        System.out.println("Database Connected Successfully...");

    }
}
