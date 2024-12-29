package chapter1.return_boolean_expressions_directly.solution;

public class Astronaut {
    String name;
    int missions;

    boolean isValid() {
        return missions >= 0 && name != null && !name.trim().isEmpty();
    }
}
