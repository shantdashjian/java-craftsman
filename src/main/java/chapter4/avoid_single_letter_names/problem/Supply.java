package chapter4.avoid_single_letter_names.problem;

public class Supply {
    Supply(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    String name;

    int compareTo(Supply supply) {
        return 0;
    }
}
