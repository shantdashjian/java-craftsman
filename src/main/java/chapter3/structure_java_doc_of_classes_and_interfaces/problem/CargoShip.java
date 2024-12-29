package chapter3.structure_java_doc_of_classes_and_interfaces.problem;

import java.util.Queue;
import java.util.Stack;
/**
 * This class represents a cargo ship.
 * It can unload a {@link Stack} of supplies, load a {@link Queue} of
 * supplies, and it can show the remainingCapacity as a long.
 */
public interface CargoShip {
    Stack<Supply> unload();
    Queue<Supply> load(Queue<Supply> supplies);
    int getRemainingCapacity();
}
