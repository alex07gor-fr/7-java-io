package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0.0;
        String line;

        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split("\\s+");
            
            for (String token : tokens) {
                if (token.isEmpty()) continue;
                try {
                    // Пытаемся распарсить как число
                    double num = Double.parseDouble(token);
                    sum += num;
                } catch (NumberFormatException e) {
                    // Если не число (например, "a1" или "11bbb"), игнорируем
                }
            }
        }

        System.out.printf(Locale.ROOT, "%.6f\n", sum);
    }
}
