package fr.miage.m1.big_data_m1_23_24.controllers;

import fr.miage.m1.big_data_m1_23_24.entity.Player;
import fr.miage.m1.big_data_m1_23_24.entity.Team;
import fr.miage.m1.big_data_m1_23_24.repositories.MongoRepo;
import fr.miage.m1.big_data_m1_23_24.services.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/mongo")
public class MongoController {
    private final MongoService mongoService;

    @Autowired
    public MongoController(MongoService mongoService) {
        this.mongoService = mongoService;
    }
    // Endpoint methods here

    //Get all Players
    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return mongoService.findAll();
    }

    //Get Player by ID
    @GetMapping("/players/{id}")
    public Player getPlayerById(@PathVariable String id) {
        return mongoService.findById(id);
    }

    //Create a new Player
    @PostMapping("/players")
    public Player createPlayer(@RequestBody Player player) {
        return mongoService.save(player);
    }

    // Get all Teams
    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        return mongoService.findAllTeams();
    }

    // Get Team by ID
    @GetMapping("/teams/{id}")
    public Team getTeamById(@PathVariable String id) {
        return mongoService.findTeamById(id);
    }

    // Create a new Team
    @PostMapping("/teams")
    public Team createTeam(@RequestBody Team team) {
        return mongoService.saveTeam(team);
    }

    //Get all Leagues
    @GetMapping("/leagues")
    public List<String> getAllLeagues() {
        return mongoService.findAllLeagues();
    }

    //Get all Teams in a League
    @GetMapping("/leagues/{league}")
    public List<Team> getTeamsInLeague(@PathVariable String league) {
        return mongoService.findTeamsInLeague(league);
    }

}