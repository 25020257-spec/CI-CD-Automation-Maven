package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Chay ngon lanh roi!");
        logger.info("Ket qua add: {}", add(10, 20));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
