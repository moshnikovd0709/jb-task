package main;

import java.util.ArrayList;
import java.util.List;

public class Realization {

    private static List sort(List<Pair> times) {
        times.sort(Pair::compareTo);
        for (int i = 0; i < times.size(); i++) {
            times.get(i).index = i;
        }
        return times;
    }

    private static Long dynamicAlgorithm(List<Pair> times) {
        Long dp[] = new Long[times.size()];
        dp[0] = 0L;
        for (int i = 1; i < dp.length; i++) {
            if(times.get(i).beginTime == null) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = Math.max(dp[i - 1], dp[times.get(i).beginTime.index] + times.get(i).cost);
            }
        }
        return dp[times.size()- 1];
    }

    public static Long solve(List<Train> trains) {
        List<Pair> times = new ArrayList<>();
        for (Train train : trains) {
            Pair beginStation = new Pair(train.getArrivalTime(), train.getCost(), train.getNumber(), null, 0);
            Pair endStation = new Pair(train.getDepartureTime(), train.getCost(), train.getNumber(), beginStation, 0);
            times.add(beginStation);
            times.add(endStation);
        }
        sort(times);
        return dynamicAlgorithm(times);
    }
}
