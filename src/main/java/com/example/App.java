package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("--- CHUONG TRINH BAT DAU ---");
        logger.info("Ket qua phep tinh: {}", add(20, 26));
        logger.info("--- KET THUC ---");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
