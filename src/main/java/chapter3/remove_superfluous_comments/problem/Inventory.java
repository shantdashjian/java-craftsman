package chapter3.remove_superfluous_comments.problem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    // Fields (we only have one)
    List<Supply> supplies = new ArrayList<>();

    // Methods
    int countContaminatedSupplies() {
        // TODO: check if field is already initialized (not null)

        int cotaminatedCounter = 0; // the counter
        // No supplies => no contamination
        for (Supply supply : supplies) { // begin FOR
            if (supply.isContaminated()) {
                cotaminatedCounter++; // increment counter!
            } // End IF supply is contaminated
        } // End FOR

        // Return the number of contaminated supplies.
        return cotaminatedCounter; // Handle with care!
    }
} // End of Inventory class
