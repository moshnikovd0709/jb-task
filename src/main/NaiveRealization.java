package main;

import java.util.ArrayList;
import java.util.List;

public class NaiveRealization {

    private static Long answer = Long.MIN_VALUE;

    private static boolean checkAnswer(List<Train> trains) {
        boolean isCorrect = true;
        loop:
        for (int j = 1; j < trains.size(); j++) {
            Train curTrain = trains.get(j);
            for (Train train : trains) {
                if (curTrain.getNumber() == train.getNumber()) {
                    continue;
                } else {
                    if (train.getArrivalTime() <= curTrain.getArrivalTime() && train.getDepartureTime() >= curTrain.getArrivalTime()) {
                        isCorrect = false;
                        break loop;
                    } else if (train.getArrivalTime() <= curTrain.getDepartureTime() && train.getDepartureTime() >= curTrain.getDepartureTime()) {
                        isCorrect = false;
                        break loop;
                    }
                }
            }
        }
        return isCorrect;
    }

    public static Long solve(Train... trains) {
        for (int i = 1; i < Math.pow(2, trains.length); i++) {
            List<Train> trainsCombinations = new ArrayList();
            String x = Integer.toBinaryString(i);
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) == '1') {
                    trainsCombinations.add(trains[j]);
                }
            }
            Long cur = 0L;
            if (checkAnswer(trainsCombinations)) {
                for (Train train : trains) {
                    cur += train.getCost();
                }
                answer = Math.max(cur, answer);
            }
        }
        return answer;
    }
}
