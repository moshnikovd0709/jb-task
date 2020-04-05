import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int amountTrains = in.nextInt();
                List<Train> trains = new ArrayList<>();
                for (int i = 0; i < amountTrains; i++) {
                    Train train = new Train(in.nextInt(), in.nextDouble(), in.nextDouble(), in.nextLong());
                    trains.add(train);
                }
            } catch (InputMismatchException e) {
                System.out.print("Please read instruction how use program" + e.getMessage());
            }
    }
}
