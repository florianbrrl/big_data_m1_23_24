package fr.miage.m1.big_data_m1_23_24.controllers;

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
}