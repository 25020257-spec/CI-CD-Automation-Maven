package com.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        logger.info("Dang chay ung dung Maven...");
        System.out.println("Ket qua phep tinh: " + sum(5, 5));
    }
    public static int sum(int a, int b) { return a + b; }
}
