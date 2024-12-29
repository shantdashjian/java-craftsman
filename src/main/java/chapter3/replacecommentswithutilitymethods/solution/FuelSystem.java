package chapter3.replacecommentswithutilitymethods.solution;

import java.util.ArrayList;
import java.util.List;

public class FuelSystem {

    List<Double> tanks = new ArrayList<>();

    int getAverageTankFillingPercent() {
        double sum = 0;
        for (double tankFilling : tanks) {
            sum += tankFilling;
        }
        double averageFuel = sum / tanks.size();
        return roundToIntegerPercent(averageFuel);
    }

    private static int roundToIntegerPercent(double averageFuel) {
        return Math.toIntExact(Math.round(averageFuel * 100));
    }
}
