package io.gocklkatz.tsp.RestInTsp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestInTspController {

    @GetMapping(path = "/tsp")
    public String getTsp(){
        return "{ status: 'error', message: 'Not implemented yet!' }";
    }

}
