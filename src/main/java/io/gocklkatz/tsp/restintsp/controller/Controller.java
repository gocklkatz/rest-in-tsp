package io.gocklkatz.tsp.restintsp.controller;

import io.gocklkatz.tsp.restintsp.entity.Tsp;
import io.gocklkatz.tsp.restintsp.service.TspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private TspService service;

    @GetMapping("/tsp/{id}")
    public Tsp getTsp(@PathVariable int id){
        return service.findOne(id);
    }

    @GetMapping("/tsp/{id}/solve")
    public Tsp solveTsp(@PathVariable int id){
        Tsp tsp = service.findOne(id);
        tsp.solve();
        return tsp;
    }
}
