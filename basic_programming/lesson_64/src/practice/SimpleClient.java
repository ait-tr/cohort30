package practice;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        // Задаем порт и хост сервера
        int port = 12345;
        String host = "localhost";
        try {
            // Соединяемся с сервером по адресу и порту
            Socket socket = new Socket(host, port);

            // Получаем входной и выходной потоки для общения с сервером
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Отправляем сообщение серверу
            String message = "Привет, сервер!";
            writer.println(message);

            // Получаем и выводим ответ от сервера
            String response = reader.readLine();
            System.out.println("Ответ от сервера: " + response);

            // Закрываем соединения
            reader.close();
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}