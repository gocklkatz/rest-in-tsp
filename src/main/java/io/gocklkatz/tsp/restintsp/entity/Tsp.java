package io.gocklkatz.tsp.restintsp.entity;

import java.util.List;

public class Tsp {
    private int id;
    private int numberOfCities;
    private List<Integer> distances;
    private int cost;
    private String tour;

    public Tsp(int id, int numberOfCities, List<Integer> distances) {
        this.id = id;
        this.numberOfCities = numberOfCities;
        this.distances = distances;
    }

    public void solve(){
        cost = 4;
        tour = "ABCD";
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "Tsp{" +
                "id=" + id +
                ", numberOfCities=" + numberOfCities +
                ", distances=" + distances +
                ", cost=" + cost +
                ", tour='" + tour + '\'' +
                '}';
    }
}
