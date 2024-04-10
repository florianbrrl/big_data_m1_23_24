package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.repositories.CassandraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CassandraService extends ServiceGeneriqueImpl<CassandraEntity, UUID> {
    @Autowired
    public CassandraServiceImpl(CassandraRepo cassandraRepo) {
        super(cassandraRepo);
    }
    // Additional methods specific to CassandraEntity
}
