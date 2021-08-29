package io.gocklkatz.tsp.restintsp.service;

import io.gocklkatz.tsp.restintsp.entity.Tsp;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TspService {
    private static List<Tsp> tsps = new ArrayList<>();

    static {
        int[][] distanceMatrix =  {
                {0,1,2,3,1},
                {1,0,5,2,3},
                {2,5,0,1,3},
                {3,2,1,0,4},
                {1,3,3,4,0}
        };
        tsps.add(new Tsp(1, 5, distanceMatrix));
    }

    public List<Tsp> findAll() {
        return tsps;
    }

    public Tsp findOne(int id) {
        for(Tsp tsp:tsps) {
            if(tsp.getId()==id) {
                return tsp;
            }
        }
        return null;
    }

    public Tsp save(Tsp tsp) {
        tsps.add(tsp);
        return tsp;
    }
}
