package chapter3.replacecommentswithutilitymethods.problem;

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
        // round to integer percent
        return Math.toIntExact(Math.round(averageFuel * 100));
    }
}
