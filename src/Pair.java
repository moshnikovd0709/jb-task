public class Pair implements Comparable<Pair> {
    Double time;
    int number;
    boolean beginStop;

    public Pair(Double time, int number, boolean beginStop) {
        this.time = time;
        this.number = number;
        this.beginStop = beginStop;
    }

    @Override
    public int compareTo(Pair o) {
        return Double.compare(this.time, o.time);
    }
}

