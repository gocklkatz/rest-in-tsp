package io.gocklkatz.tsp.restintsp.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Solver {
    private static final Logger log = LoggerFactory.getLogger(Solver.class);

    private int numberOfCities;
    private int[][] distanceMatrix;
    private String tour;
    private int cost = Integer.MAX_VALUE;

    public Solver(int numberOfCities, int[][] distanceMatrix) {
        this.numberOfCities = numberOfCities;
        this.distanceMatrix = distanceMatrix;
    }

    public void solve() {
        //Permutationen generieren
        String str = "";
        for (int i = 1; i < numberOfCities; i++) {
            str += i;
        }

        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);
        List<String> tours = permutation.getTours();

        //Kosten errechnen
        for(String tour:tours) {
            log.debug("Tour: "+tour);
            int tmpCost = 0;
            int prev = 0;
            for (int i = 0; i < tour.length(); i++) {
                log.debug("Leg: "+prev+";"+Character.getNumericValue(tour.charAt(i))+";"+distanceMatrix[prev][Character.getNumericValue(tour.charAt(i))]);
                tmpCost += distanceMatrix[prev][Character.getNumericValue(tour.charAt(i))];
                prev = Character.getNumericValue(tour.charAt(i));
            }
            log.debug("Leg: "+prev+";0;"+distanceMatrix[prev][0]);
            tmpCost += distanceMatrix[prev][0];
            log.debug("Total: "+tmpCost);

            if(tmpCost<cost) {
                cost = tmpCost;
                this.tour = "0"+tour+"0";
            }
        }
    }

    public String getTour() {
        return tour;
    }

    public int getCost() {
        return cost;
    }
}
