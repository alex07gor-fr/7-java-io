package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prev = -1;
        int curr;

        while ((curr = System.in.read()) != -1) {
            // Если предыдущий был \r (13), а текущий \n (10)
            if (prev == 13 && curr == 10) {
                System.out.write(10); // Пишем только \n
            } else {
                if (prev != -1) {
                    System.out.write(prev);
                }
            }
            prev = curr; // Сдвигаем окно
        }
        
        if (prev != -1) {
            System.out.write(prev);
        }
        
        System.out.flush();
    }
}
