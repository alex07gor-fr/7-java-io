package com.example.task01;

import java.io.IOException;
import java.io.InputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        // Пример для ручной проверки
        /*
        byte[] data = new byte[]{0x33, 0x45, 0x01};
        System.out.println(checkSumOfStream(new java.io.ByteArrayInputStream(data))); // Должно быть 71
        */
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checksum = 0;
        int b;
        
        while ((b = inputStream.read()) != -1) {
            // Циклический сдвиг влево на 1 бит и XOR с текущим байтом
            checksum = Integer.rotateLeft(checksum, 1) ^ b;
        }
        
        return checksum;
    }
}
