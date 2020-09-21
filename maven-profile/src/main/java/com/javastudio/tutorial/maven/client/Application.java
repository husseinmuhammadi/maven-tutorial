package com.javastudio.tutorial.maven.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(com.javastudio.tutorial.maven.server.Application.class);

    public static void main(String[] args) {
        LOGGER.info("Here is the client");
    }
}
