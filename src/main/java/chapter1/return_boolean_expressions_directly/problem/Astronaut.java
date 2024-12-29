package chapter1.return_boolean_expressions_directly.problem;

public class Astronaut {
    String name;
    int missions;

    boolean isValid() {
        if (missions < 0 || name == null || name.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
