package chapter2.avoidcollectionmodificationduringiteration.problem;

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
