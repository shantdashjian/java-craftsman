package chapter3.structure_java_doc_of_classes_and_interfaces.solution;

import java.util.Queue;
import java.util.Stack;
/**
 * A cargo ship can load and unload supplies according to its capacity.
 *
 * <p>
 * Supplies are loaded sequentially and can be unloaded in LIFO
 * (last-in-first-out) order. The cargo ship can only store supplies up to
 * its capacity. Its capacity is never negative.
 */
public interface CargoShip {
    Stack<Supply> unload();
    Queue<Supply> load(Queue<Supply> supplies);
    int getRemainingCapacity();
}
