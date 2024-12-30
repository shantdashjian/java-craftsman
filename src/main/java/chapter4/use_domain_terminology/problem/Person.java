package chapter4.use_domain_terminology.problem;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {
    String lastName;
    String role;
    int travels;
    LocalDate employedSince;

    String serializeAsLine() {
        return String.join(",",
                Arrays.asList(lastName,
                        role,
                        String.valueOf(travels),
                        String.valueOf(employedSince))
        );
    }
}
