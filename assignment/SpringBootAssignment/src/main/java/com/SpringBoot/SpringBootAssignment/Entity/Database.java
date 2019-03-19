package com.SpringBoot.SpringBootAssignment.Entity;

import org.springframework.beans.factory.annotation.Value;

public class Database {

    @Value("${server.port}")
    private int port;

    @Value("${server.name}")
    private String name;

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
