import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class realization {

    private final List<Pair> times = new ArrayList<>();


    public List sort(List<Train> trains) {
        for (Train train : trains) {
            times.add(new Pair(train.getArrivalTime(), train.getNumber(), true));
            times.add(new Pair(train.getDepartureTime(), train.getNumber(), false));
        }
        times.sort(Pair::compareTo);
        return times;
    }

    public Long dinamicAlgorithm() {
        Long dp[] = new Long[times.size()];
        for (int i = 1; i < dp.length; i++) {
            if(times.get(i).beginStop) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[0];
    }

}
