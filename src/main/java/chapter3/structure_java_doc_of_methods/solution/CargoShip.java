package chapter3.structure_java_doc_of_methods.solution;

import java.util.Queue;
import java.util.Stack;

public interface CargoShip {

    Stack<Supply> unload();

    /**
     * Loads supplies onto the cargo ship.
     *
     * <p>
     * Only lets you load as many supplies as there is remaining capacity.
     *
     * Example:
     * <pre>
     * int capacity = cargoShip.getRemainingCapacity(); // 1
     * Queue&lt;Supply> supplies = Arrays.asList(new Supply("Apple"));
     * Queue&lt;Supply> spareSupplies = cargoShip.load(supplies);
     * spareSupplies.isEmpty(); // true;
     * cargoShip.getRemainingCapacity() == 0; // true
     * </pre>
     *
     * @param supplies to be loaded; must not be null
     * @return supplies that could not be loaded because of too little
     *          capacity; is empty if everything has been loaded
     * @throws NullPointerException if supplies is null
     * @see CargoShip#getRemainingCapacity() check capacity
     * @see CargoShip#unload() unload the supplies
     */
    Queue<Supply> load(Queue<Supply> supplies);

    int getRemainingCapacity();
}
