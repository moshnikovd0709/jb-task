package main;

public class Train {
    private int number;
    private Double arrivalTime;
    private Double departureTime;
    private int cost;

    public Train(int number, Double arrivalTime, Double departureTime, int cost) {
        this.number = number;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public Double getArrivalTime() {
        return arrivalTime;
    }

    public Double getDepartureTime() {
        return departureTime;
    }

    public int getCost() {
        return cost;
    }
}
