package chapter4.use_domain_terminology.solution;

import java.time.LocalDate;
import java.util.Arrays;

public class Astronaut {
    String tagName;
    String rank;
    int missions;
    LocalDate activeDutySince;

    String toCSV() {
        return String.join(",",
                Arrays.asList(tagName,
                        rank,
                        String.valueOf(missions),
                        String.valueOf(activeDutySince))
        );
    }
}
