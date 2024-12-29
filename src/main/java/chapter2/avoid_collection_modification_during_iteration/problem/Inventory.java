package chapter2.avoid_collection_modification_during_iteration.problem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Supply> supplies = new ArrayList<>();

    void disposeContaminatedSupplies() {
        for (Supply supply : supplies) {
            if (supply.isContaminated()) {
                supplies.remove(supply);
            }
        }
    }
}
