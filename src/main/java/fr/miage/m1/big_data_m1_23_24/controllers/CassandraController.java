package fr.miage.m1.big_data_m1_23_24.controllers;

import fr.miage.m1.big_data_m1_23_24.services.CassandraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cassandra")
public class CassandraController {
    private final CassandraService cassandraService;

    @Autowired
    public CassandraController(CassandraService cassandraService) {
        this.cassandraService = cassandraService;
    }
    // Endpoint methods here
}