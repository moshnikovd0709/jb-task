package test;

import main.NaiveRealization;
import main.Realization;
import main.Train;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;


public class RealizationTest {

    @Test
    public void testAll() {
        Train train1 = new Train(1, 2.3, 3.4,10);
        Train train2 = new Train(2, 3.0, 5.0,20);
        Train train3 = new Train(3, 4.0, 5.5,15);
        Train train4 = new Train(4, 1.0, 7.0,20);
        Train train5 = new Train(5, 3.3, 3.4,15);
        Train train6 = new Train(6, 3.6, 5.9,30);
        Train train7 = new Train(7, 8.0, 9.5,25);
        Train train8 = new Train(8, 8.8, 9.0,15);
        Train train9 = new Train(9, 3.3, 10.4,40);
        Train train10 = new Train(10, 9.8, 11.0,45);
        test(25L, train1, train2, train3, train4);
        test(40L, train3, train8, train9, train4);
        test(45L, train1, train2, train3, train4, train5, train6);
        test(105L, train6, train2, train5, train4, train10, train8);
        test(115L, train9, train2, train8, train4, train5, train6, train7, train10);
        test(115L, train1, train2, train3, train4, train5, train6, train7, train8, train9, train10);
    }

    public void test(Long expected, Train... trains) {
        Assert.assertEquals(expected, Realization.solve(Arrays.stream(trains).collect(Collectors.toList())));
    }
}