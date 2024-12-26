package chapter1.returnbooleanexpressionsdirectly.solution;

public class Astronaut {
    String name;
    int missions;

    boolean isValid() {
        return missions >= 0 && name != null && !name.trim().isEmpty();
    }
}
