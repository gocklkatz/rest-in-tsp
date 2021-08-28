package io.gocklkatz.tsp.RestInTsp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestInTspController {

    /*
    /v1/tsp POST: saves new tsp instance and starts computation
        returns id of tsp instance
	/v1/tsp/{id}: get result (shortest route, cost)
        { status: "finished", route: "ABCD", cost: 4 }
        { status: "computing" }
        { status: "error", message: "Cost AC missing!" }
     */

    @GetMapping(path = "/tsp")
    public String getTsp(){
        return "{ status: 'error', message: 'Not implemented yet!' }";
    }

}
