package fr.miage.m1.big_data_m1_23_24.repositories;

import fr.miage.m1.big_data_m1_23_24.entity.League;
import fr.miage.m1.big_data_m1_23_24.entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;


public interface LeagueRepository extends MongoRepository<League, String> {
    public League findByName(String name);
    public League findByType(String type);

    public void create (League league);

    public void deleteById (String id);

    public void updateById (String id);
}
