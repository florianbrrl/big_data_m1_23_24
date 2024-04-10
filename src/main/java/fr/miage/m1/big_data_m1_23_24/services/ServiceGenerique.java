package fr.miage.m1.big_data_m1_23_24.services;

import java.util.List;

public interface ServiceGenerique<T, ID> {
    List<T> findAll();
    T findById(ID id);
    T save(T entity);
    void delete(ID id);
    // Other common methods
}