package practice;

import java.io.*;
import java.net.*;

public class HttpServer {
    public static void main(String[] args) {
        int port = 8080; // стандартный порт для HTTP
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Сервер запущен на порту " + port);
            System.out.println("http://localhost:8080");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                // Чтение HTTP-запроса от клиента
                String line;
                while (!(line = reader.readLine()).isEmpty()) {
                    System.out.println(line);
                }

                // Формирование и отправка HTTP-ответа
                String response = "<html><body><h1>Привет от сервера!</h1></body></html>";
                writer.write("HTTP/1.1 200 OK\r\n");
                writer.write("Content-Type: text/html; charset=utf-8\r\n");
                writer.write("Content-Length: " + response.length() + "\r\n");
                writer.write("\r\n");
                writer.write(response);

                // Закрытие потоков и сокета
                writer.flush();
                reader.close();
                writer.close();
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
