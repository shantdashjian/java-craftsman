package chapter3.structure_java_doc_of_constructors.problem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inventory {

    List<Supply> supplies;

    /**
     * Constructor for a new Inventory.
     */
    Inventory() {
        this(new ArrayList<>());
    }

    /**
     * Another Constructor for a new Inventory.
     *
     * It is possible to add some supplies to the Inventory.
     */
    Inventory(Collection<Supply> initialSupplies) {
        this.supplies = new ArrayList<>(initialSupplies);
    }
}
