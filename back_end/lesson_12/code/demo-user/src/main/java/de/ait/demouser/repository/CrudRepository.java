package de.ait.demouser.repository;

import de.ait.demouser.model.User;

import java.util.List;

//CRUD - Create,Read,Update,Delete ( создать,получить,обновить,удалить)
public interface CrudRepository<T> {

    T findById(Long id); // поиск по id

    List<T> findAll();// получить все данные

    void save(T model); // cохранить обьект в хранилище

    void update(T model);

    void deleteById(Long id);
}
