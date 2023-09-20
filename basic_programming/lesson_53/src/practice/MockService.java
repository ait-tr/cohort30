package practice;

import java.util.HashMap;

public class MockService {
    private static final HashMap<String, String> loginPasswordMap = new HashMap<>();

    private String data;
    private String login;
    private String password;

    // Приватный конструктор, чтобы запретить прямое создание экземпляров
    private MockService(String login, String password, String data) {
        this.login = login;
        this.password = password;
        this.data = data;
    }

    // Метод для создания экземпляра MockService
    public static MockService create(String login, String password) {
        if (loginPasswordMap.containsKey(login)) {
            System.out.println("Такой логин уже существует!");
            return null;
        }

        loginPasswordMap.put(login, password);
        return new MockService(login, password, "Информация только для зарегистрированных пользователей");
    }

    // Метод для получения данных
    public String getData(String login, String password) {
        if (validate(login, password)) {
            return data;
        }
        return "Неверный логин или пароль!";
    }

    // Валидация пользователя
    private boolean validate(String login, String password) {
        String savedPassword = loginPasswordMap.get(login);
        return savedPassword != null && savedPassword.equals(password);
    }

    // Дополнительный метод для обновления пароля
    public void updatePassword(String login, String oldPassword, String newPassword) {
        if (validate(login, oldPassword)) {
            loginPasswordMap.put(login, newPassword);
            this.password = newPassword;
            System.out.println("Пароль успешно обновлен!");
        } else {
            System.out.println("Неверный старый пароль!");
        }
    }
}

