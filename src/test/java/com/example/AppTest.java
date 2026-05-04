package com.example;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void testCrossPlatformPath() {
        // Sử dụng File.separator để tự động chuyển thành / (Linux) hoặc \ (Windows)
        String path = "target" + File.separator + "data.txt";
        
        System.out.println("Path dang test: " + path);
        
        // Kiểm tra xem đường dẫn có chứa từ 'target' không (để test logic)
        assertTrue(path.contains("target"));
    }
}
