package io.gocklkatz.tsp.restintsp.entity;

import java.util.List;

public class Tsp {
    private int id;
    private int numberOfCities;
    private int[][] distanceMatrix;
    private int cost;
    private String tour;

    public Tsp(int id, int numberOfCities, int[][] distanceMatrix) {
        this.id = id;
        this.numberOfCities = numberOfCities;
        this.distanceMatrix = distanceMatrix;
    }

    public void solve(){
        Solver solver = new Solver(numberOfCities, distanceMatrix);
        solver.solve();
        tour = solver.getTour();
        cost = solver.getCost();
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

    public int[][] getDistanceMatrix() {
        return distanceMatrix;
    }

    public void setDistanceMatrix(int[][] distanceMatrix) {
        this.distanceMatrix = distanceMatrix;
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
                ", distances=" + distanceMatrix +
                ", cost=" + cost +
                ", tour='" + tour + '\'' +
                '}';
    }
}
