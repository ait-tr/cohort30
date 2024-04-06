package de.ait.repository;

import de.ait.model.User;

import java.util.List;

public interface CrudRepository<T> {   //CRUD
    boolean save(T element);
    boolean save(List<T> list);

    List<T> findAll();

    /*
    update (Long id, T element)
    delete (Long id)
    User find(Long id)
     */

}
