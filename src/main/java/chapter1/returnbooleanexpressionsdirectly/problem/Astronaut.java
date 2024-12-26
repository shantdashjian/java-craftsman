package chapter1.returnbooleanexpressionsdirectly.problem;

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
