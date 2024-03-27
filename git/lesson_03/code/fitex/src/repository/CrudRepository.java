package repository;

import java.util.List;

public interface CrudRepository<T> {
    void save(T model);
    void deleteById(int id);
    void update(int id, T model);
    T findById(int id);
    List<T> findAll();
}
