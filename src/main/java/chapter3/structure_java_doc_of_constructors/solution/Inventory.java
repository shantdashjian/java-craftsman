package chapter3.structure_java_doc_of_constructors.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inventory {

    List<Supply> supplies;

    /**
     * Creates an empty inventory.
     *
     * @see Inventory#Inventory(Collection) instantiate with initial supplies
     */
    Inventory() {
        this(new ArrayList<>());
    }

    /**
     * Creates an inventory with an initial shipment of supplies.
     *
     * @param initialSupplies Initial supplies.
     *                        Must not be null, can be empty.
     * @throws NullPointerException if initialSupplies is null
     * @see Inventory#Inventory() instantiate with no supplies
     */
    Inventory(Collection<Supply> initialSupplies) {
        this.supplies = new ArrayList<>(initialSupplies);
    }
}
