package io.gocklkatz.tsp.RestInTsp;

import io.gocklkatz.tsp.RestInTsp.entity.Tsp;
import io.gocklkatz.tsp.RestInTsp.service.TspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestInTspController {

    @Autowired
    private TspService service;

    @GetMapping("/tsp/{id}")
    public Tsp getTsp(@PathVariable int id){
        return service.findOne(id);
    }
}
