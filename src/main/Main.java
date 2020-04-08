package main;

import java.util.*;

import static main.Realization.solve;


public class Main {

    public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                List<Train> trains = new ArrayList<>();
                while (in.hasNext()) {
                    trains.add(new Train(in.nextInt(), in.nextDouble(), in.nextDouble(), in.nextInt()));
                }
                System.out.print(solve(trains));
            } catch (InputMismatchException e) {
                System.out.print("Please read instruction how to use program");
            }
    }
}
