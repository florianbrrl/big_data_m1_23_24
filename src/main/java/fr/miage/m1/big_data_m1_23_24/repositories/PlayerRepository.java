package fr.miage.m1.big_data_m1_23_24.repositories;

import fr.miage.m1.big_data_m1_23_24.entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface PlayerRepository extends MongoRepository<Player, String> {
    public Player findByFirstname(String firstname);
    public List<Player> findAllByNationality(String firstname);
    public List<Player> findAllByNationalityAndTeam(String firstname);

    public void create (Player player);

    public void deleteById (String id);

    public void updateById (String id);
}
