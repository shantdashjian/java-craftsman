package chapter3.remove_superfluous_comments.solution;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Supply> supplies = new ArrayList<>();

    int countContaminatedSupplies() {
        if (supplies == null || supplies.isEmpty()) {
            // No supplies => no contamination
            return 0;
        }

        int cotaminatedCounter = 0;
        for (Supply supply : supplies) {
            if (supply.isContaminated()) {
                cotaminatedCounter++;
            }
        }

        return cotaminatedCounter;
    }
}
