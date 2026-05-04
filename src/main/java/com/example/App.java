package com.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        logger.info("Ứng dụng khởi chạy thành công!");
        logger.info("Kết quả phép cộng: {}", add(10, 5));
    }
    public static int add(int a, int b) { return a + b; }
}
