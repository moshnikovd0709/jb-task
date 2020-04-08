package main;

public class Pair implements Comparable<Pair> {
    Double time;
    int cost;
    int number;
    Pair beginTime;
    int index;

    public Pair(Double time, int cost, int number, Pair beginTime, int index) {
        this.time = time;
        this.cost = cost;
        this.number = number;
        this.beginTime = beginTime;
        this.index = index;
    }

    @Override
    public int compareTo(Pair o) {
        return Double.compare(this.time, o.time);
    }
}

