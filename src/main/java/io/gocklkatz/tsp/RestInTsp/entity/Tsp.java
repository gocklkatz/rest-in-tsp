package io.gocklkatz.tsp.RestInTsp.entity;

import java.util.List;

public class Tsp {
    private int id;
    private int numberOfCities;
    private List<Integer> distances;

    public Tsp(int id, int numberOfCities, List<Integer> distances) {
        this.id = id;
        this.numberOfCities = numberOfCities;
        this.distances = distances;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfCities() {
        return numberOfCities;
    }

    public void setNumberOfCities(int numberOfCities) {
        this.numberOfCities = numberOfCities;
    }

    public List<Integer> getDistances() {
        return distances;
    }

    public void setDistances(List<Integer> distances) {
        this.distances = distances;
    }

    @Override
    public String toString() {
        return "TSP{" +
                "id=" + id +
                ", numberOfCities=" + numberOfCities +
                ", distances=" + distances +
                '}';
    }
}
