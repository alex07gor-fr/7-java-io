package com.example.task03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        // Для ручной проверки
        /*
        byte[] data = new byte[]{48, 49, 50, 51};
        System.out.println(readAsString(new java.io.ByteArrayInputStream(data), Charset.forName("ASCII"))); // "0123"
        */
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder sb = new StringBuilder();
        
        try (Reader reader = new InputStreamReader(inputStream, charset)) {
            char[] buffer = new char[1024];
            int length;
            // Читаем блоками для эффективности
            while ((length = reader.read(buffer)) != -1) {
                sb.append(buffer, 0, length);
            }
        }
        
        return sb.toString();
    }
}
