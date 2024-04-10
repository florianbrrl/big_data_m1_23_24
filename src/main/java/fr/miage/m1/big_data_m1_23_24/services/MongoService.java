package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.repositories.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MongoService extends ServiceGeneriqueImpl<MongoEntity, String> {
    @Autowired
    public MongoServiceImpl(MongoRepo mongoRepo) {
        super(mongoRepo);
    }
    // Additional methods specific to MongoEntity
}
