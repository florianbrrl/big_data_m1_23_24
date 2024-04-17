package fr.miage.m1.big_data_m1_23_24.repositories;

import fr.miage.m1.big_data_m1_23_24.entity.League;
import fr.miage.m1.big_data_m1_23_24.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface TeamRepository extends MongoRepository<Team, String> {

    public Team findByName(String name);
    public Team findByCode(String code);

    public List<Team> findAllByCountry(String country);
    public List<Team> findAllByFounded(boolean founded);

    public void create (Team team);

    public void deleteById (String id);

    public void updateById (String id);


}
