package de.ait.repository;

import de.ait.model.User;
import lombok.AllArgsConstructor;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class FileUserRepositoryImpl implements CrudRepository<User>{
    File file;

    @Override
    public boolean save(User user) {
        try (FileWriter writer = new FileWriter(file,true);) {
                writer.write(user.getName() + ";" + user.getEmail() + "\n");
                System.out.println("Данные успешно записаны в файл " + file);
            return true;
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean save(List<User> list) {
        try (FileWriter writer = new FileWriter(file,true);) {
            for (User user : list) {
                writer.write(user.getName() + ";" + user.getEmail() + "\n");
            }
            System.out.println("Данные успешно записаны в файл " + file);
            return true;
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<User> findAll() {
        try(var reader = new BufferedReader(new FileReader(file))){
            return reader.lines()
                    .map(u -> u.split(";"))
                    .map(arr -> new User(arr[0], arr[1]))
                    .collect(Collectors.toList());
        } catch (IOException e){
            System.out.println("Ошибка чтения");
        }
        return Collections.EMPTY_LIST;
    }
}
