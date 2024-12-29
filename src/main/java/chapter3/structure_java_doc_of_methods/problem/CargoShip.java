package chapter3.structure_java_doc_of_methods.problem;

import java.util.Queue;
import java.util.Stack;

public interface CargoShip {

    Stack<Supply> unload();

    /**
     * Loads {@link Supply}.
     *
     * @param supplies the supplies of type {@link Queue}
     * @return not loaded supplies of type {@link Queue}
     */
    Queue<Supply> load(Queue<Supply> supplies);

    int getRemainingCapacity();
}
