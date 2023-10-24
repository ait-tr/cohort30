package practice;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        // Задаем порт для подключения клиентов
        int port = 12345;
        try {
            // Создаем серверный сокет на определенном порту
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("Сервер запущен и ожидает подключения...");

            // Ожидаем подключения клиента
            Socket clientSocket = serverSocket.accept();

            // Получаем входной и выходной потоки для общения с клиентом
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // Получаем сообщение от клиента
            String clientMessage = reader.readLine();
            System.out.println("Получено сообщение от клиента: " + clientMessage);

            // Преобразуем сообщение и отправляем его обратно клиенту
            String response = clientMessage.toUpperCase();
            writer.println(response);

            // Закрываем соединения
            reader.close();
            writer.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}