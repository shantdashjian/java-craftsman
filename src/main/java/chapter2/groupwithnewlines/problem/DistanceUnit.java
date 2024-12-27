package chapter2.groupwithnewlines.problem;

public enum DistanceUnit {

    MILES, KILOMETERS;

    static final double MILES_IN_KILOMETERS = 1.60934;
    static final int IDENTITY = 1;
    static final double KILOMETERS_IN_MILES = 1 / MILES_IN_KILOMETERS;

    double getConversationRate(DistanceUnit unit) {
        if (this == unit) {
            return IDENTITY;
        }
        if (this == MILES && unit == KILOMETERS) {
            return MILES_IN_KILOMETERS;
        } else {
            return KILOMETERS_IN_MILES;
        }
    }
}
