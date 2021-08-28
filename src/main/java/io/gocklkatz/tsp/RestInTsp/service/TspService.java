package io.gocklkatz.tsp.RestInTsp.service;

import io.gocklkatz.tsp.RestInTsp.entity.Tsp;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TspService {
    private static List<Tsp> tsps = new ArrayList<>();

    static {
        List<Integer> distances = new ArrayList<>();
        distances.add(1);
        distances.add(4);
        distances.add(1);
        distances.add(1);
        distances.add(7);
        distances.add(1);
        tsps.add(new Tsp(1, 4, distances));
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
