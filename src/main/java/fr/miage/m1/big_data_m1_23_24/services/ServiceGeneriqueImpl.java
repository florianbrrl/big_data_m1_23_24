package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.repositories.GeneriqueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceGeneriqueImpl<T, ID> implements ServiceGenerique<T, ID> {

    private final GeneriqueRepo<T, ID> generiqueRepo;

    @Autowired
    public ServiceGeneriqueImpl(GeneriqueRepo<T, ID> generiqueRepo) {
        this.generiqueRepo = generiqueRepo;
    }

    @Override
    public List<T> findAll() {
        return generiqueRepo.findAll();
    }

    @Override
    public T findById(ID id) {
        return generiqueRepo.findById(id).orElse(null);
    }

    @Override
    public T save(T entity) {
        return generiqueRepo.save(entity);
    }

    @Override
    public void delete(ID id) {
        generiqueRepo.deleteById(id);
    }
}
