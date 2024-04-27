package de.ait.demouser.repository;

import java.util.List;

//CRUD - Create,Read,Update,Delete ( создать,получить,обновить,удалить)
public interface CrudRepository<T> {

    T findById(Long id); // поиск по id

    List<T> findAll();// получить все данные

    void save(T model); // cохранить обьект в хранилище

}
