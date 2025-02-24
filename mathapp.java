// MathApplication.java
package com.example.mathapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MathApplication {

    public static void main(String[] args) {
        SpringApplication.run(MathApplication.class, args);
    }

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "Result: " + (a + b);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        return "Result: " + (a - b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        return "Result: " + (a * b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return "Cannot divide by zero";
        }
        return "Result: " + (a / b);
    }
}
